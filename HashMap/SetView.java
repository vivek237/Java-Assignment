package HashMap;

import java.util.HashMap;
import java.util.Set;

public class SetView {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		//insert element using put method
		hashmap.put(1, "apple");
		hashmap.put(2, "mango");
		
		//creating set view
        Set set=hashmap.entrySet();
        
        System.out.println("Set view "+set);
}
}