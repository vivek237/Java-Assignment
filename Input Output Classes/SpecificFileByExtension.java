package IoClasses;
import java.io.File;
import java.io.FilenameFilter;

public class SpecificFileByExtension {
	       public static void main(String a[]){
	        File file = new File("D:\\");
	        
	           String[] list = file.list(new FilenameFilter() {
	        	   
	           @Override
	            public boolean accept(File dir, String name) {
	        	   
	        	 // finding file name with extension ends with .txt
	             if(name.endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String filename:list){
	            System.out.println(filename);
	        }
	    }
	}


