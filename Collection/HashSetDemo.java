package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo{
	 public static void main(String args[]){

	  HashSet<String> namelist=new HashSet<String>();

	// Elements are added using add() method
	  
	  namelist.add("vivek");
	  namelist.add("raman");
	  namelist.add("satyam");
	  namelist.add("dheeru");
	  namelist.add(null);
	  namelist.add(null);
	 
	  Iterator itr=namelist.iterator();
	  while(itr.hasNext()){
	   System.out.println(itr.next());
	  }
	 }
	}