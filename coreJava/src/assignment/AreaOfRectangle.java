package assignment;

import java.util.Scanner;

class Area1{
    int length;
    int breadth;
    Area1(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int returnArea()
    {
        return length * breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        Area1 ob1 = new Area1(a,b);
        System.out.println("Area of rectangle = "+ ob1.returnArea());
    }
}