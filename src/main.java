public class main
{
        public static void main(String[] args)
        {
            sport testSport = new sport("Test Sport", 12, "target and ball", "best of 3 rounds");

            baseball base1 = new baseball("Baseball", 9, "bat and glove", "highest points", 1, "Dodgers", "Kershaw");

            diving dive100 = new diving("Syncronized Diving", 2, "pool and diving board", "best average score", 5, true, false, "Joe", "Ron", 100);

            track hurdles300 = new track("Track", 1, "track", "fastest time", false, true, 300, true);

            System.out.println("Test sport is won by: " + testSport.getHowWin() + "\n");
            System.out.println(base1.toString() + "\n");
            System.out.println(dive100.toString() + "\n");
            System.out.println(hurdles300.toString() + "\n");

        }//end main method
}
