public class diving extends scores
{
    //1 instance variables
    public String diver1Name;
    public String diver2Name;
    public int height;

    //2 constructors
    public diving(String sportName, int numPlayers, String equipment, String howWin, int numJudges, boolean avgScore, boolean singleScore, String diver1Name, String diver2Name, int height)
    {
        super(sportName, numPlayers, equipment, howWin, numJudges, avgScore, singleScore);
        this.diver1Name = diver1Name;
        this.diver2Name = diver2Name;
        this.height = height;
    }

    public diving()
    {
        super();
        this.diver1Name = "";
        this.diver2Name = "";
        this.height = 0;
    }

    //4 getters
    public String getDiver1Name()
    {
        return diver1Name;
    }
    public String getDiver2Name()
    {
        return diver2Name;
    }
    public int getHeight()
    {
        return height;
    }

    //5 setters
    public void setDiver1Name(String diver1Name)
    {
        this.diver1Name = diver1Name;
    }
    public void setDiver2Name(String diver2Name)
    {
        this.diver2Name = diver2Name;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nThe name of the first diver is: " + diver1Name +
                "\nThe name of the second diver is: " + diver2Name +
                "\nThe height of the divingboard is: " + height + " feet";
        return output;
    }
}
