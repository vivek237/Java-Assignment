package AbstractClass;

/*Write a program in java to generate an abstract class 
 * A also class B inherits the class A. generate the object for
 * class B and display the text “call me from B
 */

abstract class A {
	abstract void show(); 
}
class B extends A{
	void show() {
		System.out.println("call me from B");	
	}
public static void main(String args[]) {
	B b=new B();
	b.show();
}
}

