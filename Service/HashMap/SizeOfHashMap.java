package HashMap;

import java.util.*;

public class SizeOfHashMap {
	public static void main(String[] args) {
		
	HashMap<Integer,String> sizeOfHashMap=new HashMap<Integer,String>();
	//insert element using put method
	sizeOfHashMap.put(1,"vivek");
	sizeOfHashMap.put(2,"kumar");
	sizeOfHashMap.put(3,"satyam");
	sizeOfHashMap.put(4,"raman");
	
	System.out.println("size of Hash map is "+sizeOfHashMap.size());
	}
}
