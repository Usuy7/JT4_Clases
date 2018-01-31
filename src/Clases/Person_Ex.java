package Clases;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Person_Ex {

    public Person_Ex() {
        Scanner tec = new Scanner (System.in);
        System.out.print("Enter the name: ");
        String name = tec.nextLine();
        System.out.print("Enter the age: ");
        int age = tec.nextInt();
        System.out.print("Enter the phone: ");
        int phone = tec.nextInt();
        Person person1 = new Person(name, age, phone);
        person1.print();
    }
     
    public static void main(String[] args) {
        new Person_Ex();
    }
}
