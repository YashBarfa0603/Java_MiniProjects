import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for ROCK, 1 for PAPER, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer choice: Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer choice: Scissors");
        }

        if (userInput == computerInput) {
            System.out.println("DRAW");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("YOU WINNNNN !!!!!");
        } else {
            System.out.println("COMPUTER WINN!!!");
        }
    }
}
