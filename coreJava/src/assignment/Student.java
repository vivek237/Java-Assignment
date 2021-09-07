package assignment;

public class Student {

		int showData() {
			int roll_no=101;
			return roll_no;
			
		}
		String showData1() {
			String name="vivek";
			return name;
		}
	}
class ReturnDetail{
		public static void main(String args[]) {
			Student showDetail1=new Student();
			Student showDetail2=new Student();
			int roll_no=showDetail1.showData();
			String name=showDetail2.showData1();
			System.out.println("name - "+name);
			System.out.println("Roll no.- "+roll_no);
			
		}
	}

