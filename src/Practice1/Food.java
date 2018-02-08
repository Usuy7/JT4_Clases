package Practice1;

/**
 *
 * @author Javier
 */
public class Food {

    private String name;
    private double weight;
    private double lipids; // expresado en tanto por ciento
    private double carbohydrates; // expresado en tanto por ciento
    private double proteins; // expresado en tanto por ciento
    private boolean origin; // animal o no animal
    private char vitamins; // A alto, M medio y B bajo
    private char minerals; // A alto, M medio y B bajo

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, double weight, double lipids, double carbohydrates, double proteins, boolean origin, char vitamins, char minerals) {
        this.name = name;
        this.weight = weight;
        this.lipids = lipids;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.origin = origin;
        this.vitamins = vitamins;
        this.minerals = minerals;
    }

    public String toString(double calories, String diethetic, String athlete) {
        return "\n***FOOD***" + "\nName: " + getName() + "\nWeight: " + getWeight() + "\nLipids: " + getLipids()
                + "\nCarbohydrates: " + getCarbohydrates() + "\nProteins: " + getProteins() + "\nAnimal Origin?: "
                + isOrigin() + "\nVitamins: " + getVitamins() + "\nMinerals: " + getMinerals()
                + "\nEnergy Content: " + calories + " kcal" + "\nDiethetic? " + diethetic + "\nRecomended for athletes? " + athlete;
    }

    public void Resultados() {
        double calories = EnergyContent(weight, lipids, carbohydrates, proteins); // guardo el resultado de la suma de las kcal/g del alimento

        boolean is_diethetic = isDiethetic(lipids, vitamins); // guardo si es o no dietetico y asigno una respuesta relativa
        String diethetic = "";
        if (is_diethetic == true) diethetic = "YES";
        else if (is_diethetic == false) diethetic = "NO";
        
        boolean for_athlete = recommendedForAthletes(lipids, carbohydrates, proteins); // guardo si es o no apto para deportistas y asigno una respuesta relativa
        String athlete = "";
        if (for_athlete == true) athlete = "YES";
        else if (for_athlete == false) athlete = "NO";
    }

    // calcula las kcal/gramo del alimento
    public double EnergyContent(double weight, double lipids, double carbohydrates, double proteins) {

        double g_lipidos = lipids * weight / 100; // calculo los gramos de lipidos según el peso del alimento y su % de lipidos
        double kcal_lipidos = g_lipidos * 9.4 / 1; // calculo las kilocalorias de lipidos según su valor enérgetico por gramo: 1g = 9.4 Kcal

        double g_carbohidratos = carbohydrates * weight / 100; // calculo los gramos de carbohidratos según el peso del alimento y su % de carbohidratos
        double kcal_carbohidratos = g_carbohidratos * 5.3 / 1; // calculo las kilocalorias de carbohidratos según su valor enérgetico por gramo: 1g = 5.3 Kcal

        double g_proteinas = proteins * weight / 100; // calculo los gramos de proteinas según el peso del alimento y su % de proteinas
        double kcal_proteinas = g_proteinas * 4.1 / 1; // calculo las kilocalorias de proteinas según su valor enérgetico por gramo: 1g = 4.1 Kcal

        double kcal_sum = kcal_lipidos + kcal_carbohidratos + kcal_proteinas; // sumo las kilocalorias resultantes y lo devuelvo en esta variable

        return kcal_sum;
    }

    // lipidos por debajo del 20% y vitaminas (B)ajo
    public boolean isDiethetic(double lipids, char vitamins) {
        boolean answer;
        if (lipids < 20 && vitamins == 'B') answer = true;
        else answer = false;
        return answer;
    }

    // proteínas 10-15 %, lípidos 30-35 % y hidratos de carbono 55-65%.
    public boolean recommendedForAthletes(double lipids, double carbohydrates, double proteins) {
        boolean answer;
        if ((proteins >= 10 && proteins <= 15) && (lipids >= 30 && lipids <= 35) && (carbohydrates >= 55 && carbohydrates <= 65)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
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

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
