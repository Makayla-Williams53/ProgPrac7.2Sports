public class scores extends sport
{
    //1 instance variables
    public int numJudges;
    public boolean avgScore;
    public boolean singleScore;

    //2 constructors
    public scores(String sportName, int numPlayers, String equipment, String howWin, int numJudges, boolean avgScore, boolean singleScore)
    {
        super(sportName, numPlayers, equipment, howWin);
        this.numJudges = numJudges;
        this.avgScore = avgScore;
        this.singleScore = singleScore;
    }

    public scores()
    {
        super();
        this.numJudges = 0;
        this.avgScore = false;
        this.singleScore = false;
    }

    //4 getters
    public int getNumJudges()
    {
        return numJudges;
    }
    public boolean getAvgScore()
    {
        return avgScore;
    }
    public boolean getSingleScore()
    {
        return singleScore;
    }

    //5 setters
    public void setNumJudges(int numJudges)
    {
        this.numJudges = numJudges;
    }
    public void setAvgScore(boolean avgScore)
    {
        this.avgScore = avgScore;
    }
    public void setSingleScore(boolean singleScore)
    {
        this.singleScore = singleScore;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nThis sport is has " + numJudges + " judges" +
                "\nIs this sport won based on the average scores: " + avgScore +
                "\nIs this sport won based on one single score: " + singleScore;
        return output;
    }
}
