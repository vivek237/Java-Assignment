package IoClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) {
		File file=new File("D:\\vivek.text");
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("D:\\vivek.text"));
			//readline is used to read line by line
			String content=br.readLine();
			while(content!=null) {
				System.out.println(content);
				content=br.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
