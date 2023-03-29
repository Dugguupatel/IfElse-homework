import java.util.Scanner;

public class InterchangedValue {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of X and Y");

        x = scanner.nextInt();
        y = scanner.nextInt();


        System.out.println("Before Interchange nubmer : "+x +" "+y);
        //Interchange value

        z = x;
        x = y;
        y = z;
        System.out.println("After Interchange number : "+x +" "+y);
        System.out.println();

    }




}
