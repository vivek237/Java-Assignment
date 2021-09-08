package assignment;

/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
 * respectively by creating a class named 'Rectangle' with a method named 'Area'
 *  which returns the area and length and breadth passed as parameters to its constructor
 */

class Rectangle {
	int Area(int length,int breadth) {
		return (length*breadth);
		
	}	
}

public class AreaOfTwoRectangle{
	public static void main(String args[]) {
		Rectangle rectangle1=new Rectangle();
		Rectangle rectangle2=new Rectangle();
		System.out.println("area of first rectangle is: "+rectangle1.Area(4, 5));
		System.out.println("area of second rectangle is: "+rectangle2.Area(5, 8));
		
	}
}
