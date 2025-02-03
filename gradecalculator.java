import java.util.Scanner;

    public class gradecalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
           
            System.out.print("Enter the number of subjects: ");
            int numofSubjects = scanner.nextInt();
    
          
            int[] marks = new int[numofSubjects];
    
        
            System.out.println("Enter the marks obtained in each subject (out of 100):");
            for (int i = 0; i < numofSubjects; i++) {
                marks[i] = scanner.nextInt();
            }
    
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
    
          
            double averagePercentage = (double) totalMarks / numofSubjects;
    
            String grade;
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B+";
            } else if (averagePercentage >= 60) {
                grade = "B";
            } else if (averagePercentage >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }
    
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
    
            scanner.close();
        }
    }
    
