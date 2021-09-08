package assignment;
 
public class ZeroArgumentConstructor
{
    int num;
    String name;
 
    // this would be invoked while an object
    // of that class is created.
    ZeroArgumentConstructor()
    {
        System.out.println("Constructor called");
    }
}
 
class constructor
{
    public static void main (String[] args)
    {
        // this would invoke default constructor.
    	ZeroArgumentConstructor constructor = new ZeroArgumentConstructor();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(constructor.name);
        System.out.println(constructor.num);
    }
}