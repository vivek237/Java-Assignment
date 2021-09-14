package TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetToAnotherTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet1=new TreeSet<String>();
		
		treeSet1.add("red");
		treeSet1.add("green");
		treeSet1.add("blue");
		
		//Creating Another TreeSet
		TreeSet<String> treeSet2=new TreeSet<String>();
		
		treeSet2.add("yellow");
		treeSet2.add("pink");
		
		treeSet2.addAll(treeSet1);
		System.out.println("TreeSet "+treeSet1);
		System.out.println("TreeSet To Another TreeSet "+treeSet2);
	}
}
