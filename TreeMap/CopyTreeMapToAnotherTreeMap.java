package TreeMap;

import java.util.TreeMap;

public class CopyTreeMapToAnotherTreeMap {
	public static void main(String args[]) {

		TreeMap<Integer, String> treemap1 = new TreeMap<Integer, String>();

		//insert element using put method
		
		treemap1.put(1, "vivek");
		treemap1.put(2, "satyam");
		treemap1.put(3, "raman");
		treemap1.put(4, "dheeru");

		System.out.println("Original TreeMap " + treemap1);

		// creating another TreeMap
		TreeMap<Integer, String> treemap2 = new TreeMap<Integer, String>();

		treemap2.put(5, "ram");
		treemap2.put(6, "shayam");
		// copying treemap1 to treemap2
		treemap2.putAll(treemap1);

		System.out.println("After copy TreeMap to Another TreeMap " + treemap2);

	}
}