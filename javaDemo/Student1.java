package assignment;

/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" 
respectively by creating two objects of class 'Student'.
*/

class Student1{
	    int  sam_roll=11;
	    int john_roll=12;
	    long sam_phone=1234567890L;
	    long john_phone=1234567895L;
	    String sam_address="delhi";
	    String john_address="gurugram";
public static void main(String[] args)
    {
       Student1  sam=new Student1();
       Student1  john=new Student1();
       System.out.println("sam roll no -"+sam.sam_roll);
       System.out.println("sam phone no. -"+sam.sam_phone);
       System.out.println("sam address - "+sam.sam_address);
       System.out.println("john roll no -"+john.john_roll);
       System.out.println("john phone no. -"+john.john_phone);
       System.out.println("john address -"+john.john_address);
    }
}


