import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
	int i = 0;
	Scanner userInput=new Scanner(System.in);
	System.out.println("enter number of element");
	int n=userInput.nextInt();
	
	//creating array list
	ArrayList<Integer> marks=new ArrayList<Integer>(n);
	
	System.out.println("Enter Marks");
	for(i=0;i<=n;i++) {
		//taking input form user
		Scanner userInput1=new Scanner(System.in);
		int studentMarks=userInput1.nextInt();
		marks.add(studentMarks);
	}
	
	//finding highest mark of students
		int res=Collections.max(marks);
		System.out.println("Highest Marks : "+res);
		
	//finding average of student marks
	int total=0;
	for(i=0;i<marks.size();i++) {
		 total= total+marks.get(i);
	}
	System.out.println("Average Marks : "+total/marks.size());
	
	//finding 3rd student mark
	int thirdMarks=marks.get(2);
	System.out.println("3d student Mark : "+thirdMarks);
	

	//sorting
	Collections.sort(marks);
	System.out.println("sorted : "+marks);
	
	Iterator itr=marks.iterator();
	while(itr.hasNext()) {
		System.out.println("Marks : "+itr.next());
	}
	
	
}
}
