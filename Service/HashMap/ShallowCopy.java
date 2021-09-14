package HashMap;

import java.util.HashMap;

public class ShallowCopy {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		//insert element using put method
		hashmap.put(1, "apple");
		hashmap.put(2, "mango");
		
		//creating another hashmap
		HashMap<Integer,String> newhashmap=new HashMap<Integer,String>();
		
		//cloning hashmap
		newhashmap=(HashMap)hashmap.clone();
		
		
		System.out.println("ShallowCopy "+newhashmap);
		
}
}
