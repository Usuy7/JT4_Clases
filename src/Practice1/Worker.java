package Practice1;

/**
 *
 * @author Javier
 */
public class Worker {
    
    private String name;
    private String dni;
    private char civil_status;
    private int year_income;
    private int annual_salary;
    
    public Worker () {}
    
    public Worker (String name, String dni, char civil_status, int year_income, int annual_salary){
        this.name = name;
        this.dni = dni;
        this.civil_status  = civil_status;
        this.year_income = year_income;
        this.annual_salary = annual_salary;
    }
    
    @Override
    public String toString (){
        return "Name: " + getName() + "\nDNI: " + getDni() + "\nCivil Status: " + getCivil_status() + 
                "\nYear of income: " + getYear_income() + "\nAnnual Salary: " + getAnnual_salary() + "\n";
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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the civil_status
     */
    public char getCivil_status() {
        return civil_status;
    }

    /**
     * @param civil_status the civil_status to set
     */
    public void setCivil_status(char civil_status) {
        this.civil_status = civil_status;
    }

    /**
     * @return the year_income
     */
    public int getYear_income() {
        return year_income;
    }

    /**
     * @param year_income the year_income to set
     */
    public void setYear_income(int year_income) {
        this.year_income = year_income;
    }

    /**
     * @return the annual_salary
     */
    public int getAnnual_salary() {
        return annual_salary;
    }

    /**
     * @param annual_salary the annual_salary to set
     */
    public void setAnnual_salary(int annual_salary) {
        this.annual_salary = annual_salary;
    }
}
