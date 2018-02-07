package Practice1;

/**
 *
 * @author Javier
 */
public class Food {

    private String name;
    private double lipids; // expresado en tanto por ciento
    private double carbohydrates; // expresado en tanto por ciento
    private double proteins; // expresado en tanto por ciento
    private boolean origin; // animal o no animal
    private char vitamins; // A alto, M medio y B bajo
    private char minerals; // A alto, M medio y B bajo
    private boolean diethetic;
    private boolean athlete; 
    

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, double lipids, double carbohydrates, double proteins, boolean origin, char vitamins, char minerals) {
        this.name = name;
        this.lipids = lipids;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.origin = origin;
        this.vitamins = vitamins;
        this.minerals = minerals;
    }

    @Override
    public String toString() {
        diethetic = isDiethetic(lipids, vitamins);
        athlete = recommendedForAthletes(lipids, carbohydrates, proteins);
        
        return "\n***FOOD***" + "\nName: " + getName() + "\nLipids: " + getLipids()
                + "\nCarbohydrates: " + getCarbohydrates() + "\nProteins: " + getProteins() + "\nOrigins: "
                + isOrigin() + "\nVitamins: " + getVitamins() + "\nMinerals: " + getMinerals()
                + "\nEnergy Content: " + "\nDiethetic? " + diethetic + "\nRecomended for athletes? " + athlete;
    }

    // calcula las kcal/gramo del alimento
    // lípidos 1g = 9.4 Kcal
    // proteinas 1g = 5.3 Kcal
    // hidratos de carbono 1g = 4.1 Kcal.
    public double EnergyContent() {
        double calories = 0;
        return calories;
    }

    // lipidos por debajo del 20% y vitaminas (B)ajo
    public boolean isDiethetic(double lipids, char vitamins) {
        boolean answer;
        if (lipids < 20 && (vitamins == 'b' || vitamins == 'B')) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
    
    // proteínas 10-15 %, lípidos 30-35 % y hidratos de carbono 55-65%.
    public boolean recommendedForAthletes(double lipids, double carbohydrates, double proteins) {
        if ((proteins >= 10 || proteins <= 15) && (lipids >= 30) || (lipids <= 35) && (carbohydrates >= 55 || carbohydrates <= 65)) {
            athlete = true;
        }
        return athlete;
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
     * @return the lipids
     */
    public double getLipids() {
        return lipids;
    }

    /**
     * @param lipids the lipids to set
     */
    public void setLipids(double lipids) {
        this.lipids = lipids;
    }

    /**
     * @return the carbohydrates
     */
    public double getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * @param carbohydrates the carbohydrates to set
     */
    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * @return the proteins
     */
    public double getProteins() {
        return proteins;
    }

    /**
     * @param proteins the proteins to set
     */
    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    /**
     * @return the origin
     */
    public boolean isOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(boolean origin) {
        this.origin = origin;
    }

    /**
     * @return the vitamins
     */
    public char getVitamins() {
        return vitamins;
    }

    /**
     * @param vitamins the vitamins to set
     */
    public void setVitamins(char vitamins) {
        this.vitamins = vitamins;
    }

    /**
     * @return the minerals
     */
    public char getMinerals() {
        return minerals;
    }

    /**
     * @param minerals the minerals to set
     */
    public void setMinerals(char minerals) {
        this.minerals = minerals;
    }
}
