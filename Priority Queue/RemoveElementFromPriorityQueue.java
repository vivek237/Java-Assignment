package PriorityQueue;

import java.util.PriorityQueue;

public class RemoveElementFromPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> newPriorityQueue=new PriorityQueue<String>();
		
		// add element using add method
		
		newPriorityQueue.add("vivek");
		newPriorityQueue.add("satyam");
		newPriorityQueue.add("dheeru");
		newPriorityQueue.add("raman");
		
		//Remove all element from priority queue
		newPriorityQueue.clear();
		
		System.out.println("Removed Priority Queue are "+newPriorityQueue);
}
}