package MainClass;

import Addition.Addition;
import Division.Division;
import EvenOdd.EvenOdd;
import Multiplication.Multiplication;
import Subtraction.Subtraction;

public class MainClass {
	public static void main(String args[]) {
		
		//creating object for addition
		Addition add=new Addition();
        int resultadd=add.showAdd(2,3);
        System.out.println("Addition: "+resultadd);
        
        //creating object for subtraction
        Subtraction sub=new Subtraction();
        int resultsub=sub.showSub(2,3);
        System.out.println("Subtraction: "+resultsub);
        
        //creating object for Division
        Division div=new Division();
        int resultdiv=div.showDiv(4,2);
        System.out.println("Division: "+resultdiv);
        
        //creating object for Multiplication
        Multiplication mul=new Multiplication();
        int resultmul=mul.showMul(2,3);
        System.out.println("Multiplication: "+resultmul);
        
      //creating object for EvenOdd
        EvenOdd evenOdd=new EvenOdd();
        String resultevenOdd=evenOdd.showEvenOdd(2);
        System.out.println("Check Even Or Odd: "+resultevenOdd);
				
}
}
