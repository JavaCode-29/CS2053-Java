import java.util.Scanner;

class Employee {
    private String name;
    private String email;
    private String department;
    private double salary;
    
    public Employee(String name, String email, String department, double salary) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Department: " + this.department.toUpperCase());
        System.out.println("Salary: $" + this.salary);
    }
    
    public void updateSalary(double increment) {
        this.salary = this.salary + increment;
        System.out.println("Salary updated to: $" + this.salary);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("HR Onboarding System");
        System.out.println("====================\n");
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        Employee emp = new Employee(name, email, department, salary);
        emp.displayDetails();
        
        if (args.length > 0) {
            System.out.println("\nProcessing command-line arguments...");
            System.out.println("Number of arguments: " + args.length);
            
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
            
            if (args.length >= 2 && args[0].equals("INCREMENT")) {
                double increment = Double.parseDouble(args[1]);
                System.out.println("\nApplying salary increment of $" + increment);
                emp.updateSalary(increment);
            }
        }
        
        System.out.println("\nString Operations Demo:");
        System.out.println("Name length: " + emp.getName().length());
        System.out.println("Email contains '@': " + emp.getEmail().contains("@"));
        System.out.println("Name in uppercase: " + emp.getName().toUpperCase());
        System.out.println("Name in lowercase: " + emp.getName().toLowerCase());
        
        scanner.close();
    }
}
