package Practice1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Realiza  una aplicación (VerComprue ) que solicite un entero al usuario y utilice los métodos de la clase Comprueba.
*/

public class Check_Ex {
    
    public Check_Ex() {
        Scanner tec = new Scanner (System.in);
        System.out.print("Enter a whole number: ");
        int num = tec.nextInt();
        Check check1 = new Check (num);
        check1.print();
    }
    
    public static void main(String[] args) {
        new Check_Ex();
    }
}
