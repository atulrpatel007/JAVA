import java.util.Scanner;

public class PYTHAGOREAN
{
    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        return x * x == y * y + z * z;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of 1 side: ");
        int a = input.nextInt();
        System.out.print("Enter the length of 2 side: ");
        int b = input.nextInt();
        System.out.print("Enter the length of 3 side: ");
        int c = input.nextInt();
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println(a + ", " + b + ", " + c + " do not form a Pythagorean triplet.");
        }
    }
}
