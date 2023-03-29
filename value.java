import java.util.Scanner;
//first crate class
public class value {
    //call the scanner
    Scanner scanner = new Scanner(System.in);

    static String name = "We are 10 people in our team since @2018";

    //main method
    public static void main(String args[]) {
        System.out.println(name.replaceAll("[^0-9]", ""));
        System.out.println(name.replaceAll("[^a-zA-Z]",""));
        System.out.println(name.replaceAll("[a-zA-Z\\d, ]",""));
    }}
