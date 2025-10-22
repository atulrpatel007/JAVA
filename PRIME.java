import java.util.Scanner;

public class PRIME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        System.out.println(prime(a));
        input.close();
    }
    static boolean prime(int n){
       if (n<=1){
           return false;
       }
       int c =2;
       while (c*c<=n){
           if (n%c == 0){
               return false;
           }
           c++;
       }
       if (c*c>n){
           return true;
       }
       return false;
    }
}
