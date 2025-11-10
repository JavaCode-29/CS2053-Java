import java.util.*;

public class Lab9 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n1. Add Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            if(choice == 1) {
                System.out.print("Enter marks: ");
                int mark = sc.nextInt();
                marks.add(mark);
                System.out.println("Marks added successfully");
            }
            else if(choice == 2) {
                System.out.println("Student Marks:");
                Iterator<Integer> it = marks.iterator();
                int i = 1;
                while(it.hasNext()) {
                    System.out.println("Student " + i + ": " + it.next());
                    i++;
                }
            }
            else if(choice == 3) {
                System.out.print("Enter position to update (1 to " + marks.size() + "): ");
                int pos = sc.nextInt();
                System.out.print("Enter new marks: ");
                int newMark = sc.nextInt();
                marks.set(pos - 1, newMark);
                System.out.println("Marks updated successfully");
            }
            else if(choice == 4) {
                System.out.print("Enter position to delete (1 to " + marks.size() + "): ");
                int pos = sc.nextInt();
                marks.remove(pos - 1);
                System.out.println("Marks deleted successfully");
            }
            else if(choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        
        sc.close();
    }
}
