package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {
	public static void main(String args[]) {
		ArrayList<String> arrlist1=new ArrayList<String>();
		
		// Elements are added using add() method
		
		arrlist1.add("apple");
		arrlist1.add("banana");
		arrlist1.add("mango");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		
		// Elements are added using add() method
		
		arrlist2.add("papaya");
		arrlist2.add("guava");
		
		
		
		arrlist2.addAll(arrlist1);
		Iterator itr= arrlist2.iterator();
		
		while(itr.hasNext()) {
			System.out.println("lis of fruit after adding "+itr.next());
		}
		
	}
}
