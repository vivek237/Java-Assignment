package assignment;
 
public class ConstructorOverloading
{
    // constructor with one argument
	ConstructorOverloading(String name)
    {
        System.out.println("Constructor with one " +
                      "argument : " + name);
    }
 
    // constructor with two arguments
	ConstructorOverloading(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
 
}
 
class constructor2
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'constructor'
        // by passing different arguments
 
        // Invoke the constructor with one argument of
        // type 'String'.
    	ConstructorOverloading constructor = new ConstructorOverloading("vivek");
 
        // Invoke the constructor with two arguments
    	ConstructorOverloading constructor1 = new ConstructorOverloading("satyam", 2);
 
    }
}