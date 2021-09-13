package Collection;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String>list=new LinkedList<String>();
		
		// Elements are added using add() method
		
		list.add("apple");
		list.add("banana");
		list.add("mango");
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println("List of fruit "+itr.next());
		}
	}
}
