public class methodsWithReturn {
    public static void main(String[] args){
        int score = calculateScore(true,800,5,100);
        System.out.println("Your final score was: " + score);
        score = calculateScore(true,10000,8,200);
        System.out.println("Your final score was: " + score);
        System.out.println("-----------------------------");
        //
        //--------CHALLENGE---------------
        //Create a method called displayHighScorePosition
        //it should receive a player's name as a parameter, and a 2nd
        //parameter as a position in the high score table
        //You should display the player's name along with a message like
        //"managed to get into position" and the position they got and
        //a further message "on the high score table".
        //
        //Create the second method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return an int
        //the return data should be
        //1 if score>1000
        //2 if score>500 and <1000
        //3 if score>100 and <500
        //4 if in all other cases
        //call both methods and display the results of the following
        //a score of 1500, 900, 400 and 50
        //
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Alam",position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Cat",position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Dale",position);
    }
    //
    // Define a method rather than using same code in different
    // locations of the program
    public static int calculateScore(boolean gmOvr,int scr,int lvl,int bns){
        if(gmOvr) {
            int finalScore = scr + (lvl * bns);
            return finalScore;
        }
        return -1;
    }
    //
    public static int calculateHighScorePosition(int argScore){
        if (argScore >= 1000) {
            return 1;
        } else if (argScore >= 500 && argScore < 1000) {
            return 2;
        } else if (argScore >= 100 && argScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void displayHighScorePosition(String argName, int argPos){
        System.out.println(argName+" managed to get into position "+argPos+" on the high score table.");
    }
}
