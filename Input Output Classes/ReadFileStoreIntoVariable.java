package IoClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
 
public class ReadFileStoreIntoVariable {
 
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:\\vivek.text"));
             while (strLine != null)
             {
                if (strLine == null)
                  break;
                str_data += strLine;
                
                //read line by line using readline
                strLine = br.readLine();
                
            }
              System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
     }
}
