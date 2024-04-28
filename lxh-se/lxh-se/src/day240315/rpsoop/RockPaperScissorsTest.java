package day240315.rpsoop;

public class RockPaperScissorsTest {
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        String userPick = game.getUserPick();
        String computerPick = game.getComputerPick();
        String result = game.getResult(userPick, computerPick);

        System.out.println("User Pick" + userPick);
        System.out.println("Computer Pick" + computerPick);
        System.out.println("You" + result);
    }
}
