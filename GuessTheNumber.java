import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guesses it right, it was %d\n you guesses it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low.....");
        } else if (inputNumber > number) {
            System.out.println("Too High.....");
        }
        return false;
    }
}



public class GuessTheNumber {
    public static void main(String[] args) {
        boolean b = false;
        Game g = new Game();
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}