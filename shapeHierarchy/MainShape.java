package shapeHierarchy;

public class MainShape {

	public static void main(String args[]) {
		//Creating object for circle
		TwoDimensionalShape twoDimensionalcircle=new circle1((float)8);
		twoDimensionalcircle.getArea();
		
		//Creating object for Square
		TwoDimensionalShape twoDimensionalShapesquare=new Square((float)8);
		twoDimensionalShapesquare.getArea();
		
		//Creating object for Square
		TwoDimensionalShape twoDimensionalShapetriangle=new Triangle((float)9,(float)7);
		twoDimensionalShapetriangle.getArea();
		
		//Creating object for SphareArea
		ThreeDimensionalShape threeDimensionalShapesphare=new Sphare((float)8);
		threeDimensionalShapesphare.getArea();
		
		//Creating object for Sphare volume
		
		ThreeDimensionalShape threeDimensionalShapesphare1=new Sphare((float)8);
		threeDimensionalShapesphare1.getVolume();
		
		//Creating object for Cube Area
		ThreeDimensionalShape threeDimensionalShapecube=new Cube((float)3);
		threeDimensionalShapecube.getArea();
		
		//Creating object for  Cube volume
		ThreeDimensionalShape threeDimensionalShapecube1=new Cube((float)3);
		threeDimensionalShapecube1.getVolume();
		
		//Creating object for Cube Area
		ThreeDimensionalShape Cuboid1=new Cuboid((float)3,(float)5,(float)2);
		Cuboid1.getArea();
		
		//Creating object for  Cube volume
		ThreeDimensionalShape Cuboid2=new Cuboid((float)3,(float)5,(float)2);
		Cuboid2.getVolume();
   }
	
}