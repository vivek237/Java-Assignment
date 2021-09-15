package IoClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileIntoByte {
	public static byte[] convert(File file)throws IOException {
		FileInputStream f1=new FileInputStream(file);
		byte[] arr=new byte[(int)file.length()];
		f1.read(arr);
		//close the file
		f1.close();
		return arr;
	}
	public static void main(String args[]) throws IOException {
		File file=new File("D:\\vivek.text");
		byte[] arr= convert(file);
		System.out.println(Arrays.toString(arr));
	}
}

