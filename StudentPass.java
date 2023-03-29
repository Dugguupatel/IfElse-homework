import java.util.Scanner;

public class StudentPass {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks;
        //the string to be print
        System.out.println("Enter score : ");
        marks = scanner.nextInt();

        //Checking the marks
        if (marks >= 35){
            //if condition is pass
            System.out.println("Pass");
                }else
            //if condition is false
                   System.out.println("Failed");
    }


}
