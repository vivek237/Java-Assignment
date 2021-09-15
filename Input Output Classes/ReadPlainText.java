package IoClasses;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	 
	public class ReadPlainText {
	 
	    public static void main(String args[]){
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("D:\\vivek.text"));
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                
	                strLine = br.readLine();
	                System.out.println(strLine);
	            }
	             br.close();
	        } 
	        catch (FileNotFoundException e) {
	            System.out.println("File not found");
	        } 
	        catch (IOException e) {
	            System.out.println("Unable to read the file.");
	        }
	     }
	}

