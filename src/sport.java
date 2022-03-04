public class sport
{
    //1 instance variables
    public String sportName;
    public int numPlayers;
    public String equipment;
    public String howWin;

    //2 constructors
    public sport(String sportName, int numPlayers, String equipment, String howWin)
    {
        this.sportName = sportName;
        this.numPlayers = numPlayers;
        this.equipment = equipment;
        this.howWin = howWin;
    }

    public sport()
    {
        this.sportName = "";
        this.numPlayers = 0;
        this.equipment = "";
        this.howWin = "";
    }

    //4 getters
    public String getSportName()
    {
        return sportName;
    }
    public int getNumPlayers()
    {
        return numPlayers;
    }
    public String getEquipment()
    {
        return equipment;
    }
    public String getHowWin()
    {
        return howWin;
    }

    //5 setters
    public void setSportName(String sportName)
    {
        this.sportName = sportName;
    }
    public void setNumPlayers(int numPlayers)
    {
        this.numPlayers = numPlayers;
    }
    public void setEquipment(String equipment)
    {
        this.equipment = equipment;
    }
    public void setHowWin(String howWin)
    {
        this.howWin = howWin;
    }

    //3 toString
    public String toString()
    {
        String output = "The name of this sport is: " + sportName +
                "\nThis sport is played with " + numPlayers + " players at one time" +
                "\nThe equipment this sport uses is: " + equipment +
                "\nYou win this sport through: " + howWin;
        return output;
    }

}
