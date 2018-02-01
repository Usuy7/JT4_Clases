package Practice1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Check {

    static Scanner tec = new Scanner(System.in);
    static int num;
    static int opc;
    static String answer;

    public Check() {}

    public Check(int number) {
        this.num = number;
    }

    public static void Start() {

        do {
            System.out.print("***Menu***\n" + "1.Prime\n" + "2.Older\n" + "3.Par\n" + "4.Interval\n" + "5.Leap\n"
                    + "6.Symmetrical\n" + "7.Capicua\n" + "8.Exit\n" + "Choose an opcion: ");
            opc = tec.nextInt();
            Validate(opc);
            Menu(opc);
        } while (opc != 8);
    }

    public static void Validate(int opc) {

        while (opc < 0 || opc > 8) {
            System.out.println("Fail you dummy, try again: ");
            opc = tec.nextInt();
        }
    }

    public static void Menu(int opc) {
        switch (opc) {
            case 1:
                Prime(num);
                break;
            case 2:
                Older(num);
                break;
            case 3:
                Par(num);
                break;
            case 4:
                Interval(num);
                break;
            case 5:
                Leap(num);
                break;
            case 6:
                Symmetrical(num);
                break;
            case 7:
                Capicua(num);
                break;
        }
    }

    public static void Return() {
        System.out.println("Do you want to go back to the previous menu?");
        do {
            answer = tec.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                Start();
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Bye Bye");
                System.exit(0);
            }
        } while (!answer.equalsIgnoreCase("yes") || !answer.equalsIgnoreCase("no"));
    }

    public static void Prime(int num) {
        int contador = 2;
        boolean prime = true;
        while ((prime) && (num != contador)) {
            if (num % contador == 0) {
                prime = false;
            }
            contador++;
        }
        if (prime == true) System.out.println("It's prime");
        else System.out.println("It is not prime");
        Return();
    }

    public static void Older(int num) {
        if (num < 1900) System.out.println("It's lower");
        else if (num > 1900) System.out.println("It's higher");
        Return();
    }

    public static void Par(int num) {
        if (num % 2 == 0) System.out.println("It's par");
        else System.out.println("It is not par");
        Return();
    }

    public static int Interval(int num) {

        int bot;
        int top;

        return 0;
    }

    public static String Leap(int num) {
        return null;
    }

    public static String Symmetrical(int num) {
        return null;
    }

    public static String Capicua(int num) {
        return null;
    }
}
