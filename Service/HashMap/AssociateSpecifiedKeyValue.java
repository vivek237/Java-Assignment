package HashMap;

import java.util.*;  

public class AssociateSpecifiedKeyValue {  
  public static void main(String args[]) {  
	  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  
  //insert element using put method
  
  hash_map.put(1, "vivek");
  hash_map.put(2, "satyam");
  hash_map.put(3, "raman");
  hash_map.put(4, "dheeru");
  
  for(Map.Entry result:hash_map.entrySet()){  
   System.out.println(result.getKey()+" "+result.getValue());  
  }  
  
 }  
}
