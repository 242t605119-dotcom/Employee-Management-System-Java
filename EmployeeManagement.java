import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String id = "";
        String department = "";
        double salary = 0;

        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter employee ID: ");
                id = sc.nextLine();

                System.out.print("Enter employee name: ");
                name = sc.nextLine();

                System.out.print("Enter department: ");
                department = sc.nextLine();

                System.out.print("Enter salary: ");
                salary = sc.nextDouble();

                System.out.println("Employee added successfully!");

            } else if (choice == 2) {

                if (id.isEmpty()) {
                    System.out.println("No employee found.");
                } else {
                    System.out.println("\nEmployee Details");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                }

            } else if (choice == 3) {

                if (id.isEmpty()) {
                    System.out.println("No employee found.");
                } else {
                    System.out.print("Enter new salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Salary updated successfully!");
                }

            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
