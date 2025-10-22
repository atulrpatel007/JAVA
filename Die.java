import java.util.Random;
import java.util.Scanner;

public class Die {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int roll;
    int dices;
    int total = 0;
    System.out.println("Enter the no, of dice's :");
    dices = scanner.nextInt();
    if (dices>0){
        for (int i = 0;i<dices;i++){
            roll = random.nextInt(1,7);
            System.out.println("You have rolled: " + roll);
            display(roll);
            total += roll;
        }
        System.out.println("Total sum of the roll: " + total);
    }
    else{
        System.out.println("ENTER THE CORRECT VALUE");
    }
}
static void display(int roll){
    String dice1 = """
             -------
            |       |
            |   0   |
            |       |
             -------
            """;
    String dice2 = """
             -------
            | 0     |
            |       |
            |     0 |
             -------
            """;
    String dice3 = """
             -------
            | 0     |
            |   0   |
            |     0 |
             -------
            """;
    String dice4 = """
             -------
            | 0   0 |
            |       |
            | 0   0 |
             -------
            """;
    String dice5 = """
             -------
            | 0   0 |
            |   0   |
            | 0   0 |
             -------
            """;
    String dice6 = """
             -------
            | 0   0 |
            | 0   0 |
            | 0   0 |
             -------
            """;
    switch(roll){
       case 1 -> System.out.println(dice1);
       case 2 -> System.out.println(dice2);
       case 3 -> System.out.println(dice3);
       case 4 -> System.out.println(dice4);
       case 5 -> System.out.println(dice5);
       case 6 -> System.out.println(dice6);
       default -> System.out.println("Invalid Output");
    }
}
}
