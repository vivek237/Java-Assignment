package ConstructorOverloading;

public class WithDifferentNoParameter { 
		 
		int Roll;  
		String Name;  
		//default constructor
		WithDifferentNoParameter(){  
		System.out.println("default constructor");  
		}  
		  
		WithDifferentNoParameter(int roll, String name){  
	    Roll = roll;  
		Name = name;  
		}  
		
		WithDifferentNoParameter( String name,int roll){  
		    Roll = roll;  
			Name = name;  
		}   
		
		public static void main(String[] args) {  
		
			WithDifferentNoParameter defaultconstructor = new WithDifferentNoParameter();  
			
			System.out.println("\nDefault Constructor values: \n");  
			System.out.println("Roll : "+defaultconstructor .Roll+ "\nName : "+defaultconstructor .Name);  
		 
			System.out.println("\nDifferent DataType parameter Constructor\n");  
			
			//different data types parameters
			WithDifferentNoParameter differentDataType  = new WithDifferentNoParameter(101, "vivek");  
			System.out.println("Roll : "+differentDataType .Roll + "\nName : "+differentDataType .Name); 
			
			// different sequence parameter
			System.out.println("\nDifferent Sequence Parameter Constructor\n");  
			
			WithDifferentNoParameter differentsequence = new WithDifferentNoParameter("vivek",101);  
			System.out.println("Name : "+differentsequence.Name + "\nRoll : "+differentsequence .Roll); 
		}  
		

}