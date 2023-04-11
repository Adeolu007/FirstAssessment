package FirstAssessment;

import java.security.SecureRandom;
import java.util.Scanner;
//6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
//        program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//        The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
//        guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//        low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//        user for the next guess. When the user enters the correct answer, display Congratulations. You
//        guessed the number!, and allow the user to choose whether to play again.
public class GuessTheNumber {

    public static void
    guessingNumberGame() {

        Scanner sc = new Scanner(System.in);


        SecureRandom rand = new SecureRandom();
        int randomNumber = rand.nextInt(100) + 1;



        for (int i = 0; i <100 ; i++) {
            System.out.println("Guess the number:");


            int guess = sc.nextInt();


            if (randomNumber == guess) {
                System.out.println("Congratulations. You guessed the number!");
                break;

            } else if (randomNumber > guess ) {
                System.out.println("Too high!! The number is higher, guess again");
            } else if (randomNumber < guess ) {
                System.out.println("Too Low!! The number is lower, guess again");
            }



        }}


        public static void main(String arg[]) {


            guessingNumberGame();
        }
    }

