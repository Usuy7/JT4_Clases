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
    static int opc;

    public Company() throws IOException {
        Start();
    }

    public void Start() throws IOException {

        do {
            System.out.print("***COMPANY MENU***\n" + "1.List of workers\n" + "2.Add worker\n"
                    + "3.Search worker\n" + "4.Increase salary\n" + "5.Exit\n" + "Choose an opcion: ");
            opc = Integer.parseInt(tec.readLine());
            Validate(opc);
            Menu(opc);
        } while (opc != 5);
    }

    public static void Validate(int opc) throws IOException {

        while (opc < 0 || opc > 5) {
            System.out.println("Fail you dummy, try again: ");
            opc = Integer.parseInt(tec.readLine());
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

                break;
            case 4:

                break;
            case 5:
                System.out.println("Bye Bye");
                System.exit(0);
        }
    }

    public void List() {
        System.out.println("***Workers's List***");
        for (int i = 0; i < company.length && company[i] != null; i++) {
            System.out.println("Worker nº: " + (i + 1));
            System.out.println(company[i].toString());
        }
    }
    
    public void Add() throws IOException{
        System.out.print("Name: ");
        String name = tec.readLine();

        System.out.print("DNI: ");
        String dni = tec.readLine();

        System.out.print("Civil Status: ");
        char civil_status = 0;
        
        System.out.print("Year of income: ");
        int year_income = Integer.parseInt(tec.readLine());

        System.out.print("Annual Salary: ");
        int annual_salary = Integer.parseInt(tec.readLine());

        System.out.println("");

        Worker w = new Worker (name, dni, civil_status, year_income, annual_salary);

        System.out.println("Worker added");
    }

    public static void main(String[] args) throws IOException {
        new Company();
    }
}
