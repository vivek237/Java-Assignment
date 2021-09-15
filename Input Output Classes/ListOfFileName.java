package IoClasses;

import java.io.File;

public class ListOfFileName {
	public static void main(String[] args) {
		File file=new File("D:\\");
		String[] listOfFile=file.list();
		for(String listname:listOfFile) {
			System.out.println(listname);
		}
	}
}
