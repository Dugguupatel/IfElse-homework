import java.util.Scanner;
//first create class
public class LeapYear {
    //create the scanner class
    Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String[] args) {

        int year;
        System.out.println("Enter an year :");
        Scanner scanner1 = new Scanner(System.in);
        year = scanner1.nextInt();


            if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0))
                System.out.println("This year is a leap year");
                    else
                       System.out.println("This year is not a leap year");
        }
    }



