package Practice1;

/**
 *
 * @author AlumMati
 */
public class Check {
    
    private int number;
    
    public Check (){}
    
    public Check (int number) {
        this.number = number;
    }
    
    public void print(){
        System.out.println("***Menu***\n" + "Choose an opcion: \n" + "1.Prime\n" + "2.Older\n" + "3.Par\n"
        + "4.Interval\n" + "5.Leap\n" + "6.Symmetrical\n" + "7.Capicua\n");
    }
}
