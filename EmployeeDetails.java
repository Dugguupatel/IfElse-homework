import java.util.Scanner;
//Creating employee details class
public class EmployeeDetails
   {
       //Main method
    public static void main(String[] args)
    {
        //Creating object of EmployeeDetails
        Scanner scanner = new Scanner(System.in);

        double basic,HRA,DA,TA,PF,GROSS_salary;

        System.out.println("Enter Basic salary of the employee\n");

        //Incrementing salary based on condition
        basic = scanner.nextDouble();
        DA = (8 * basic) / 100;
        HRA = (10*basic) /100;
        TA = (9*basic) / 100;
        PF = (20*basic) / 100;
        GROSS_salary = basic+DA+HRA+TA-PF;

        // find HRA,DA,TA,PF and GROSS salary
        System.out.println("The HRA of the basic salary of the employee is :" +DA);
        System.out.println("The DA of the basic salary of the employee is :" +HRA);
        System.out.println("The TA of the basic salary of the employee is :" +TA);
        System.out.println("The PF of the basic salary of the employee is :" +PF);
        System.out.println("The GROSSSsalary of the employee is :" +GROSS_salary);



    }

}
