import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int rounds = 0;
        int wins = 0;

        System.out.println("Welcome to the Number Guessing Game ! ");
        System.out.println("I'm thinking of a number between 1 and 100 ");

        while (playAgain) {
            int maxAttempts = 10; 
            int attempts = 0;
            int numberToGuess = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100");
                    attempts--;
                    continue;
                }

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessedCorrectly = true;
                    wins++;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low Try again");
                } else {
                    System.out.println("Too high Try again");
                }
            }

            if (!guessedCorrectly) {
                System.out.println(" you run out of attempts. The number was " + numberToGuess + ".");
            }

            rounds++;
            System.out.print("Do you want to play again !! (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game Over hahaha");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Total Rounds Won: " + wins);
        System.out.println("Your score: " + wins + " out of " + rounds + " rounds");
        scanner.close();
    }
}