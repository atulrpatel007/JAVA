import java.util.Scanner;

public class palindrome {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.nextLine();
        StringBuilder rev = new StringBuilder(s);
        String reverse = rev.reverse().toString();
        if (reverse.equals(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("No");
        }
    }
}
