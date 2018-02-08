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
        Average(lipids); // compruebo que el valor del porcentaje este entre 0 y 100%

        System.out.print("Carbohydrates: ");
        double carbohydrates = Double.parseDouble(tec.readLine());
        Average(carbohydrates); // compruebo que el valor del porcentaje este entre 0 y 100%

        System.out.print("Proteins: ");
        double proteins = Double.parseDouble(tec.readLine());
        Average(proteins); // compruebo que el valor del porcentaje este entre 0 y 100%
        Sum(lipids, carbohydrates, proteins); // compruebo que los porcentajes encajan
        
        System.out.print("Animal Origin (Y) or (N): ");
        char animal = tec.readLine().charAt(0);
        animal = Character.toUpperCase(animal); // convierto a mayúsculas el carácter
        Animal(animal); // me aseguro de que el carácter proporcionado cumple los estándares
        
        boolean origin = false; // asigno un resultado según la respuesta del usuario
        if (animal == 'Y') origin = true;
        
        System.out.print("Vitamins: (A) (M) (B): ");
        char vitamins = tec.readLine().charAt(0);
        vitamins = Character.toUpperCase(vitamins); // convierto a mayúsculas el carácter
        Vitamins(vitamins); // me aseguro de que el carácter proporcionado cumple los estándares

        System.out.print("Minerals: (A) (M) (B): ");
        char minerals = tec.readLine().charAt(0);
        minerals = Character.toUpperCase(minerals); // convierto a mayúsculas el carácter
        Minerals(minerals); // me aseguro de que el carácter proporcionado cumple los estándares

        Food food1 = new Food(name, weight, lipids, carbohydrates, proteins, origin, vitamins, minerals);
        System.out.println(food1.toString());

    }
    
    public final void Minerals(char minerals) throws IOException{
        while (minerals != 'A' && minerals != 'M' && minerals != 'B') {
            System.out.print("You have FAILED brat: ");
            minerals = tec.readLine().charAt(0);
        }
    }
    
    public final void Vitamins(char vitamins) throws IOException{
        while (vitamins != 'A' && vitamins != 'M' && vitamins != 'B') {
            System.out.print("You have FAILED brat: ");
            vitamins = tec.readLine().charAt(0);
        }
    }
    
    public final void Animal(char animal) throws IOException{
        while (animal != 'Y' && animal != 'N') {
            System.out.print("NOPEEE, fail dummy: ");
            animal = tec.readLine().charAt(0);
        }
    }
    
    public final void Sum(double lipids, double carbohydrates, double proteins) throws IOException{
        double suma = lipids + carbohydrates + proteins;      
        while (suma > 100){
            System.out.println("\nThe percentages do not fit correctly,  try again: ");
            System.out.print("L: "); lipids = Double.parseDouble(tec.readLine());
            System.out.print("C: "); carbohydrates = Double.parseDouble(tec.readLine());
            System.out.print("P: "); proteins = Double.parseDouble(tec.readLine());
            suma = lipids + carbohydrates + proteins;
        }
    }
    
    public final void Average(double num) throws IOException {
    
        while (num <= 0 || num >= 100){
            System.out.print("Invalid value: ");
            num = Double.parseDouble(tec.readLine());
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Food_Ex();
    }
}
