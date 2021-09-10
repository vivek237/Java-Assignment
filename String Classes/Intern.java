package StringClass;

public class Intern {
	public static void main(String[] args) {
		String laptop1 = "dell";
		String laptop2 = laptop1.intern();
		String laptop3 = new String("dell");
		String laptop4 = laptop3.intern();
		System.out.println(laptop1 == laptop2); 
		System.out.println(laptop1 == laptop3); 
		System.out.println(laptop1 == laptop4); 

	}
}
