import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Universal Geometry Calculator ======");
            System.out.println("What do you want to calculate?");
            System.out.println("1. Area");
            System.out.println("2. Perimeter");
            System.out.println("3. Volume");
            System.out.println("4. Surface Area");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> areaCalculator(sc);
                case 2 -> perimeterCalculator(sc);
                case 3 -> volumeCalculator(sc);
                case 4 -> surfaceAreaCalculator(sc);
                case 0 -> {
                    System.out.println("Exiting the calculator. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }
        }
    }

    public static void areaCalculator(Scanner sc) {
        System.out.println("\n-- Area Calculator --");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");
        System.out.print("Enter your choice: ");
        int shape = sc.nextInt();

        switch (shape) {
            case 1 -> {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle: " + (Math.PI * r * r));
            }
            case 2 -> {
                System.out.print("Enter base and height: ");
                double b = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Area of Triangle: " + (0.5 * b * h));
            }
            case 3 -> {
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble(), br = sc.nextDouble();
                System.out.println("Area of Rectangle: " + (l * br));
            }
            case 4 -> {
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble(), height = sc.nextDouble();
                System.out.println("Area of Isosceles Triangle: " + (0.5 * base * height));
            }
            case 5 -> {
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble(), height = sc.nextDouble();
                System.out.println("Area of Parallelogram: " + (base * height));
            }
            case 6 -> {
                System.out.print("Enter diagonals d1 and d2: ");
                double d1 = sc.nextDouble(), d2 = sc.nextDouble();
                System.out.println("Area of Rhombus: " + (0.5 * d1 * d2));
            }
            case 7 -> {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of Equilateral Triangle: " + ((Math.sqrt(3) / 4) * side * side));
            }
            default -> System.out.println("Invalid shape choice.");
        }
    }

    public static void perimeterCalculator(Scanner sc) {
        System.out.println("\n-- Perimeter Calculator --");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Parallelogram");
        System.out.println("5. Equilateral Triangle");
        System.out.println("6. Rhombus");
        System.out.print("Enter your choice: ");
        int shape = sc.nextInt();

        switch (shape) {
            case 1 -> {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Perimeter (Circumference) of Circle: " + (2 * Math.PI * r));
            }
            case 2 -> {
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
            }
            case 3 -> {
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Perimeter of Square: " + (4 * s));
            }
            case 4 -> {
                System.out.print("Enter base and side: ");
                double base = sc.nextDouble(), side = sc.nextDouble();
                System.out.println("Perimeter of Parallelogram: " + (2 * (base + side)));
            }
            case 5 -> {
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Perimeter of Equilateral Triangle: " + (3 * s));
            }
            case 6 -> {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Perimeter of Rhombus: " + (4 * side));
            }
            default -> System.out.println("Invalid shape choice.");
        }
    }

    public static void volumeCalculator(Scanner sc) {
        System.out.println("\n-- Volume Calculator --");
        System.out.println("1. Cone");
        System.out.println("2. Prism (Rectangular)");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        System.out.print("Enter your choice: ");
        int shape = sc.nextInt();

        switch (shape) {
            case 1 -> {
                System.out.print("Enter radius and height: ");
                double r = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Volume of Cone: " + ((1.0 / 3) * Math.PI * r * r * h));
            }
            case 2 -> {
                System.out.print("Enter base area and height: ");
                double baseArea = sc.nextDouble(), height = sc.nextDouble();
                System.out.println("Volume of Prism: " + (baseArea * height));
            }
            case 3 -> {
                System.out.print("Enter radius and height: ");
                double r = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Volume of Cylinder: " + (Math.PI * r * r * h));
            }
            case 4 -> {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * r * r * r));
            }
            case 5 -> {
                System.out.print("Enter base area and height: ");
                double base = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Volume of Pyramid: " + ((1.0 / 3) * base * h));
            }
            default -> System.out.println("Invalid shape choice.");
        }
    }

    public static void surfaceAreaCalculator(Scanner sc) {
        System.out.println("\n-- Surface Area Calculator --");
        System.out.println("1. Curved Surface Area of Cylinder");
        System.out.println("2. Total Surface Area of Cube");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter radius and height: ");
                double r = sc.nextDouble(), h = sc.nextDouble();
                System.out.println("Curved Surface Area of Cylinder: " + (2 * Math.PI * r * h));
            }
            case 2 -> {
                System.out.print("Enter side of cube: ");
                double s = sc.nextDouble();
                System.out.println("Total Surface Area of Cube: " + (6 * s * s));
            }
            default -> System.out.println("Invalid shape choice.");
        }
    }
}
