import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int playerScore = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("##################################################");
        System.out.println("Welcome to my game, it is Rock, Paper, Scissors...");
        while (true) {

            String[] rps = {"r", "p", "s"};
            String aiMove = rps[new Random().nextInt(rps.length)];
            String playerMove;



            while (true) {
                System.out.println("Your score is " + playerScore);
                System.out.println("please select a move...( r, p, s )");
                playerMove = scan.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid selection.");
            }
            System.out.println("You played " + playerMove);
            System.out.println("AI has played " + aiMove);

            if (playerMove.equals(aiMove)) {
                System.out.println("DRAW");
            } else if (playerMove.equals("r") && aiMove.equals("s")) {
                ++playerScore;
                System.out.println("WIN");
            } else if (playerMove.equals("p") && aiMove.equals("r")) {
                ++playerScore;
                System.out.println("WIN");
            } else if (playerMove.equals("s") && aiMove.equals("p")) {
                ++playerScore;
                System.out.println("WIN");
            } else if (playerMove.equals("r") && aiMove.equals("p")) {
                --playerScore;
                System.out.println("LOSS");
            } else if (playerMove.equals("p") && aiMove.equals("s")) {
                --playerScore;
                System.out.println("LOSS");
            } else if (playerMove.equals("s") && aiMove.equals("r")) {
                --playerScore;
                System.out.println("LOSS");
            }
            System.out.println("#######################################");
            System.out.println("Your Score is " + playerScore);
            System.out.println("Press \"y\" to keep playing...press any other key to exit.");
            String playAgain = scan.nextLine();
            if (!playAgain.equals("y")){
                System.out.println("FINAL SCORE: " + playerScore);
                System.out.println("Goodbye!");
                break;
            }


        }

    }
}
