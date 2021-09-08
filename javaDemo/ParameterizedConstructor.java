package assignment;
 
public class ParameterizedConstructor
{
    String name;
    int id;
 
    ParameterizedConstructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
 
class constructor1
{
    public static void main (String[] args)
    {
        // this would invoke the parameterized constructor.
    	ParameterizedConstructor constructor = new ParameterizedConstructor("vivek", 1);
        System.out.println("Name :" + constructor.name +
                           " and Id :" + constructor.id);
    }
}