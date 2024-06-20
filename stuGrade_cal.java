import java.util.Scanner;

public class stuGrade_cal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSubjects;
        int totalMarks = 0;
        double averagePercentage;
        char grade;

        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                continue; 
            }
            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / totalSubjects;

       
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

