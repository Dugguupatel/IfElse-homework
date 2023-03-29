import java.util.Scanner;
//first create class
public class Sales_commision {
    String salesMen_Name;
    int sales_id;
    double amount;
    static double salary;
    double percentage;

    //main method
    public static void main(String[] args) {
        //call the scanner
        Scanner scanner = new Scanner(System.in);

        String salesMen_name;
        System.out.println("Enter employee's Name:");
       salesMen_name = scanner.next();

        Scanner sale = new Scanner(System.in);
       //annual sales as a double type
        double annualSales = 0;

        // commission rate as a double type
        double CommissionRate = 0;

        //Input for annual sales
        System.out.println("Enter employee's annual sales:");
        annualSales = scanner.nextDouble();

        if (annualSales >= 50000){
            System.out.println("Employee reached sales target: ");
            CommissionRate = .35;
            //Commission rate for sales target
                } else if (annualSales >= 30000){
                    System.out.println("Employee reached sales target: ");
                    CommissionRate = .20;
                    //Commission for reaching sales target
                        } else if(annualSales >= 20000){
                            System.out.println("Employee reached sales target: ");
                                CommissionRate = .10;
                                //Commission rate for reaching sales target
                                    } else if (annualSales >= 10000) {
                                        System.out.println("Employee reached sales target: ");
                                        CommissionRate = .05;
                                            } else if(annualSales < 10000) {
                                                System.out.println("Employee reached sales target");
                                                CommissionRate = .02;
                                                                        }
        //Calculation of commisssion
         double Percentage = (double) (annualSales * CommissionRate);
        //Displays amount of commission
        System.out.println("Commission is:" + Percentage + "%");

    }
}
