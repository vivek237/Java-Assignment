package assignment;

import java.util.Scanner;
public class Average {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();
        scan.close();
        System.out.print("The average of entered numbers is:" + averageResult(num1, num2, num3) );
    }

  public static double averageResult(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}