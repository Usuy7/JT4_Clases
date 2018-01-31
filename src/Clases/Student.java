package Clases;

/**
 *
 * @author AlumMati
 */
public class Student {

    public String name;
    public int age;

    Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("My name is: " + name);
        System.out.println("I'm: " + age);
    }
}
