import java.util.Scanner;
//call the scanner
public class Find_Value {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter one value
        System.out.println("Input first amount: ");
        int a = scanner.nextInt();

        //enter second value
        System.out.println("Input second amount: ");
        int b = scanner.nextInt();

        //find addition,subtraction,multiplication and division
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));


    }
}


