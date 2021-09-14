package TreeMap;

import java.util.TreeMap;

public class AssociatedGretestLetestKeyValue {
	public static void main(String args[]) {  
		  
		  TreeMap<Integer,String> treemap= new TreeMap<Integer,String>(new sortingKey());  
		  //insert element using put method
		  treemap.put(1, "vivek");
		  treemap.put(2, "satyam");
		  treemap.put(3, "raman");
		  treemap.put(4, "dheeru");	
		  
		  //finding greatest key
		  System.out.println("Greatest key :"+treemap.firstEntry());
		  
		  //finding Least Key
		  System.out.println("Least key :"+treemap.lastEntry());
}
}
