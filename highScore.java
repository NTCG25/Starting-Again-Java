public class highScore {
    public static void main(String[] args) {
    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("James", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("orbitbuddy", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Death", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("AcidRain", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Twick", highScorePosition);

    }


    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to sneak their way into position "
                + highScorePosition + " on the table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
        }
    }
