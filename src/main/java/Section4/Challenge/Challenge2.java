package Section4.Challenge;

public class Challenge2 {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        boolean gameOver = false;
        int score = 10000;
        int levelComplected = 8;
        int bonus = 200;
        highScore = calculateScore(gameOver, score, levelComplected, bonus);
        System.out.println("Your final score was " + highScore);
    }

    public static int calculateScore (boolean gameOver, int score, int levelComplected, int bonus){
        if(gameOver == true) {
            int finalScore = score + (levelComplected * bonus);
            finalScore +=1000;
            return finalScore;
        }
        return -1;
    }





}
