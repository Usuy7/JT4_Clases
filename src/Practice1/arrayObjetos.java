package Practice1;

/**
 *
 * @author Javier
 */
public class arrayObjetos {

    public static void main(String args[]) {

        Integer[] arrayInt = new Integer[5];
        arrayInt[0] = new Integer(3);
        arrayInt[1] = new Integer(4);
        arrayInt[2] = new Integer(5);
        arrayInt[3] = new Integer(6);
        arrayInt[4] = new Integer(7);
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
