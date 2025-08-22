import java.util.Random;
import java.util.Scanner;
 class GuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0; // Initialize guess to 0

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it.");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again!");
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly!");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}