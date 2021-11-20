public class MovieMembership {
    private String membarName;
    private String nextMovie;
    private String theatreType;
    private int showHour;
    private int showMinute;
    private String snack;
    private int points;

    public MovieMembership(String mName) {
        membarName = mName;
        nextMovie = "unknown";
        theatreType = "standard";
        showHour = 0;
        showMinute = 0;
        snack = "unknown";
        points = 0;
    }

    public MovieMembership(String mName, String nMovie, String tType, int sHour, int sMinute, String snk) {
        membarName = mName;
        nextMovie = nMovie;
        theatreType = tType;
        showHour = sHour;
        showMinute = sMinute;
        snack = snk;
        points = 0;
    }

    public static String getMemberName() {
        return memberName;
    }

    public static String getNextMovie() {
        return nextMovie;
    }

    public static int getPoints() {
        return points;
    }

    public static String getSnack() {
        return snack;
    }

    public static String getTheatreType() {
        return theatreType;
    }

    public static void setNextMovie(String nMovie) {
        nextMovie = nMovie;
    }

    public static void setSnack(String snk) {
        snack = snk;
    }

    public static void setTheatreType(String tType) {
        theatreType = tType;
    }

    public static void setShowTime(int sHour, int sMinute) {
        showHour = sHour;
        showMinute = sMinute;
    }

    public static String displayShowTime() {
        return (showHour + ":" + showMinute);
    }

    public static void addPoints(int pnts) {
        points += pnts;
    }

    public static String getMemberDetails() {
        return ("Member Name: " + memberName + "\nNext Movie: " + nextMovie + "\nTheatre Type: " + theatreType
                + "\nShow Hour: " + showHour + "Show Minute: " + showMinute + "\nShow Snack: " + snack
                + "\nPoints: " + points);
    }

    public abstract String returnMembershipRank();

    public abstract void printMemberBenefits();

    public abstract void purchaseMovieTicket(double tPrice, String nMovie, String tType, int sHour, int sMinute, String snk);
}