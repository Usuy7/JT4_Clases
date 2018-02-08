package Practice1;

/**
 *
 * @author Javier
 */
public class Pantano {

    private String name;
    private int water_amount;
    private int total_capacity;

    public Pantano() {}

    public Pantano(String name, int water_amount, int total_capacity) {
        this.name = name;
        this.water_amount = water_amount;
        this.total_capacity = total_capacity;
    }

    public String toString(String name, int water_amount, int total_capacity) {
        return "Name: " + name + "Water Amount: " + water_amount + "Total Capacity: " + total_capacity;
    }

    public String toString_Name(String name) {
        return "Name: " + name;
    }

    public String toString_Water(int water_amount) {
        return "Water Amount: " + water_amount;
    }

    public String toString_Total(int total_capacity) {
        return "Total Capacity: " + total_capacity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the water_amount
     */
    public int getWater_amount() {
        return water_amount;
    }

    /**
     * @param water_amount the water_amount to set
     */
    public void setWater_amount(int water_amount) {
        this.water_amount = water_amount;
    }

    /**
     * @return the total_capacity
     */
    public int getTotal_capacity() {
        return total_capacity;
    }

    /**
     * @param total_capacity the total_capacity to set
     */
    public void setTotal_capacity(int total_capacity) {
        this.total_capacity = total_capacity;
    }
}
