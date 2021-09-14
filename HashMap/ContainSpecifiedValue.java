package HashMap;

import java.util.HashMap;

public class ContainSpecifiedValue {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		//insert element using put method
		hashmap.put(1, "apple");
		hashmap.put(2, "mango");
		
        //Check key whether value is present or not
		if(hashmap.containsValue("mango")) {
			System.out.println("yes!"+hashmap.get(2));
		}
		else {
			System.out.println("No!");
		}
	}
}
