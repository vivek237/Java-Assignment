package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class RetrieveNoLessThan7 {

	public static void main(String[] args) {
		// creating TreeSet
		TreeSet<Integer> addnumber = new TreeSet<Integer>();
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();

		// Add numbers in the tree
		addnumber.add(1);
		addnumber.add(2);
		addnumber.add(3);
		addnumber.add(5);
		addnumber.add(6);
		addnumber.add(7);
		addnumber.add(8);
		addnumber.add(9);
		addnumber.add(10);

		// Find numbers less than 7
		treeheadset = (TreeSet) addnumber.headSet(7);

		// create an iterator
		Iterator iterator;
		iterator = treeheadset.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}
}
