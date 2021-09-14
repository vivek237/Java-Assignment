package PriorityQueue;

import java.util.PriorityQueue;

public class CompareTwoPriorityQueue {
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
		
		//comparison 
		
		Boolean result=newPriorityQueue1.equals(newPriorityQueue);
		
		if(result) {
			System.out.println("both priority queues are equal");
		}
		else {
			System.out.println("both priority queues are not equal");
		}
		
}
}