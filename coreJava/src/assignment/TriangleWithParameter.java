package assignment;

public class TriangleWithParameter{
	float getAreaofTriangle(float side1,float side2,float side3) {
		float semiPerimeter,areaOfTriangle;
		semiPerimeter=(side1+side2+side3)/2;
		areaOfTriangle=(float) Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
		return areaOfTriangle ;
	}
	float getPerimeterofTriangle(float side1,float side2,float side3) {
		return (side1+side2+side3);
		}
	}

class Result{
	public static void main(String arg[]) {
		TriangleWithParameter getAreaOfTriangle=new TriangleWithParameter();
		TriangleWithParameter getPerimeterofTriangle=new TriangleWithParameter();
		float areaOfTriangle=getAreaOfTriangle.getAreaofTriangle(3, 4, 5);
		float perimeterOfTriangle=getPerimeterofTriangle.getPerimeterofTriangle(3, 4, 5);
		System.out.println("The area of Triangle is "+areaOfTriangle);
		System.out.println("The perimeter Triangle is "+perimeterOfTriangle);
	}
}