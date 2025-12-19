import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = sc.nextLine();

        // Marks input
        System.out.print("English Marks: ");
        int english = sc.nextInt();

        System.out.print("Mathematics Marks: ");
        int maths = sc.nextInt();

        System.out.print("Social Science Marks: ");
        int social = sc.nextInt();

        System.out.print("Chemistry Marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Biology Marks: ");
        int biology = sc.nextInt();

        // Calculations
        int total = english + maths + social + chemistry + physics + biology;
        double percentage = total / 6.0;

        // Output
        System.out.println("\n----------------------------------------");
        System.out.println("              REPORT CARD               ");
        System.out.println("----------------------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Class : " + studentClass);
        System.out.println("----------------------------------------");
        System.out.println("SUBJECT           MARKS");
        System.out.println("----------------------------------------");
        System.out.println("English           " + english);
        System.out.println("Mathematics       " + maths);
        System.out.println("Social Science    " + social);
        System.out.println("Chemistry         " + chemistry);
        System.out.println("Physics           " + physics);
        System.out.println("Biology           " + biology);
        System.out.println("----------------------------------------");
        System.out.println("TOTAL : " + total);
        System.out.printf("PERCENTAGE : %.2f%%\n", percentage);
        System.out.println("----------------------------------------");

        sc.close();
    }
}
