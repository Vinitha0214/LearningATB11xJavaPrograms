package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 10

        Random random = new Random(); // it's a java class, it will give you the random number
        int numberToGuess = random.nextInt(100)+1; // we want 10 also, so +1 included
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guess number");

        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess){
                System.out.println("Too low, try again");
            }
            else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! you guessed it in " + attempts + " attempts");
                break;
            }
        }
    }
}
