package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Javier
 */
public class Company {

    static BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    static Worker company[] = new Worker[10];

    public Company() throws IOException {
        Start();
    }

    public void Start() throws IOException {
        int opc;
        do {
            System.out.print("***COMPANY MENU***\n" + "1.Workers's List\n" + "2.Add worker\n"
                    + "3.Delete worker\n" + "4.Increase salary\n" + "5.Exit\n" + "Choose an opcion: ");
            opc = Integer.parseInt(tec.readLine());
            Validate(opc);
            Menu(opc);
        } while (opc != 5);
    }

    public void Validate(int opc) throws IOException {

        while (opc < 1 || opc > 5) {
            System.out.println("Fail you dummy, try again: ");
            opc = Integer.parseInt(tec.readLine());
            Validate(opc);
            Menu(opc);
        }
    }

    public void Menu(int opc) throws IOException {
        switch (opc) {
            case 1:
                List();
                break;
            case 2:
                Add();
                break;
            case 3:
                Delete();
                break;
            case 4:
                Increase();
                break;
            case 5:
                System.out.println("Bye Bye");
                System.exit(0);
        }
    }

    public void List() {
        Worker company_ordered[] = company.clone();
        Order(company_ordered); // ordenamos el array por antigüedad
        System.out.println("\n***Workers's List***");
        for (int i = 0; i < company_ordered.length  && company_ordered[i] != null; i++) {
            System.out.println("\nWorker nº: " + (i + 1));
            System.out.print(company_ordered[i].toString());
        }
        System.out.println("\n********************\n");
    }

    public void Order(Worker company_ordered[]) {   
        Worker aux;
        for (int i = 0; i < company_ordered.length - 1 && company_ordered[i] != null; i++) {
            for (int j = i + 1; j < company_ordered.length && company_ordered[j] != null; j++) {
                if (company_ordered[i].getYear_income() > company_ordered[j].getYear_income()) {
                    aux = company_ordered[i];
                    company_ordered[i] = company_ordered[j];
                    company_ordered[j] = aux;
                }
            }
        }
    }

    public void Add() throws IOException {
        System.out.println("\n********************");
        System.out.print("Name: ");
        String name = tec.readLine();

        System.out.print("Id: ");
        String id = tec.readLine();

        System.out.print("Civil Status (Single(S) / Married(M) / Divorced (D) / Widower (W)): ");
        char civil_status = tec.readLine().charAt(0);
        civil_status = Character.toUpperCase(civil_status);
        
        while (civil_status != 'S' && civil_status != 'M' && civil_status != 'D' && civil_status != 'W'){
            System.out.println("You have FAILED brat: ");
            civil_status = tec.readLine().charAt(0);
        }

        System.out.print("Year of income: ");
        int year_income = Integer.parseInt(tec.readLine());

        System.out.print("Annual Salary: ");
        int annual_salary = Integer.parseInt(tec.readLine());
        
        System.out.println("********************");
        Worker w1 = new Worker(name, id, civil_status, year_income, annual_salary);

        int pos = 0;
        for (pos = 0; pos < company.length && company[pos] != null; pos++) {
            // saldra cuando encuentré el primer nullo, la posicion quedara guardada en i
        }
        company[pos] = w1;
        System.out.println("Worker added");
        System.out.println("********************\n********************");
    }

    public void Delete() throws IOException {
        System.out.print("\nEnter the ID of the worker to be deleted: ");
        String id = tec.readLine();

        for (int i = 0; i < company.length && company[i] != null; i++) {
            if (company[i].getId().equals(id)) {
                for (int j = i; j < company.length - 1; j++) {
                    company[j] = company[j + 1];
                }
            } else {
                System.out.print("No worker has been found with this ID, try again: ");
                id = tec.readLine();
            }
        }
        System.out.println("\nThe worker has been deleted");
        System.out.println("*****************************\n");
    }

    public void Increase() throws IOException {
        System.out.print("Enter the ID of the worker to be modified: ");
        String id = tec.readLine();

        for (int i = 0; i < company.length && company[i] != null; i++) {
            if (company[i].getId().equals(id) == false) {
                System.out.print("No worker has been found with this ID, try again: ");
                id = tec.readLine();
            }
        }

        System.out.print("Enter the percentage of increase: ");
        int more = Integer.parseInt(tec.readLine());

        for (int i = 0; i < company.length && company[i] != null; i++) {
            int sum = (more * company[i].getAnnual_salary()) / 100;
            company[i].setAnnual_salary(company[i].getAnnual_salary() + sum);
        }
        System.out.println("Completed increase\n");
    }

    public static void main(String[] args) throws IOException {
        new Company();
    }
}
