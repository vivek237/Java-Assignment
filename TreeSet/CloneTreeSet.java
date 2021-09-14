package TreeSet;

import java.util.TreeSet;

public class CloneTreeSet {
	public static void main(String[] args) {
		TreeSet<String> addColor= new TreeSet<String>();
		
		//adding element using add method
		
		addColor.add("Red");
		addColor.add("green");
		addColor.add("blue");
		addColor.add("yellow");
		
		System.out.println("TreeSet are "+addColor);
		
		// clone treeSet list to Another treeSet
		
		TreeSet<String> NewTreeSet=(TreeSet<String>)addColor.clone();
		System.out.println("Cloning TreeSet are "+NewTreeSet);
		
}
}