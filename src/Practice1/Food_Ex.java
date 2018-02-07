package Practice1;

import static Practice1.Company.tec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Javier
 */

/*
Crear una aplicación en la que se solicite al usuario los datos de un alimento, 
se genere un objeto de la clase Alimento y se muestren los datos del alimento, 
el contenido energético, si es dietético y recomendable para deportistas. 
 */
public class Food_Ex {

    public Food_Ex() throws IOException {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

        double suma = 0;
        
        System.out.println("***FOOD DATA***");

        System.out.print("Name: ");
        String name = tec.readLine();
        
        System.out.print("Weight: ");
        double weight = Double.parseDouble(tec.readLine());

        System.out.print("Lipids: ");
        double lipids = Double.parseDouble(tec.readLine());
        average(lipids);

        System.out.print("Carbohydrates: ");
        double carbohydrates = Double.parseDouble(tec.readLine());
        average(carbohydrates);

        System.out.print("Proteins: ");
        double proteins = Double.parseDouble(tec.readLine());
        average(proteins);

        System.out.print("Animal Origin (Y) or (N): ");
        char id = tec.readLine().charAt(0);
        id = Character.toUpperCase(id);
        while (id != 'Y' && id != 'N') {
            System.out.print("NOPEEE, fail dummy: ");
            id = tec.readLine().charAt(0);
        }
        boolean origin = false;
        if (id == 'Y') {
            origin = true;
        }

        System.out.print("Vitamins: (A) (M) (B): ");
        char vitamins = tec.readLine().charAt(0);
        vitamins = Character.toUpperCase(vitamins);
        while (vitamins != 'A' && vitamins != 'M' && vitamins != 'B') {
            System.out.print("You have FAILED brat: ");
            vitamins = tec.readLine().charAt(0);
        }

        System.out.print("Minerals: (A) (M) (B): ");
        char minerals = tec.readLine().charAt(0);
        minerals = Character.toUpperCase(minerals);
        while (minerals != 'A' && minerals != 'M' && minerals != 'B') {
            System.out.print("You have FAILED brat: ");
            minerals = tec.readLine().charAt(0);
        }

        Food food1 = new Food(name, weight, lipids, carbohydrates, proteins, origin, vitamins, minerals);
        System.out.println(food1.toString());

    }

    public final void suma(double lipids, double carbohydrates, double proteins) throws IOException{
        double suma = lipids + carbohydrates + proteins;      
        while (suma > 100){
            System.out.println("The percentages do not fit correctly,  try again: ");
            System.out.print("L: "); lipids = Double.parseDouble(tec.readLine());
            System.out.print("C: "); carbohydrates = Double.parseDouble(tec.readLine());
            System.out.print("P: "); proteins = Double.parseDouble(tec.readLine());
        }
    }
    
    public final void average(double num) throws IOException {
    
        while (num <= 0 || num >= 100){
            System.out.print("Invalid value: ");
            num = Double.parseDouble(tec.readLine());
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Food_Ex();
    }
}
