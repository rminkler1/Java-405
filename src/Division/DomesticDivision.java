package Division;

/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 6 Assignment

Create a subclass of the Division class called DomesticDivision
Add state attribute
 */

public class DomesticDivision extends Division {

    private String state;

    // constructor
    DomesticDivision(String divisionName, String acctNumber, String state) {
        super(divisionName, acctNumber);
        this.state = state;
    }

    // getters and setters
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println(getDivisionName() + ":");
        System.out.println("\t" + getAcctNumber());
        System.out.println("\t" + getState());
    }

    @Override
    public String toString() {
        return "DomesticDivision{" +
                "divisionName='" + divisionName + "'" +
                ", state='" + state + "'" +
                ", accountNumber='" + acctNumber +
                "'}";
    }
}
