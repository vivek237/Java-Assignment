package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> arrlist= new ArrayList<String>();
		
		// Elements are added using add() method
		
		arrlist.add("apple");
		arrlist.add("banana");
		arrlist.add("mango");
		
		Iterator itr= arrlist.iterator();
		
		while(itr.hasNext()) {
			System.out.println("list of fruit "+itr.next());
		}
	}
}
