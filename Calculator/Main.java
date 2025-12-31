import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Division obj = new Division(); // lowest child object

        System.out.println("Calculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        obj.setValues(a, b);

        switch (choice) {
            case 1:
                System.out.println("Result = " + obj.add());
                break;

            case 2:
                System.out.println("Result = " + obj.subtract());
                break;

            case 3:
                System.out.println("Result = " + obj.multiply());
                break;

            case 4:
                System.out.println("Result = " + obj.divide());
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
