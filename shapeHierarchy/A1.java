package Interface;

/*Write a java program in which you will declare two interface sum and 
 * Add inherits these interface through class A1 and display their content.
 */

interface sum{
	int sum=1;
	void sum();
}
interface add{
	int add=2;
	void add();
}
public class A1 implements sum,add {

	@Override
	public void add() {
		System.out.println("add "+add);
		
	}

	@Override
	public void sum() {
		System.out.println("sum "+sum);
		
	}
	public static void main(String args[]) {
		A1 a=new A1();
		a.sum();
		a.add();
	}

}
