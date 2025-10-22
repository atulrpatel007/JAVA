import java.util.Scanner;

public class fibonacci {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many number series you want :");
        int n = input.nextInt();
        int a=0;
        int b=1;
        while(n!=0){
            System.out.println(a);
            int c = a + b;
            a=b;
            b=c;
            n--;
        }
    }
}
