package IoClasses;

import java.io.File;

public class IsDirectoryOrFile {
	public static void main(String[] args) {
		File file=new File("D:\\");
		if(file.isDirectory()) {
			System.out.println(file.getAbsolutePath()+" is a directory");
		}
		else
		{
			System.out.println(file.getAbsolutePath()+" is not a directory");
		}
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath()+" is a file");
		}
		else
		{
			System.out.println(file.getAbsolutePath()+" is not a file");
		}
	}
}
