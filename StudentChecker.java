import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of registered units: ");
        int units = scanner.nextInt();

        if (units > 7) {
            System.out.println("Overload - Approval Required");
        } else {
            System.out.println("Registration Accepted");
        }

        System.out.println("\n--- Registration Summary ---");
        System.out.println("Student: " + name);
        System.out.println("Units: " + units);
    }
}