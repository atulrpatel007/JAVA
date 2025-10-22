import java.util.Scanner;
import java.util.Random;

    public class RCSgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"ROCK", "PAPER", "SCISSOR"};
        String playerChoice;
        String computerChoice;
        String playAgain = "YES";
        do {
            System.out.print("Enter your move (Rock, Paper, Scissor): ");
            playerChoice = scanner.nextLine().toUpperCase();
            if (!playerChoice.equals("ROCK") && !playerChoice.equals("PAPER") && !playerChoice.equals("SCISSOR")) {
                System.out.println("Invalid choice! Please enter ROCK, PAPER, or SCISSOR.");
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("ROCK") && computerChoice.equals("SCISSOR")) ||
                    (playerChoice.equals("PAPER") && computerChoice.equals("ROCK")) ||
                    (playerChoice.equals("SCISSOR") && computerChoice.equals("PAPER"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }
            System.out.println("Play again (YES/NO): ");
            playAgain = scanner.nextLine().toUpperCase();
        }while(playAgain.equals("YES"));
        System.out.println("Thanks for playing");
        scanner.close();
    }
}
