import javax.swing.*;
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the user :");
        int age = input.nextInt();
        check(age);
        vote(age);
        input.close();
    }
    static void check(int age){
        if (age%2==0){
            System.out.println("The age is a even number");
        }
        else {
            System.out.println("The age is a odd number");
        }
    }
    static void vote(int age){
        if (age>=18){
            System.out.println("You can vote");
        } else if (0<=age && age<18) {
            System.out.println("Nikal Laude");
        } else {
            System.out.println("Tori Mai ko choddo");
        }
    }
}
