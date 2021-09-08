package shapeHierarchy;

class Sphare extends ThreeDimensionalShape{
	Sphare(float radius){
		super(radius);
	}
	void getArea() {
		float areaofsphare=(4*((float)Math.PI)*getDimensionOne()*getDimensionOne());
		System.out.println("Area of sphare : "+areaofsphare);
	}
	void getVolume() {
		float sphareVolume=(((float)4.0/(float)3.0)*((float)Math.PI)*getDimensionOne()*getDimensionOne()*getDimensionOne());
		System.out.println("Volume of sphare : "+sphareVolume);
	}
}