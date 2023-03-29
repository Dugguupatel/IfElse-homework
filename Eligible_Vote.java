import java.util.Scanner;
// call the scanner
public class Eligible_Vote {
    Scanner scanner = new Scanner(System.in);

    public void eligibleforvote (){
        //acknowledge the user what to enter
        System.out.println("pLEASE Enter your age: ");

        //storing age in variable using scanner object
        int age = scanner.nextInt();

        //now you to put the condition in the statement
        if (age >= 18){
            //This will only be called if the age is 18 or Above
            System.out.println("You are eligible for vote as your age is :" + age);

        }else {
            System.out.println("You are NOT eligible for vote as your age is :" + age);
        }
    }

    //main method
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        Eligible_Vote eligibleVote = new Eligible_Vote();
        //calling method using class object
        eligibleVote.eligibleforvote();
    }

}
