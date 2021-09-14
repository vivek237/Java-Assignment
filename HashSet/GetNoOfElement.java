package HashSet;

import java.util.HashSet;

public class GetNoOfElement {
		public static void main(String[] args) {
			HashSet<Integer> getNoOfElement= new HashSet<Integer>();
			
			//Adding element using add method
			getNoOfElement.add(11);
			getNoOfElement.add(12);
			getNoOfElement.add(13);
			getNoOfElement.add(14);

			System.out.println("HashSet are : "+getNoOfElement);
			
			//find number of element
			int numberOfElement=getNoOfElement.size();
			
			System.out.println("Number of element in Hashset are : "+numberOfElement);
}
}