package PriorityQueue;

import java.util.PriorityQueue;

public class AddPriorityQueueToAnotherPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> newPriorityQueue=new PriorityQueue<String>();
		
		// add element using add method
		
		newPriorityQueue.add("vivek");
		newPriorityQueue.add("satyam");
		newPriorityQueue.add("dheeru");
		newPriorityQueue.add("raman");
		
		//creating another priority queue
		
		PriorityQueue<String> newPriorityQueue1=new PriorityQueue<String>();
		
		newPriorityQueue1.add("ram");
		newPriorityQueue1.add("shayam");
		
		//add all element of newPriorityQueue to newPriorityQueue1
		
		newPriorityQueue1.addAll(newPriorityQueue);
		
		System.out.println("copy of priority queue are "+newPriorityQueue1);
		
}
}