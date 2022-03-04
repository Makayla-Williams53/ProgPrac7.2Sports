public class times extends sport
{
    //1 instance variables
    public boolean avgTime;
    public boolean singleTime;

    //2 constructors
    public times(String sportName, int numPlayers, String equipment, String howWin, boolean avgTime, boolean singleTime)
    {
        super(sportName, numPlayers, equipment, howWin);
        this.avgTime = avgTime;
        this.singleTime = singleTime;
    }

    public times()
    {
        super();
        this.avgTime = false;
        this.singleTime = false;
    }

    //4 getters
    public boolean getAvgTime()
    {
        return avgTime;
    }
    public boolean getSingleTime()
    {
        return singleTime;
    }

    //setters
    public void setAvgTime(boolean avgTime)
    {
        this.avgTime = avgTime;
    }
    public void setSingleTime(boolean singleTime)
    {
        this.singleTime = singleTime;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nIs this sport won through an average of multiple times: " + avgTime +
                "\nIs this sport won through a single time: " + singleTime;
        return output;
    }
}
