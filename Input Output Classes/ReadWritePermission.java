package IoClasses;

import java.io.File;

public class ReadWritePermission {
	public static void main(String[] args) {
		File file=new File("D:\\vivek.text");
		
		//check write permission
		if(file.canWrite()) {
			System.out.println(file.getAbsolutePath()+ " can write");
		}
		else {
			System.out.println(file.getAbsolutePath()+ " can not write");
		}
		
		//check read permission
		if(file.canRead()){
			System.out.println(file.getAbsolutePath()+ " can read");
		}
		else {
			System.out.println(file.getAbsolutePath()+ " can not read");
		}
	}
}
