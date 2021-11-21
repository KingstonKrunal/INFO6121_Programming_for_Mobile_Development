public abstract class MovieMembership {
    // defined needed variables
    private final String memberName;
    private String nextMovie;
    private String theatreType;
    private int showHour;
    private int showMinute;
    private String snack;
    private int points;

    // 1st Constructor
    public MovieMembership(String mName) {
        // initialize all variables
        memberName = mName;
        nextMovie = "unknown";
        theatreType = "standard";
        showHour = 0;
        showMinute = 0;
        snack = "unknown";
        points = 0;
    }

    // 2nd Constructor
    public MovieMembership(String mName, String nMovie, String tType, int sHour, int sMinute, String snk) {
        // initialize all variables
        memberName = mName;
        nextMovie = nMovie;
        theatreType = tType;
        showHour = sHour;
        showMinute = sMinute;
        snack = snk;
        points = 0;
    }

    // return member name
    public String getMemberName() {
        return memberName;
    }

    // return next movie name
    public String getNextMovie() {
        return nextMovie;
    }

    // return member points
    public int getPoints() {
        return points;
    }

    // return snack name
    public String getSnack() {
        return snack;
    }

    // return theatre type
    public String getTheatreType() {
        return theatreType;
    }

    // set next movie
    public void setNextMovie(String nMovie) {
        nextMovie = nMovie;
    }

    // set snack
    public void setSnack(String snk) {
        snack = snk;
    }

    // set theatre type
    public void setTheatreType(String tType) {
        theatreType = tType;
    }

    // set show time
    public void setShowTime(int sHour, int sMinute) {
        showHour = sHour;
        showMinute = sMinute;
    }

    // display show time
    public String displayShowTime() {
        return (showHour + ":" + showMinute); // return time in HH:MM format
    }

    // Add points to member profile
    public void addPoints(int point) {
        points += point;
    }

    // return all member details with show time and points
    public String getMemberDetails() {
        return ("Member Name: " + memberName + "\nNext Movie: " + nextMovie + "\nTheatre Type: " + theatreType
                + "\nShow Hour: " + showHour + "Show Minute: " + showMinute + "\nShow Snack: " + snack
                + "\nPoints: " + points);
    }

    // abstract method which is implemented in subclass
    public abstract String returnMembershipRank();

    // abstract method which is implemented in subclass
    public abstract void printMemberBenefits();

    // abstract method which is implemented in subclass
    public abstract void purchaseMovieTicket(double tPrice, String nMovie, String tType, int sHour, int sMinute, String snk);
}