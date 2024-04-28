package day240315.rpsoop;

import java.util.Scanner;

public class RockPaperScissors {
    //state
    String userPick;
    String computerPick;
    String result;

    //constructor
    String getComputerPick() {
        String ComputerPick;
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 1) {
            ComputerPick = "rock";
        } else if (randomNumber == 2) {
            ComputerPick = "paper";
        } else {
            ComputerPick = "scissors";
        }
        return ComputerPick;
    }


    String getUserPick() {
        Scanner input = new Scanner(System.in);
        String userPick;
        while (true) {
            System.out.println("Enter rock,paper or scissors");
            userPick = input.nextLine();
            if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors"))
                break;
        }
        return userPick;
    }

    //behavior
    String getResult(String userPick, String computerPick) {
        if (userPick.equals(computerPick)) {
            return "draw";
        } else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        } else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        } else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        } else {
            return "lose";
        }
    }
}