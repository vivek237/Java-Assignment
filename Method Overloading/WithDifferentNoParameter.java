package MethodOverloading;

public class WithDifferentNoParameter {
	public void show(int num1) {
		System.out.println("one parameter "+num1);
	}
	public void show(int num1,int num2) {
		System.out.println("Two parameter "+num1+" and "+num2);
	}
	public static void main(String args[]) {
		WithDifferentNoParameter differentNoOfParameter=new WithDifferentNoParameter();
		differentNoOfParameter.show(2);
		differentNoOfParameter.show(4,5);
	}
}
