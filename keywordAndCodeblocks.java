public class keywordAndCodeblocks {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
        //----------CHALLENGE: duplicate code-------
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout is still displayed
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was: " + finalScore);
        }
        // disadvantage of copying codes is when we need to make
        // changes we have to do it in multiple locations
    }
}
