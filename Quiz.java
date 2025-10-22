import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year Facebook launched?",
                "Who is known as the father of computer?",
                "What was the first programming language?"
        };
        String[][] options = {
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            answer = scanner.nextInt();
            if (answer >= 1 && answer <= 4) {
                if (answer == answers[i]) {
                    System.out.println("********");
                    System.out.println("CORRECT!");
                    System.out.println("********");
                    score++;
                } else {
                    System.out.println("******");
                    System.out.println("WRONG!");
                    System.out.println("******");
                }
            } else {
                System.out.println("Enter a valid option (1-4)!");
            }
        }
        System.out.println("\nYou answered " + score + " out of " + questions.length + " correctly.");
        scanner.close();
    }
}
