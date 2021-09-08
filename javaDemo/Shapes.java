package assignment;

public class Shapes {
  public void draw() {
    System.out.println("draw triangle");
  }
  public void erase() {
	    System.out.println("erase triangle");
	  }
}
class Triangle extends Shapes {
  public void draw() {
    System.out.println("draw triangle");
  }
  public void erase() {
	    System.out.println("erase triangle");
	  }
}
class Circle extends Shapes {
  public void draw() {
    System.out.println("draw circle");
  }
  public void erase() {
	    System.out.println("erase circle");
	  }
}
  class Square extends Shapes {
	  public void draw() {
	    System.out.println("draw square");
	  }
	  public void erase() {
		    System.out.println("erase Square ");
		  }
}
class Main1 {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  // Create a Shapes object
    Shapes myTriangle = new Triangle();  // Create a Triangle object
    Shapes myCircle = new Circle();  // Create a Circle object
    Shapes mySquare=new Square(); // create a Square object
    myShape.draw();
    myShape.erase();
    myTriangle.draw();
    myTriangle.erase();
    myCircle.draw();
    myCircle.erase();
    mySquare.draw();
    mySquare.erase();
  }
}