package assignment;

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and the 
 * second method named as 'getArea' 
 * returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

import java.util.Scanner;


public class Area{

float length, breadth, area;

  void setDim(float length, float breadth)

  {  

     this.length = length;

     this.breadth = breadth;

     area = this.length * this.breadth;

  }

 

 float getArea()

 {
     return area; 
 }

public static void main(String[] args)
    {
	    Scanner sc=new Scanner (System.in);
	    
        Area areaofrectangle=new Area();
        float length,breadth;
        System.out.println("Enter the length of rectangle : ");
        length=sc.nextFloat();
        System.out.println("Enter breadth of rectangle : ");
        breadth=sc.nextFloat();
        areaofrectangle.setDim(length, breadth);

        System.out.println("Area of rectangle is = " + areaofrectangle.getArea());

}

}

