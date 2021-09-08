package MethodOverloading;

/*Write a Java Program to demonstrate the Method Overloading with difference in data types of parameters.*/

public class WithDifferenceInDatatype {
	public void show(int num1) {
		System.out.println("one dataType parameter "+num1);
	}
	public void show(double num1,double num2) {
		System.out.println("Two dataType parameter "+num1+" and "+num2);
	}
	public static void main(String args[]) {
		WithDifferenceInDatatype differentTypeOfParameter=new WithDifferenceInDatatype();
		differentTypeOfParameter.show(2);
		differentTypeOfParameter.show(4.0,5.0);
	}

}
