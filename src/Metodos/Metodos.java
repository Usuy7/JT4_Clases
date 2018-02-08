package Metodos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Metodos {

    static Scanner tec = new Scanner(System.in);

    public static int MayorCero(int num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextInt();
        }
        return num;
    }

    public static long MayorCero(long num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextLong();
        }
        return num;
    }

    public static float MayorCero(float num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextFloat();
        }
        return num;
    }

    public static double MayorCero(double num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextDouble();
        }
        return num;
    }

    public static boolean esPrimo(int num) {

        int contador = 2;
        boolean primo = true;

        while ((primo) && (num != contador)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static boolean esPerfecto(int num) {

        int suma = 0;
        boolean perfecto = false;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        if (num == suma) {
            perfecto = true;
        } else {
            perfecto = false;
        }
        return perfecto;
    }

    public static int SumaDivisores(int num) {

        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int CuantasCifras(int num) {

        int contador = 0;

        while (num != 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El número tiene: " + contador + " cifras");

        return contador;
    }

    public static String DescomponerFP(int num) {

        int c = 2;
        String numbers = "";

        System.out.print(num + " = 1");

        if (num == 1) {
            System.out.print("1");
        } else {
            while (num != 1) {
                for (int i = 0; i <= num; i++) {
                    if (num % c == 0) {
                        numbers = numbers + " * " + Integer.toString(c);
                        num = num / c;
                    } else {
                        c++;
                    }
                }
            }
        }
        return numbers;
    }

    public static boolean esAlfaNumerica(String cadena) {

        cadena = cadena.toLowerCase();
        boolean result = false;

        for (int i = 0; i < cadena.length(); ++i) {

            char caracter = cadena.charAt(i);

            if (!Character.isLetterOrDigit(caracter)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static String test_esLetra(String cadena) throws IOException {

        boolean val = false;

        do {

            while (cadena.equals("")) {
                System.out.print("Ingresa algún dato: ");
                cadena = tec.nextLine();
            }

            for (int i = 0; i < cadena.length(); i++) {

                val = true;

                if (!Character.isLetter(cadena.charAt(i))) {
                    val = false;
                }
            }
            if (!val) {
                System.out.print("Error, ingresa solo carácteres alfabeticos: ");
                cadena = tec.nextLine();
            }
        } while (!val);

        return cadena;
    }

    public static String test_esNumber(String cadena) throws IOException {

        boolean val = false;

        cadena = cadena.toLowerCase();

        do {

            while (cadena.equals("")) {
                System.out.print("Ingresa algún dato: ");
                cadena = tec.nextLine();
            }

            for (int i = 0; i < cadena.length(); i++) {

                val = true;

                if (!Character.isDigit(cadena.charAt(i))) {
                    val = false;
                }
            }
            if (val == false) {
                System.out.print("Error, ingresa un número: ");
                cadena = tec.nextLine();
            }
        } while (!val);

        return cadena;
    }
    
    public static int CountWords(String sentence) {
        int cont = 0;
        boolean palabra = false;
        int finDeLinea = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {
            // Si el char es una letra y no es el final de la frase, word = true.
            if (Character.isLetter(sentence.charAt(i)) && i != finDeLinea) {
                palabra = true;

                // Si el char no es una letra y aún hay más letras, el contador continua.
            } else if (!Character.isLetter(sentence.charAt(i)) && palabra) {
                cont++;
                palabra = false;
                // si es la última palabra de la cadena; si no termina con una no letra ,
            } else if (Character.isLetter(sentence.charAt(i)) && i == finDeLinea) {
                cont++;
            }
        }
        return cont;
    }

    public static void print_N_Array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void print_S_Array(String array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void fillArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers();
        }
    }

    public static int randomNumbers() {
        return ((int) Math.floor(Math.random() * 99));
    }

    public static String search_Sequential(int[] array, int dato) {
        String posicion = "";
        for (int i = 0; i < array.length; i++) {    //recorremos todo el array
            if (array[i] == dato) {     //comparamos el elemento en el array con el buscado
                posicion += i + " ";    //si es verdad, se guarda y sigue buscando y guardando 
            }   //Para guardar la 1 coincidencia se sustituye por: posicion = i; break;
        }
        return posicion;
    }

    public static int search_Binary(int array[], int dato) {
        int centro, bot = 0, top = array.length - 1;
        while (bot <= top) {
            centro = (top + bot) / 2;
            if (array[centro] == dato) {
                return centro;
            } else if (dato < array[centro]) {
                top = centro - 1;
            } else {
                bot = centro + 1;
            }
        }
        return -1;
    }

    public static void sort_Bubble_N(int array[]) {
        int cont = 0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    //Intercambiamos valores
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    //indicamos que hay un cambio
                    cont++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cont == 0) {
                ordenado = true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cont = 0;
        }
    }

    public static void sort_Bubble_S(String array[]) {
        boolean ordenado = false;
        int cont = 0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while (!ordenado) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareToIgnoreCase(array[i + 1]) > 0) {
                    //Intercambiamos valores
                    String aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    //indicamos que hay un cambio
                    cont++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cont == 0) {
                ordenado = true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cont = 0;
        }
    }

    public static void sort_Quick_N(int array[], int izq, int der) {
        int i = izq, j = der;
        int pivote = array[(i + j) / 2];
        do {
            while (array[i] < pivote) {
                i++;
            }
            while (array[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            sort_Quick_N(array, izq, j);
        }
        if (i < der) {
            sort_Quick_N(array, i, der);
        }
    }

    public static void sort_Quick_S(String array[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = (i + j) / 2;
        do {
            while (array[i].compareToIgnoreCase(array[pivote]) < 0) {
                i++;
            }
            while (array[j].compareToIgnoreCase(array[pivote]) > 0) {
                j--;
            }
            if (i <= j) {
                String aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            sort_Quick_S(array, izq, j);
        }
        if (i < der) {
            sort_Quick_S(array, i, der);
        }
    }
}
