package PriorityQueue;

import java.util.PriorityQueue;

public class CountNoOfElement {
	public static void main(String[] args) {
		PriorityQueue<String> newPriorityQueue=new PriorityQueue<String>();
		
	    // add element using add method
		
		newPriorityQueue.add("vivek");
		newPriorityQueue.add("satyam");
		newPriorityQueue.add("dheeru");
		newPriorityQueue.add("raman");
		
		//find number of element in priority queue
		int result=newPriorityQueue.size();
		
		System.out.println("the number of element in priority queue are "+result);
		
}
}