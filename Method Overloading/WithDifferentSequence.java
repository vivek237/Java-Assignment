package MethodOverloading;

/* Write a Java Program to demonstrate the Method Overloading by changing the sequence of data types of arguments */

public class WithDifferentSequence {
	public void show(int num1,double num2) {
		System.out.println(+num1 +" and "+num2);
	}
	public void show(double num1,int num2) {
		System.out.println(+num1+" and "+num2);
	}
	public static void main(String args[]) {
		WithDifferentSequence differentSeqOfParameter=new WithDifferentSequence();
		differentSeqOfParameter.show(4,5.0);
		differentSeqOfParameter.show(5.0,4);
	}

}
