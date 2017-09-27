public class methods {
    public static void main(String[] args){
        calculateScore(true,800,5,100);
        calculateScore(true,10000,8,200);
    }
    // Define a method rather than using same code in different
    // locations of the program
    public static void calculateScore(boolean gmOvr,int scr,int lvl,int bns){
        if(gmOvr) {
            int finalScore = scr + (lvl * bns);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
