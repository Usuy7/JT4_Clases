package Practice1;

import java.util.Scanner;

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

    public Food_Ex() {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("***FOOD DATA***");
        
        System.out.print("Name: ");
        String name = tec.nextLine();
        
        System.out.print("Lipids: ");
        double lipids = tec.nextDouble();
        
        System.out.print("Carbohydrates: ");
        double carbohydrates = tec.nextDouble();
        
        System.out.print("Proteins: ");
        double proteins = tec.nextDouble();
        
        System.out.print("Animal origin? (Yes) or (No): ");
        boolean origin = false;
        
        System.out.print("Vitamins: (A) (M) (B)");
        char vitamins = tec.nextLine().charAt(0);
        vitamins = Character.toUpperCase(vitamins);
        while (vitamins != 'A' || vitamins != 'M' || vitamins != 'B'){
            System.out.print("You have FAILED brat: ");
            vitamins = tec.nextLine().charAt(0);
        }
        
        System.out.print("Minerals: (A) (M) (B)");
        char minerals = tec.nextLine().charAt(0);
        minerals = Character.toUpperCase(minerals);
        while (minerals != 'A' || minerals != 'M' || minerals != 'B'){
            System.out.print("You have FAILED brat: ");
            minerals = tec.nextLine().charAt(0);
        }
        
        Food food1 = new Food(name, lipids, carbohydrates, proteins, origin, vitamins, minerals);
        food1.toString();
    }

    public static void main(String[] args) {
        new Food_Ex();
    }
}
