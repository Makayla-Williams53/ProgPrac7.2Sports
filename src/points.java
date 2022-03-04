public class points extends sport
{
    //1 instance variables
    public int pointPerScore;

    //2 constructors
    public points(String sportName, int numPlayers, String equipment, String howWin, int pointPerScore)
    {
        super(sportName, numPlayers, equipment, howWin);
        this.pointPerScore = pointPerScore;
    }

    public points()
    {
        super();
        this.pointPerScore = 0;
    }

    //4 getters
    public int getPointPerScore()
    {
        return pointPerScore;
    }

    //5 setters
    public void setPointPerScore(int pointPerScore)
    {
        this.pointPerScore = pointPerScore;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nThere are " + pointPerScore + " points for every score";
        return output;
    }
}
