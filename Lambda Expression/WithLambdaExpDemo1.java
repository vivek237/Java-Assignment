package practice;

interface square {
    public void display();
}
 

public class WithLambdaExpDemo1 {
	public static void main(String[] args) {
		 
        int a = 10;
        
        // with lambda, square implementation using anonymous class
        square d=()-> {
 
            System.out.println("square " + a*a);
 
        };
        d.display();
    }
}
