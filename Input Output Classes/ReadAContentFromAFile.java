package IoClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

 

public class ReadAContentFromAFile {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Byte[] array = new Byte[100];
        
        FileInputStream in = new FileInputStream("D:\\vivek.text");
        
        try
        {
            in.read();
            System.out.println(array);
            
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
            
        }
    }

 

}