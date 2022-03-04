public class baseball extends points
{
    //1 instance variables
    public String teamName;
    public String pitcherName;

    //2 constructors
    public baseball(String sportName, int numPlayers, String equipment, String howWin, int pointPerScore, String teamName, String pitcherName)
    {
        super(sportName, numPlayers, equipment, howWin, pointPerScore);
        this.teamName = teamName;
        this.pitcherName = pitcherName;
    }

    public baseball()
    {
        super();
        this.teamName = "";
        this.pitcherName = "";
    }

    //4 getters
    public String getTeamName()
    {
        return teamName;
    }

    public String getPitcherName()
    {
        return pitcherName;
    }

    //5 setters
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public void setPitcherName(String pitcherName)
    {
        this.pitcherName = pitcherName;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nThe name of this baseball team is: " + teamName +
                "\nThe name of this team's ace pitcher is: " + pitcherName;
        return output;

    }
}
