package Clases;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Student_Ex {

    public Student_Ex() {
        Scanner tec = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = tec.nextLine();
        System.out.print("Enter the age: ");
        int age = tec.nextInt();
        Student student1 = new Student (name, age);
        student1.print();
    }

    public static void main(String[] args) {
        new Student_Ex();
    }
}
