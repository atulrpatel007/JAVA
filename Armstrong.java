import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start input: ");
        int start = input.nextInt();
        int end = input.nextInt();
        for(int i = start ; i<=end ; i++){
            if (arm(i)){
                System.out.println(i);
            }
        }
        input.close();
    }
    static boolean arm (int num){
        int originalNumber = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }
        return result == originalNumber;
    }
}

