package shapeHierarchy;


public class circle1 extends TwoDimensionalShape {
	    float areaofcircle;
		circle1(float radius){
			super(radius);
		}
		
		//circle
		
		void getArea()	{
			areaofcircle=getDimensionOne()*getDimensionOne()*(float)Math.PI;
			System.out.println("area of circle : "+areaofcircle);
		}
	}

