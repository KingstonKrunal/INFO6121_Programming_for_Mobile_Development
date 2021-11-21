public class SilverMember extends MovieMembership {
    private final double discountRate; // defined discount rate
    private final double pointRate; // defined points rate

    // 1st Constructor
    public SilverMember(String memberName) {
        super(memberName); // invoke parent class MovieMembership constructor with 1 argument

        discountRate = 0.1; // set discount rate
        pointRate = 1.2; // set points rate
    }

    // 2nd Constructor
    public SilverMember(String memberName, double dRate, double pRate) {
        super(memberName); // invoke parent class MovieMembership constructor with 1 argument

        discountRate = dRate; // set discount rate
        pointRate = pRate; // set points rate
    }

    // 3rd Constructor
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack); // invoke parent class MovieMembership constructor with 6 arguments

        discountRate = 0.1; // set discount rate
        pointRate = 1.2; // set points rate
    }

    // 4th Constructor
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack,
                        double dRate, double pRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack); // invoke parent class MovieMembership constructor with 6 arguments

        discountRate = dRate; // set discount rate
        pointRate = pRate; // set points rate
    }

    // Get member details with their membership class
    public String getMemberDetails() {
        String parentString = super.getMemberDetails(); // get member details from parent class MovieMembership
        String rankString = returnMembershipRank(); // get membership rank

        return (parentString + "\nMember Class:" + rankString); // return member information with their rank
    }

    @Override
    // return membership rank i.e. Silver
    public String returnMembershipRank() {
        return "Silver";
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

        double priceWithDiscount = tPrice * (1 - discountRate); // calculate a ticket price with discount
        double pointEarned = (int) (tPrice * pointRate); // calculate points earned by booking a ticket

        System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for " + priceWithDiscount
                + " and will be showing at " + displayShowTime() + " with " + getTheatreType() + " screening. They have earned " + pointEarned
                + " points.");
    }
}