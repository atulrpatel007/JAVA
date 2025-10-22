import java.util.Scanner;

public class odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = input.nextInt();
        if (n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
