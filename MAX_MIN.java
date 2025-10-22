import java.util.Scanner;

public class MAX_MIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input no: 1 -");
        int a = input.nextInt();

        System.out.println("Enter the input no: 2 -");
        int b = input.nextInt();

        System.out.println("Enter the input no: 3 -");
        int c = input.nextInt();

        int maxValue = max(a, b, c);
        int minValue = min(a, b, c);

        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The minimum value is: " + minValue);
        sum(a,b,c);
        product(a,b,c);
        input.close();
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    static void sum(int a, int b, int c){
        int ans = a + b + c;
        System.out.println("The sum of three number is "+ans);
    }
    static void product(int a, int b, int c){
        int ans = a * b * c;
        System.out.println("The sum of three number is "+ans);
    }
}
