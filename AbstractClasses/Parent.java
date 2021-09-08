package AbstractClass;

public abstract class Parent{
	abstract void fun();
}
class Child extends Parent {
	void fun()
	{
		System.out.println("child class function will be call");
	}
}
class abstractClass {
	public static void main(String args[])
	{
		Parent parent = new Child();
		parent.fun();
	}
}
