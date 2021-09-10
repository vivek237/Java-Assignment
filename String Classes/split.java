package StringClass;

public class split {
	public static void main(String args[])
    {
        String string = "vivek,kumar";
        String[] arrayOfString= string.split("," );
  
        for (String array :arrayOfString )
            System.out.println(array);
    }
}
