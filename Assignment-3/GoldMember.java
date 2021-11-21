import java.util.Scanner;

interface VIPPrivilege {
    public final int PASSWORD = 1234; // initialization of password and set it to constant 1234

    public void accessVIPLounge(); // defined a method which will be used in GoldMember class

    public String purchaseAlcohol(); // defined a method which will be used in GoldMember class
}

public class GoldMember extends SilverMember implements VIPPrivilege {
    private boolean validCredentials; // define a boolean variable for checking valid credentials

    // 1st Constructor
    public GoldMember(String mName) {
        super(mName, 0.25, 2.0); // invoke parent class SilverMember constructor with 3 argument

        addPoints(50); // add 50 initial points to gold member

        validCredentials = false; // initialize valid credentials to false
    }

    // 2nd Constructor
    public GoldMember(String mName, String nMovie, String tType, int sHour, int sMinute, String snk) {
        super(mName, nMovie, tType, sHour, sMinute, snk, 0.25, 2.0); // invoke parent class SilverMember constructor with 8 argument

        addPoints(50); // add 50 initial points to gold member

        validCredentials = false; // initialize valid credentials to false
    }

    // return membership rank i.e. Gold
    public String returnMembershipRank() {
        return "Gold";
    }

    public String getMemberDetails() {
        String parentString = super.getMemberDetails(); // get member details from parent class MovieMembership
        String rankString = returnMembershipRank(); // get membership rank

        return (parentString + "\nMember Class:" + rankString + "\nVIP Privilege: TRUE"); // return member information with their rank and privilege
    }

    @Override
    public void accessVIPLounge() {
        Scanner scanner = new Scanner(System.in); // create a scanner object
        int inputPassword = scanner.nextInt(); // take input from the user and store it to inputPassword variable

        // checks if password match or not
        if (inputPassword == PASSWORD) {
            validCredentials = true; // set valid credentials value to true

            System.out.println("\nAccess Granted!"); // print access granted on the screen
        }
    }

    @Override
    public String purchaseAlcohol() {
        // checks if valid credentials value is true or not
        if (validCredentials) {
            setSnack("Alcohol"); // calling a parent class MovieMembership method and set alcohol as a snack

            return "\nEnjoy your beverage"; // return a string value
        } else {
            return "\nA beverage can't be purchased because no valid password has been entered"; // if valid credentials is false this will return
        }
    }
}
