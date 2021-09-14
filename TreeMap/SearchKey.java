package TreeMap;

import java.util.TreeMap;

public class SearchKey {
	 public static void main(String args[]) {  
		  
		  TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();  
		  
		//insert element using put method
		  
		  treemap.put(1, "vivek");
		  treemap.put(2, "satyam");
		  treemap.put(3, "raman");
		  treemap.put(4, "dheeru");
		  
		  //searching key
		  if(treemap.containsKey(3)) {
			  System.out.println("key is present");
		  }
		  else {
			  System.out.println("key is not present");
		  }
}
}