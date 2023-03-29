import java.util.Scanner;
//first create class
public class Average {
    //main method
        public static void main(String[] args) {
            //call the scanner
            Scanner scanner = new Scanner(System.in);

            //user to enter first number
            System.out.print("Input first number: ");
            int num1 = scanner.nextInt();
               //user to enter second number
               System.out.print("Input second number: ");
               int num2 = scanner.nextInt();
                   //user to enter third number
                   System.out.print("Input third number: ");
                   int num3 = scanner.nextInt();
                       //user to enter fourth
                       System.out.print("Input fourth number: ");
                       int num4 = scanner.nextInt();
                           //user to enter fifth
                           System.out.print("Enter fifth number: ");
                           int num5 = scanner.nextInt();

            //Calculate the five numbers
            System.out.println("Average of five numbers is: " +
                    (num1 + num2 + num3 + num4 + num5) / 5);
        }
    }

