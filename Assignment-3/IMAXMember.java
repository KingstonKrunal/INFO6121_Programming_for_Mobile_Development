public class IMAXMember extends MovieMembership {
    private final double discountRate; // defined discount rate
    private final double pointRate; // defined points rate

    public IMAXMember(String mName) {
        super(mName); // invoke parent class MovieMembership constructor with 1 argument

        discountRate = 0.5; // set discount rate
        pointRate = 1.3; // set points rate
    }

    public IMAXMember(String mName, String nMovie, String tType, int sHour, int sMinute, String snk) {
        super(mName, nMovie, tType, sHour, sMinute, snk); // invoke parent class MovieMembership constructor with 6 arguments

        discountRate = 0.5; // set discount rate
        pointRate = 1.3; // set points rate
    }

    // Get member details with their membership class
    public String getMemberDetails() {
        String parentString = super.getMemberDetails(); // get member details from parent class MovieMembership
        String rankString = returnMembershipRank(); // get membership rank

        return (parentString + "\nMember Class:" + rankString); // return member information with their rank
    }

    @Override
    public String returnMembershipRank() {
        return "IMAX";
    }

    @Override
    // Print discount rate and points rate
    public void printMemberBenefits() {
        System.out.println("\nDiscount Rate: " + discountRate + "\nPoints Rate: " + pointRate);
    }

    @Override
    public void purchaseMovieTicket(double tPrice, String nMovie, String tType, int sHour, int sMinute, String snk) {
        super.setNextMovie(nMovie); // parent class MovieMembership method called, and it will set a next movie
        super.setTheatreType(tType); // parent class MovieMembership method called, and it will set a theatre type
        super.setShowTime(sHour, sMinute); // parent class MovieMembership method called, and it will set show time
        super.setSnack(snk); // parent class MovieMembership method called, and it will set a snack

        // if theatre type is IMAX discount and point are applied
        if (tType.equals("IMAX")) {
            double priceWithDiscount = tPrice * (1 - discountRate); // calculate a ticket price with discount
            double pointEarned = (int) (tPrice * pointRate); // calculate points earned by booking a ticket

            System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for " + priceWithDiscount
                    + " and will be showing at " + displayShowTime() + " with " + getTheatreType() + " screening. They have earned " + pointEarned
                    + " points.");
        }
        // otherwise, this code will be printed without addition of discount and points
        else {
            System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for " + tPrice
                    + " and will be showing at " + displayShowTime() + " with " + getTheatreType() + " screening. They have earned 0 points.");
        }
    }
}
