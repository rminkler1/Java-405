package Division;

/*
Robert Minkler
Nov 14, 2024
CSD 405 Module 6 Assignment

Create four instances of Division */

public class UseDivision {
    public static void main(String[] args) {

        // Create two instances of each class. 4 total
        DomesticDivision division1 = new DomesticDivision(
                "Western Division #1",
                "12345-67890",
                "AZ"
        );

        Division division2 = new DomesticDivision(
                "Eastern Division #2",
                "09876-54321",
                "NY"
        );

        InternationalDivision division10 = new InternationalDivision(
                "Israel Division #10",
                "54321-67890",
                "Israel",
                "Hebrew"
        );

        Division division12 = new InternationalDivision(
                "England Division #12",
                "56789-0987345",
                "England",
                "English"
        );

        // Display each division
        division1.display();
        division2.display();
        division10.display();
        division12.display();

        // Change settings using setters
        division1.setState("AZ");
        division2.setAcctNumber("00000-000000");
        division10.setLanguage("English and Hebrew");
        division12.setDivisionName("UK Division #12");
        ((InternationalDivision) division12).setCountry("UK");   // casting to access InternationalDivision values from Division obj


        System.out.println("\nDivisions after modification using setters.");
        
        // Display after modifications
        division1.display();
        division2.display();
        division10.display();
        division12.display();
    }
}


/*
    Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
    Use a constructor in the superclass that requires values for both fields.
    Create two subclasses named InternationalDivision and DomesticDivision.
        The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
        The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
    Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
    Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
*/