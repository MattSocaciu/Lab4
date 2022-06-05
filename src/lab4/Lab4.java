package lab4;

import java.util.Random;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
            Scanner Keyboard = new Scanner(System.in);
        while (true) {

            //computer chooses a random choice from the array
            String[] rockpaperscissorslizzardspock = {"Rock", "Paper", "Scissors", "Lizard", "Spock" };
            String computerMove = rockpaperscissorslizzardspock[new Random().nextInt(rockpaperscissorslizzardspock.length)];

            String userMove;

            //Displays the intro and also replays the intro if a person doesn't put a proper move in
            while (true) {
                System.out.println("Please enter your move (Rock, Paper, Scissors, Lizard, or Spock).");
                userMove = Keyboard.nextLine();
                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors") || userMove.equals("Lizard") || userMove.equals("Spock")) {
                    break;
                }
                System.out.println(userMove + " is not a valid move.");
            }

            //Displays what the computer played
            System.out.println("The Computer played: " + computerMove);

            //Displays a tie if the moves are the same
            if (userMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            }

            // Logic choices for rock
            else if (userMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Paper covers rock. You lost!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Rock crushes scissors. You won!");
                } else if (computerMove.equals("Lizard")) {
                    System.out.println("Rock crushes lizard. You won!");
                } else if (computerMove.equals("Spock")) {
                    System.out.println("Spock vaporizes the rock. You lose!");
                }
            }
            // Logic choices for paper
            else if (userMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("Paper covers rock. You win!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("scissors cuts paper. You lost!");
                } else if (computerMove.equals("Lizard")) {
                    System.out.println("Lizard eats paper. You lose!");
                } else if (computerMove.equals("Spock")) {
                    System.out.println("Paper disproves spock. You win!");
                }
            }
            // Logic choices for scissors
            else if (userMove.equals("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Scissors cuts paper. You win!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Rock crushes scissors. You lost!");
                } else if (computerMove.equals("Lizard")) {
                    System.out.println("Scissors decapitates lizard. You win!");
                } else if (computerMove.equals("Spock")) {
                    System.out.println("Spock smashes scissors. You lost!");
                }
            }
            // Logic choices for lizard
                else if (userMove.equals("Lizard")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Lizard eats paper. You win!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Rock crushes the lizard. You lost!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Scissors decapitates lizard. You lose!");
                } else if (computerMove.equals("Spock")) {
                    System.out.println("Lizard poisons spock. You win!");
                }
            }
                // Logic choices for spock
            else if (userMove.equals("Spock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Paper disproves spock. You lose!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Spock vaporizes the rock. You win!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Spock smashes scissors. You win!");
                } else if (computerMove.equals("Lizard")) {
                    System.out.println("Lizard poisons spock. You lose!");
                }
            }
            System.out.println("Would you like to play again? (y/n)");
            String playagain = Keyboard.nextLine();

            if (!playagain.equals("y")) {
                break;
            }
        }
        Keyboard.close();
    }
}