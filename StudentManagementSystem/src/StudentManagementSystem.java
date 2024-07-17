import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ManagementSystem sms = new ManagementSystem();

    public static void main(String[] args) {
        // Load students from file
        List<Student> loadedStudents = DataStorage.loadStudents();
        for (Student student : loadedStudents) {
            sms.addStudent(student);
        }

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    // Save students to file
                    DataStorage.saveStudents(sms.getStudents());
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        if (isValidInput(name, studentId, phoneNumber, gender, email)) {
            Student student = new Student(name, studentId, phoneNumber, gender, email);
            sms.addStudent(student);
            System.out.println("Student added.");
        } else {
            System.out.println("Invalid input. All fields must be filled.");
        }
    }  

    private static void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        String studentId = scanner.nextLine();
        sms.removeStudent(studentId);
    }

    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String studentId = scanner.nextLine();
        Student student = sms.searchStudent(studentId);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static boolean isValidInput(String name, String studentId, String phoneNumber, String gender, String email) {
        return !name.isEmpty() && !studentId.isEmpty() && !phoneNumber.isEmpty() &&
               !gender.isEmpty() && !email.isEmpty();
    }
}

