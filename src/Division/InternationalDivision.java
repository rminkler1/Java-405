package Division;

/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 6 Assignment

Create a subclass of the Division class called InternationalDivision
Add country and language attributes
 */

public class InternationalDivision extends Division {

    private String country;
    private String language;

    // constructor
    InternationalDivision(String divisionName, String acctNumber, String country, String language) {
        super(divisionName, acctNumber);
        this.country = country;
        this.language = language;
    }

    // getters and setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    void display() {
        System.out.println(getDivisionName() + ":");
        System.out.println("\t" + getAcctNumber());
        System.out.println("\t" + getCountry());
        System.out.println("\t" + getLanguage());
    }

    @Override
    public String toString() {
        return "InternationalDivision{" +
                "divisionName='" + divisionName + "'" +
                ", country='" + country + "'" +
                ", language='" + language + "'" +
                ", accountNumber='" + acctNumber +
                "'}";
    }
}
