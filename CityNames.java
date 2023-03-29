import java.util.Scanner;
//first create class
public class CityNames {

    //main method
    public static void main(String[] args) {
        //call the scanner
        Scanner scanner = new Scanner(System.in);

        //Acknowledge the user what to enter
        System.out.println("Enter alphabet from a to f");
        String city = scanner.next();

        if (city.startsWith("a")) {
            System.out.println("Ahmedabad");
        } else if (city.startsWith("b")) {
            System.out.println("Bombay");
             } else if (city.startsWith("c")) {
                 System.out.println("Chennai");
                    } else if (city.startsWith("d")) {
                        System.out.println("Delhi");
                            } else if (city.startsWith("e")) {
                                System.out.println("Essex");
                                    } else if (city.startsWith("f")) {
                                         System.out.println("Florida");
                                             } else {
                                                 System.out.println("Invalid Entry");
                                                                                        }
                                                                                            }
                                                                                                }



