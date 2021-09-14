package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKey {
	public static void main(String args[]) {  
		  
		  TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();  
		  
		//insert element using put method
		  
		  treemap.put(1, "vivek");
		  treemap.put(2, "satyam");
		  treemap.put(3, "raman");
		  treemap.put(4, "dheeru");
		  
		  //getting all the key
		  
		  Set<Integer> result=treemap.keySet();
		  for(int key:result) {
			  System.out.println("keys are "+key);
		  }
	}
}
