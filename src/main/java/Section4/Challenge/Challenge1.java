package Section4.Challenge;

public class Challenge1 {

    public static void main(String[] args) {
        int positionInTheTable = calculateHighScorePosition(50); //players score 1500, 900, 400, 50
        displayHighScorePosition("Tom", positionInTheTable);
    }

    public static void displayHighScorePosition (String playersName, int positionInTheTable){
        System.out.println(playersName + " managed to get into position " + positionInTheTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore){
        if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500) {
            return 2;
        } else if (playersScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

//    public static int calculateHighScorePosition(int playersScore){
//        position = 4;
//        if (playersScore >= 1000) {
//            position = 1;
//        } else if (playersScore >= 500) {
//            position = 2;
//        } else if (playersScore >= 100) {
//            position= 3;
//        }
//          return position;
//        }
//    }
}
