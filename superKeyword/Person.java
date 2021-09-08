package SuperKeywordExample;

public class Person
{
	void message()
	{
		System.out.println("hello");
	}
}

class Employee extends Person
{
	void message()
	{
		System.out.println("this is vivek");
	}

	void display()
	{
		
		message();
		super.message();
	}
}

class Test
{
	public static void main(String args[])
	{
		Employee employee = new Employee();
		employee.display();
	}
}
