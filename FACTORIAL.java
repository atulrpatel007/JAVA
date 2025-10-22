import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        System.out.println("Enter the input number : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int output = factorial(x);
        System.out.println("Factorial of " + x + " is: " + output);
        input.close();
    }
    static int factorial(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factorial(x - 1);
    }

}
