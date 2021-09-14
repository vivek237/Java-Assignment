package PriorityQueue;

import java.util.PriorityQueue;

public class IteratePriorityKey {
	public static void main(String[] args) {
		PriorityQueue<String> newPriorityQueue=new PriorityQueue<String>();
		
		// add element using add method
		
		newPriorityQueue.add("vivek");
		newPriorityQueue.add("satyam");
		newPriorityQueue.add("dheeru");
		newPriorityQueue.add("raman");
		
		for(String queue:newPriorityQueue) {
			System.out.println(queue);
		}
		
	}
}
