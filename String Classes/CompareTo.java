package StringClass;

public class CompareTo {
	public static void main(String args[]) {
		String name1 = "vivek";
		String name2 = "vivek";
		String name3 = "kumar";

		System.out.println(name1.compareTo(name2));// 0 because both are equal
		System.out.println(name1.compareTo(name3));// 11 because "c" is 11 times greater than "k"
	}
}
