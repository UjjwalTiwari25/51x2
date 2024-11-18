package com.basicProblems;

import java.util.Random;
import java.util.Scanner;

class GamePlay {
    int overs;
    int maxWickets;
    int wicketsPlayer1;
    int runsPlayer1;
    int wicketsPlayer2;
    int runsPlayer2;
    String player1Name;
    String player2Name;

    void gameReset(int overs, int maxWickets) {
        this.overs = overs;
        this.maxWickets = maxWickets;
        this.wicketsPlayer1 = maxWickets;
        this.runsPlayer1 = 0;
        this.wicketsPlayer2 = maxWickets;
        this.runsPlayer2 = 0;
    }

    void setPlayerNames(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    void gameRules() {
        System.out.println("Welcome to the Cricket Game!\n"
                + player1Name + " will bat first.\n"
                + "Match will be of " + overs + " overs\n"
                + "Each team has " + maxWickets + " wickets.\n"
                + "Press '5' to HIT, '9' to check SCORE, and '7' to check TARGET while batting.\n"
                + "Let's get started!\n");
    }

    void gamePlay() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int ballsPerInning = overs * 6;

        // Player 1 Batting
        int ballsRemaining = ballsPerInning;
        System.out.println(player1Name + " is batting.\n");

        while (wicketsPlayer1 > 0 && ballsRemaining > 0) {
            System.out.println("Press '5' to hit, '9' to check score.");
            switch (input.nextInt()) {
                case 5 -> {
                    ballsRemaining--;
                    int runs = rand.nextInt(8);
                    if (runs == 7) {
                        System.out.println("Ooops, OUT!");
                        wicketsPlayer1--;
                    } else {
                        runsPlayer1 += runs;
                        displayShotCommentary(runs);
                    }
                }
                case 9 -> displayScore(player1Name, runsPlayer1, maxWickets - wicketsPlayer1, ballsPerInning - ballsRemaining);
                default -> System.out.println("Invalid input, please try again.");
            }
        }
        System.out.println(player1Name + "'s innings is over.");
        displayScore(player1Name, runsPlayer1, maxWickets - wicketsPlayer1, ballsPerInning - ballsRemaining);

        // Player 2 Batting
        ballsRemaining = ballsPerInning;
        System.out.println("\n" + player2Name + " is batting, chasing a target of " + (runsPlayer1 + 1) + " runs.\n");

        while (wicketsPlayer2 > 0 && ballsRemaining > 0 && runsPlayer2 <= runsPlayer1) {
            System.out.println("Press '5' to hit, '9' to check score, '7' to check target.");
            switch (input.nextInt()) {
                case 5 -> {
                    ballsRemaining--;
                    int runs = rand.nextInt(8);
                    if (runs == 7) {
                        System.out.println("Ooops, OUT!");
                        wicketsPlayer2--;
                    } else {
                        runsPlayer2 += runs;
                        displayShotCommentary(runs);
                    }
                }
                case 9 -> displayScore(player2Name, runsPlayer2, maxWickets - wicketsPlayer2, ballsPerInning - ballsRemaining);
                case 7 -> System.out.println("Target: " + (runsPlayer1 + 1) + ", Runs needed: " + ((runsPlayer1 + 1) - runsPlayer2) + ", Balls left: " + ballsRemaining);
                default -> System.out.println("Invalid input, please try again.");
            }
        }
        System.out.println(player2Name + "'s innings is over.");
        displayScore(player2Name, runsPlayer2, maxWickets - wicketsPlayer2, ballsPerInning - ballsRemaining);

        // Display the final result
        displayResult();
    }

    void displayScore(String playerName, int runs, int wickets, int ballsUsed) {
        System.out.println(playerName + "'s Score:");
        System.out.println("Runs: " + runs + "\nWickets: " + wickets + "\nOvers: " + (ballsUsed / 6) + "." + (ballsUsed % 6) + "\n");
    }

    void displayShotCommentary(int runs) {
        switch (runs) {
            case 0 -> System.out.println("No run, better luck next ball!");
            case 1 -> System.out.println("Good single!");
            case 2 -> System.out.println("Quick double!");
            case 3 -> System.out.println("Well run, three runs!");
            case 4 -> System.out.println("Boundary! Four runs!");
            case 6 -> System.out.println("It's a SIX! Massive hit!");
            default -> System.out.println(runs + " runs scored!");
        }
    }

    void displayResult() {
        if (runsPlayer1 > runsPlayer2) {
            System.out.println(player1Name + " wins by " + (runsPlayer1 - runsPlayer2) + " runs!");
        } else if (runsPlayer2 > runsPlayer1) {
            System.out.println(player2Name + " wins by " + (maxWickets - wicketsPlayer2) + " wickets!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

public class CricketGameV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Player 1 Name: ");
        String player1Name = input.nextLine();
        System.out.print("Enter Player 2 Name: ");
        String player2Name = input.nextLine();

        System.out.print("Enter number of overs: ");
        int overs = input.nextInt();
        System.out.print("Enter number of wickets per player: ");
        int maxWickets = input.nextInt();

        GamePlay game = new GamePlay();
        game.setPlayerNames(player1Name, player2Name);
        game.gameReset(overs, maxWickets);
        game.gameRules();
        game.gamePlay();

        System.out.println("Game over. Thanks for playing!");
    }
}
