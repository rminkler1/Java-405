package Division;

/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 6 Assignment

Create an abstract Division Class with an abstract display method. Name & acct#
 */

abstract class Division {

    protected String divisionName;
    protected String acctNumber;

    // Constructor
    Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.acctNumber = accountNumber;
    }

    // Require display method
    abstract void display();

    // getters and setters
    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}
