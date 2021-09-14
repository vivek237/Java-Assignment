package TreeMap;

import java.util.TreeMap;

public class SearchValue {
	public static void main(String args[]) {  
		  
		  TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();  
		  
		//insert element using put method
		  
		  treemap.put(1, "vivek");
		  treemap.put(2, "satyam");
		  treemap.put(3, "raman");
		  treemap.put(4, "dheeru");
		  
		  //searching value
		  if(treemap.containsValue("raman")) {
			  System.out.println("value is present");
		  }
		  else {
			  System.out.println("value is not present");
		  }
}
}