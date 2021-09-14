package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AssociateSpecifiedKeyValue {

	public static void main(String args[]) {

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		//insert element using put method
		treemap.put(1, "vivek");
		treemap.put(2, "satyam");
		treemap.put(3, "raman");
		treemap.put(4, "dheeru");

		for (Map.Entry result : treemap.entrySet()) {
			System.out.println(result.getKey() + " " + result.getValue());
		}

	}

}
