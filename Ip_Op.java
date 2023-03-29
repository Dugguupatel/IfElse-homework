import java.util.Scanner;

public class Ip_Op {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        number = scanner.nextInt();

        //check the number is greater than 0 or NOT
        if (number > 0) {
            System.out.println("The number is POSITIVE");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE");
        } else {
            System.out.println("The number is ZERO");
        }
    }
}







