package StringClass;

public class IndexOf {  
		public static void main(String args[]){  
		String string1="this is vivek";  
		 
		int index1=string1.indexOf("is");//returns the index of is substring  
		int index2=string1.indexOf("vivek");//returns the index of index substring  
		System.out.println(index1+"  "+index2);
}
}