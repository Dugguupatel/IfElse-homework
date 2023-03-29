import java.util.Calendar;
import java.util.Scanner;

public class Week_Days {
        Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                Calendar day = Calendar.getInstance();
                Scanner input = new Scanner (System.in);

                //Enter the Day
                System.out.println("Enter the day in number:");
                int day1= input.nextInt( );

                //Enter the Month
                System.out.println("Enter the Month in number");
                int month= input.nextInt( );

                //Enter the Year
                System.out.println("Enter the Year in number format");
                int year= input.nextInt( );

                //Display the day
                int dayOfWeek = day.get(Calendar.DAY_OF_WEEK);

                System.out.println(String.format("%d/%d/%d",day1,month,year));
                System.out.println(day.get(Calendar.DAY_OF_WEEK));


                if (dayOfWeek == Calendar.SUNDAY) {
                    System.out.println("Sunday");
                }
                else if (dayOfWeek == Calendar.MONDAY) {
                    System.out.println("Monday");
                }
                else if (dayOfWeek == Calendar.TUESDAY) {
                    System.out.println("Tuesday");
                }
                else if (dayOfWeek == Calendar.WEDNESDAY) {
                    System.out.println("Wednesday");
                }
                else if (dayOfWeek == Calendar.THURSDAY) {
                    System.out.println("Thursday");
                }
                else if (dayOfWeek == Calendar.FRIDAY) {
                    System.out.println("Friday");
                }
                else if (dayOfWeek == Calendar.SATURDAY) {
                    System.out.println("Saturday");

                }
            }
        }

