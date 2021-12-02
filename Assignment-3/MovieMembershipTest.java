// Program Name: MovieMembershipTest
// Author: Krunal Shah
// Date: 2021/11/21
// Purpose: The program will test movie membership and booking movies functinality by invoking membership, silver member, gold member,
// and imax member class methods.

public class MovieMembershipTest {
    public static void main(String[] args) {
        // Creating objects of each class with values
        SilverMember mySilver = new SilverMember("Rex Roth", "Spider Man", "Standard", 16, 20, "Pizza");
        GoldMember myGold = new GoldMember("Mac Rich", "X Men", "Recliner", 10, 0, "Popcorn");
        IMAXMember myIMAX = new IMAXMember("Micaela Max", "Shang Chi", "IMAX", 14, 30, "Wine");

        MovieMembership[] movieMembershipArray = {mySilver, myGold, myIMAX}; // creating an array which contains all 3 objects

        // loop to use written methods invoked by 3 classes
        for (int i = 0; i < 3; i++) {
            System.out.println(movieMembershipArray[i].getMemberDetails());

            movieMembershipArray[i].printMemberBenefits();
        }

        // loop to purchase tickets and getting member details for all 3 class objects
        for (int i = 0; i < 3; i++) {
            movieMembershipArray[i].purchaseMovieTicket(6.99, "The Matrix 4", "Standard", 11, 25, "Sour Keys");
            System.out.println(movieMembershipArray[i].getMemberDetails());
        }

        myGold.accessVIPLounge(); // Gold member class object is accessing method VIP lounge
        System.out.println(myGold.purchaseAlcohol()); // Gold member class object is accessing method purchase alcohol
        System.out.println(myGold.getMemberDetails()); // Gold member class object is accessing method member details

        // purchase ticket by silver member object
        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "Standard", 14, 25, "Smarties");

        // purchase ticket by gold member object
        myGold.purchaseMovieTicket(15.98, "The Big Short", "Standard", 13, 50, "Kitkat");

        // purchase ticket by IMAX member object
        myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");

        // getting member details of all 3 class objects
        System.out.println(mySilver.getMemberDetails());
        System.out.println(myGold.getMemberDetails());
        System.out.println(myIMAX.getMemberDetails());
    }
}
