/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a driver file for the class Die. This driver file is to
                create an instance of Die that represent a particular die that was received in Lab. Then the attributes
                of die are to be displayed to the user. Next, the user is to be prompted to play a game. If they choose
                to play, then they are to be asked to enter a guess on how many rolls it will take to roll a particular
                dice value. Then the program should roll the die until the value is rolled. If the first roll of the
                number is equal to the user's guess, the program will communicate that the user has won. If the user
                was incorrect, they should be told the amount of rolls it took to obtain that number.

Name: John Daggs
Date: 2/18/2022
Section: CSC 331-002
======================================================================================================================
*/

//import statements
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int [] sideValues = {1, 2, 3, 4, 5 ,6 ,7 ,8}; // initialize sideValues array with the sides values of the die
        Die gameDie = new Die(8, "brown", "gold", "white", sideValues); // create an instance of the object Die using the class constructor

        System.out.print(gameDie); // printing the dice information of gameDie

        int answer = 1;  // initialize answer variable for program while-loop for additional tries of game

        Scanner input = new Scanner(System.in);  // initialize a Scanner object for input from user
        System.out.print("Would you like to play a game? (Enter -1 to quit and 1 to play)"); // prompt user, asking whether they want to play game . . . -1 to quit 1 to play
        answer = input.nextInt(); // obtain input from the user

        while (answer != -1) { // while the answer is not equal to -1 . . . user chose to play game


            while (answer != 1 & answer != -1){ // while the answer given by the user is not 1 or -1

                System.out.print("\nERROR Invalid Input . . . Would you like to play a game? (Enter -1 to quit and 1 to play): ");  // ERROR message to show user their input was invalid, prompts user to choose to play or not again
                answer = input.nextInt();  // initialize answer variable to the input given by the user . . . if 1 is entered, the game will be prompted to the user
            }

            int value = gameDie.roll(); // initialize a value to a random roll of the gameDie
            System.out.print("How many rolls it will take to roll a " + value + "?\n"); // Prompt the user to guess how many rolls it will take to roll the random generated value
            int guess = input.nextInt(); // take input (guess) from the user
            while(guess < 1){ // while the user's guess is less than 1, which would bean invalid answer
                System.out.print("Please make a valid guess: "); // user prompted to make a valid guess
                guess = input.nextInt(); // take input (guess) from the user
            }

            int rollCount = 0; // initialize variable to keep count of the number of rolls
            int rollResult = 0; // initialize a variable that will hold the result of each roll
            while (guess > 0){ // while the user has made a valid guess
                rollResult = gameDie.roll(); // roll the game die, set rollResult to the return value of roll()
                rollCount += 1; // increment the rollCount
                if(rollResult == value){ // if the rollResult is equal to the target value
                    if(rollCount == guess){ // and if the roll count is equal to the guess made by user
                        System.out.print("You were correct! It took " + rollCount + " roll(s) to roll a " + value + "!"); // user prompted they won
                        break; // break out of loop
                    }else{ // if the roll count was not equal to the guess mad eby the user
                        System.out.print("You were incorrect! It took " + rollCount + " roll(s) to roll a " + value + " . . . You guessed " + guess + " rolls" ); // user prompted they were incorrect, given correct number of rolls
                        break; // break out of loop
                    }
                }

            }

            System.out.print("\nWould you like to play a game? (Enter -1 to quit and 1 to play)"); // user prompted if they would like to play the game again
            answer = input.nextInt(); // take input from user, store in answer variable

            while (answer != 1 & answer != -1){ // while the answer given by the user is not 1 or -1 // while invalid input has been given by user

                System.out.print("\nERROR Invalid Input . . . Would you like to play a game? (Enter -1 to quit and 1 to play): ");  // ERROR message to show user their input was invalid, prompts user to choose to play or not again
                answer = input.nextInt();  // initialize answer variable to the input given by the user . . . if 1 is entered, the game will be prompted to the user
            }
        }


    }
}