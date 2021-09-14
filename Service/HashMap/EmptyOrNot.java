package HashMap;

import java.util.HashMap;

public class EmptyOrNot {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		//insert element using put method
		hashmap.put(1, "apple");
		hashmap.put(2, "mango");
		
		//check whether hasmap is empty or not
		boolean result=hashmap.isEmpty();
		if(result) {
			System.out.println("HashMap is empty");
		}
		else {
			System.out.println("HashMap is not empty");
		}
	}
}
