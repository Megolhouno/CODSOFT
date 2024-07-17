import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        while (numSubjects <= 0) {
            System.out.print("Invalid number of subjects. Please enter a positive number: ");
            numSubjects = scanner.nextInt();
        }

        int[] grades = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Please enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            grades[i] = marks;
            totalMarks += marks; 
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "B+";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C+";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 40) {
            grade = "D+";
        } else if (averagePercentage >= 30) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("\nStudent Result:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
