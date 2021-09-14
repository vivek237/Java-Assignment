package HashMap;

import java.util.HashMap;

public class ContainSpecifiedKey {
		public static void main(String[] args) {
			HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
			//insert element using put method
			hashmap.put(1, "apple");
			hashmap.put(2, "mango");
			
	        //Check key whether key is present or not
			if(hashmap.containsKey(1)) {
				System.out.println("yes!"+hashmap.get(1));
			}
			else {
				System.out.println("No!");
			}
		}
}
