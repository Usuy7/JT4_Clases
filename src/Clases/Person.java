package Clases;

/**
 *
 * @author AlumMati
 */
public class Person {
    
    private String name;
    private int age;
    private int phone;
    
    public Person () {}
    
    public Person (String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    public void print (){
        System.out.println("My name is: " + name);
        System.out.println("I'm: " + age);
        System.out.println("My number phone is: " + phone);
    }
}
