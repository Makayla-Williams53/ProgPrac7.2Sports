public class track extends times
{
    //1 instance variables
    public int distance;
    public boolean hurdles;

    //2 constructors
    public track(String sportName, int numPlayers, String equipment, String howWin, boolean avgTime, boolean singleTime, int distance, boolean hurdles)
    {
        super(sportName, numPlayers, equipment, howWin, avgTime, singleTime);
        this.distance = distance;
        this.hurdles = hurdles;
    }

    public track()
    {
        super();
        this.distance = 0;
        this.hurdles = false;
    }

    //4 getters
    public int getDistance()
    {
        return distance;
    }
    public boolean getHurdles()
    {
        return hurdles;
    }

    //5 setters
    public void setDistance(int distance)
    {
        this.distance = distance;
    }
    public void setHurdles(boolean hurdles)
    {
        this.hurdles = hurdles;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nThe distance of this race is: " + distance + " meters" +
                "\nIs this race ran with hurdles: " + hurdles;
        return output;


    }
}
