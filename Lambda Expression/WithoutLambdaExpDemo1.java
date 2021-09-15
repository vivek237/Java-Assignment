interface Square {
    public void display();
}
 
public class WithoutLambdaExpDemo1 {
    public static void main(String[] args) {

        int a = 2;
 
        // without lambda, square implementation using anonymous class
        Square s = new Square() { //interface object
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("square " + a*a);
			}
        };
        s.display();
    }
}