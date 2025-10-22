import java.util.Random;
import java.util.Scanner;

public class Bet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;
        System.out.println("***************************");
        System.out.println("  Welcome to Java Slots");
        System.out.println("Symbols: : 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("***************************");
        while (balance > 0) {
            System.out.println("Current Balance: 💵 " + balance);
            System.out.print("Enter you bet amount : ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Enter the valid bet amount");
                continue;
            } else {
                balance -= bet;
                System.out.println(" 💵 " + balance);
            }
            System.out.println("SPINNING...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if (payout > 0) {
                System.out.println("You Won 💵" + payout);
                balance += payout;
            } else {
                System.out.println("You lost this round");
            }
            System.out.println("Do you want to play again (Yes/No)?: ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("YES")) {
                break;
            }
        }
        System.out.println("***********");
        System.out.println("GAME OVER !");
        System.out.println("***********");
        System.out.println("Your Final balance is 💵" + balance);
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] rows = new String[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            rows[i] = symbols[random.nextInt(symbols.length)];
        }
        return rows;
    }

    static void printRow(String[] row) {
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}

