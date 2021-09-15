package IoClasses;

import java.io.File;

public class FileExistance {
	public static void main(String[] args) {
		File file=new File("D:\\vivek.text");
		
		//check file is exists or not
		if(file.exists()) {
			System.out.println("file exists");
		}
		else {
			System.out.println("file not exists");
		}
	}

}
