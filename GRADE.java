import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class GRADE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int n = input.nextInt();
        String s = grade(n);
        System.out.println("Your Grade is: "+s);
        input.close();
    }
    static String grade(int n){
        if (91<=n && n<=100){
            String r = "AA";
            return r;
        }
        else if (81<=n && n<=90){
            String r = "AB";
            return r;
        }
        else if (71<=n && n<=80){
            String r = "BB";
            return r;
        }
        else if (61<=n && n<=70){
            String r = "BC";
            return r;
        }
        else if (51<=n && n<=60){
            String r = "CD";
            return r;
        }
        else if (41<=n && n<=50){
            String r = "DD";
            return r;
        }
        else {
            String r = "Padhle Laude";
            return r;
        }
    }
}
