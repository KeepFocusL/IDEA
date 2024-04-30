package day240315.rps;

import java.util.Scanner;

public class RockPaperScissors {
    //returns computer either "rock","paper" or "scissors"
    String getComputerChoice() {
        String computerChoice;
        int randomNumber = (int) (Math.random() * 3) + 1;

        if (randomNumber == 1) {
            computerChoice = "rock";
        } else if (randomNumber == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }
        return computerChoice;
    }
    //returns user input
    String getUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock,paper or scissors:");
        String userInput = input.nextLine();

        userInput = userInput.toLowerCase();
        return userInput;
    }
    // return either "win", "lose" or "draw"
    String getResult(String userInput, String computerChoice) {
        // condition for user to draw
        if (userInput.equals(computerChoice)) {
            return "draw";
        }

        // condition for user to win
        else if (userInput.equals("paper") && computerChoice.equals("rock")) {
            return "win";
        } else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
            return "win";
        } else if (userInput.equals("scissors") && computerChoice.equals("paper")) {
            return "win";
        }

        // all other conditions result to loss
        else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        //creat object of Main class

        RockPaperScissors rps = new RockPaperScissors();
        //get user input

        String userInput;
        while (true) {
            userInput = rps.getUserInput();

            if (userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors")) {
                break;
            }
        }

        //get computer choice
        String computerChoice = rps.getComputerChoice();
        //get results
        String result = rps.getResult(userInput, computerChoice);

        System.out.println("user Input:" + userInput);
        System.out.println("computer Choice:" + computerChoice);
        System.out.println(result);
    }
}