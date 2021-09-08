package assignment;
/*Write a program to print the area and perimeter of a triangle 
 * having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
 */
public class TriangleWithoutParameter{
	float getAreaofTriangle() {
		float side1=3;
		float side2=4;
		float side3=5;
		float semiPerimeter,areaOfTriangle;
		semiPerimeter=(side1+side2+side3)/2;
		areaOfTriangle=(float) Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
		return areaOfTriangle ;
	}
	float getPerimeterofTriangle() {
		float side1=3;
		float side2=4;
		float side3=5;
		return (side1+side2+side3);
		}
	}

class getResult{
	public static void main(String arg[]) {
		TriangleWithoutParameter getAreaOfTriangle=new TriangleWithoutParameter();
		TriangleWithoutParameter getPerimeterofTriangle=new TriangleWithoutParameter();
		float areaOfTriangle=getAreaOfTriangle.getAreaofTriangle();
		float perimeterOfTriangle=getPerimeterofTriangle.getPerimeterofTriangle();
		System.out.println("The area of Triangle is "+areaOfTriangle);
		System.out.println("The perimeter Triangle is "+perimeterOfTriangle);
	}
}