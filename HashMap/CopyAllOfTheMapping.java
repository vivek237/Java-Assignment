package HashMap;

import java.util.HashMap;

public class CopyAllOfTheMapping {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		//insert element using put method
		hashmap1.put(1,"Vivek");
		hashmap1.put(2,"satyam");
		hashmap1.put(3,"dheeru");
		
		//create another HashMap
		HashMap<Integer,String> hashmap2=new HashMap<Integer,String>();
		
		hashmap2.put(4, "raman");
		
		//copy all the element into hashmap2
		hashmap2.putAll(hashmap1);
		
		System.out.println("the copy elements are :"+hashmap2);
	}
}
