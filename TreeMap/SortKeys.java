package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeys {
	public static void main(String args[]) {  
		  
		  TreeMap<Integer,String> treemap= new TreeMap<Integer,String>(new sortingKey());  
		  
		//insert element using put method
		  
		  treemap.put(1, "vivek");
		  treemap.put(2, "satyam");
		  treemap.put(3, "raman");
		  treemap.put(4, "dheeru");		  
		  System.out.println(treemap);
}
}

//comparison using Comparator
class sortingKey implements Comparator<Integer>{

	@Override
	public int compare(Integer key, Integer value) {
		// TODO Auto-generated method stub
		return key.compareTo(value);
	}
	
}