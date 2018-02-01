package Practice1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Check {
    static Scanner tec = new Scanner (System.in);
    static private int num;
    
    public Check (){}
    
    public Check (int number) {
        this.num = number;
    }
    
    public void print(){
        System.out.print("***Menu***\n" + "1.Prime\n" + "2.Older\n" + "3.Par\n"
        + "4.Interval\n" + "5.Leap\n" + "6.Symmetrical\n" + "7.Capicua\n" + "Choose an opcion: ");
        num = tec.nextInt();
    }
    
    public static int Prime (int num){
        return 0;
    }
    
    public static int Older (int num){
        return 0;
    }
    
    public static int Par (int num){
        return 0;
    }
    
    public static int Interval (int num, int bot, int top){
        return 0;
    }
    
    public static int Leap (int num){
        return 0;
    }
    
    public static int Symmetrical (int num){
        return 0;
    }
    
    public static int Capicua (int num){
        return 0;
    }
}
