package StringClass;

public class Equals {  
		public static void main(String args[]){  
		String name1="vivek";  
		String name2="vivek";  
		String name3="Vivek";  
		System.out.println(name1.equals(name2));//true because content and case is same  
		System.out.println(name1.equals(name3));//false because case is not same  
		
		}
}
