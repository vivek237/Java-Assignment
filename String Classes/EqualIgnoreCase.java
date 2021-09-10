package StringClass;

public class EqualIgnoreCase { 
		public static void main(String args[]){  
		String string1="Training";  
		String string2="Training";  
		String string3="TRAINING";  
		String string4="java"; 
		System.out.println(string1.equalsIgnoreCase(string2));//true because content and case both are same  
		System.out.println(string1.equalsIgnoreCase(string3));//true because case is ignored  
		System.out.println(string1.equalsIgnoreCase(string4));//false because content is not same  
		}
} 
