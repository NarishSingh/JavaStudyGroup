package com.ns.beginnerjavaapps.reviewApps;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        boolean playing = false;
        Scanner numInput = new Scanner(System.in); //problem with the \n \r (carriage return) being sucked in by .nextLine()
        Scanner charInput = new Scanner(System.in); //keep them separate and happy

        do {
            System.out.println("Welcome to RPS!!!");
            System.out.print("Please enter the # of rounds to play: "); //1-10 rounds
            int rounds = numInput.nextInt();
            if (rounds > 10 || rounds < 1) {
                throw new IllegalArgumentException("Invalid input"); //if negative or over 10 rounds, throw exception and quit
            }

            //create a loop, from 0/1 up to the # of rounds to be played
            for (int i = 0; i < rounds; i++) {
//                System.out.println("Round " + (i + 1));
            }

            //determine if the player wants to play another game or not
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = charInput.nextLine();
            if (playAgain.equals("Y") || playAgain.equals("y")) {
                playing = true;
            } else if (playAgain.equals("N") || playAgain.equals("n")) {
                playing = false;
            } else {
                System.out.println("Invalid numInput. Quitting game");
                playing = false;
            }
        } while (playing);

        System.out.println("Thank you for playing.");
    }
}
