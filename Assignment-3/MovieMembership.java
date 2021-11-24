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

    int counter = 0; // counter to check whether to print sentence vise or label vise

    // return all member details with show time and points
    public String getMemberDetails() {
        ++counter; // increment counter by 1

        if (counter <= 1) {
            if (returnMembershipRank().equals("Gold")) {
                return ("\nMember Name: " + memberName + "\nMember Rank:" + returnMembershipRank() + "\nPoints: " + points + "\nNext Movie: " + nextMovie
                        + "\nTheatre Type: " + theatreType + "\nShow Time: " + showHour + ":" + showMinute + "\nSnack: " + snack + "\nThis membership card belongs to "
                        + memberName + ". " + "They have " + points + " points. Their next movie is " + nextMovie + " at " + showHour + ":" + showMinute
                        + " with a " + theatreType + " screening. \nThey will be having " + snack + " as a snack. They have " + returnMembershipRank()
                        + " membership. and VIP privileges.");
            } else {
                return ("\nMember Name: " + memberName + "\nMember Rank:" + returnMembershipRank() + "\nPoints: " + points + "\nNext Movie: " + nextMovie
                        + "\nTheatre Type: " + theatreType + "\nShow Time: " + showHour + ":" + showMinute + "\nSnack: " + snack + "\nThis membership card belongs to "
                        + memberName + ". " + "They have " + points + " points. Their next movie is " + nextMovie + " at " + showHour + ":" + showMinute
                        + " with a " + theatreType + " screening. \nThey will be having " + snack + " as a snack. They have " + returnMembershipRank() + " membership.");
            }
        } else {
            if (returnMembershipRank().equals("Gold")) {
                return ("\nThis membership card belongs to " + memberName + ". "
                        + "They have " + points + " points. Their next movie is " + nextMovie + " at " + showHour + ":" + showMinute + " with a " + theatreType
                        + " screening. \nThey will be having " + snack + " as a snack. They have " + returnMembershipRank() + " membership. and VIP privileges.");
            } else {
                return ("\nThis membership card belongs to " + memberName + ". "
                        + "They have " + points + " points. Their next movie is " + nextMovie + " at " + showHour + ":" + showMinute + " with a " + theatreType
                        + " screening. \nThey will be having " + snack + " as a snack. They have " + returnMembershipRank() + " membership.");
            }
        }
    }

    // abstract method which is implemented in subclass
    public abstract String returnMembershipRank();

    // abstract method which is implemented in subclass
    public abstract void printMemberBenefits();

    // abstract method which is implemented in subclass
    public abstract void purchaseMovieTicket(double tPrice, String nMovie, String tType, int sHour, int sMinute, String snk);
}