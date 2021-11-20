public class SilverMember extends MovieMembership {
    private double discountRate;
    private double pointsRate;

    // 1st Constructor
    public SilverMember(String memberName) {
        discountRate = 0.1;
        pointsRate = 1.2;

        super(memberName);
    }

    // 2nd Constructor
    public SilverMember(String memberName, double dRate, double pRate) {
        discountRate = dRate;
        pointsRate = pRate;

        super(memberName);
    }

    // 3rd Constructor
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        discountRate = 0.1;
        pointsRate = 1.2;

        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
    }

    // 4th Constructor
    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack, double dRate, double pRate) {
        discountRate = dRate;
        pointsRate = pRate;

        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
    }

    public static String getMemberDetails() {
        String parentString = super.getMembershipDetails();
        String rankString = returnMembershipRank();

        return (parentString + "\nMember Class: " + rankString);
    }

    public static void printMemberBenefits() {
        System.out.println("\nDiscount Rate: " + discountRate + "\nPoints Rate: " + pointsRate);
    }

    public String returnMembershipRank() {
        return "Silver";
    }
}