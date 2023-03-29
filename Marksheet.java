import java.util.Scanner;
//first create class
public class Marksheet {
    //call the scanner
    Scanner scanner = new Scanner(System.in);
    String student_name;
    int roll_no;
    int maths, eng, sci;
    int total_marks;
    public void score() {
        //Acknowledge the user what to enter
        System.out.println("Enter your name:");
        student_name = scanner.nextLine();
        System.out.println("Enter your roll_no:");
        roll_no = scanner.nextInt();
        System.out.println("Enter your maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Enter your eng marks: ");
        int eng = scanner.nextInt();
        System.out.println("Enter your sci: ");
        int sci = scanner.nextInt();

        //total of marks
        int total = maths + eng + sci;
        //percentage of Total marks
        double percentage = (total / 3);

        System.out.println("Your total marks=" + (total));
        System.out.println("Your percentage is=" + percentage);

        //You to put the condition in the if statement
        if (percentage >= 80 && percentage <= 100) {
            System.out.println("Your grade is A+");
              } else if (percentage >= 60 && percentage <= 80) {
                System.out.println("Your grade is A");
                 } else if (percentage >= 50 && percentage <= 60) {
                   System.out.println("Your grade is B");
                    } else if (percentage >= 35 && percentage <= 50) {
                     System.out.println("Your grade is c");
                       } else {
                         //if the condition in the else statement is wrong
                           System.out.println("grade = Failed");
                                                                 }
                                                                   }
    //main method
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        Marksheet marksheet = new Marksheet();
        //calling method using class object
        marksheet.score();
    }
}






