package practice;

interface Drawable1 {
    public void draw();
}
 
public class WithLambdaExpDemo {
    public static void main(String[] args) {
 
        int width = 10;
 
        // with lambda, Drawable implementation using anonymous class
        Drawable1 d=()-> {
 
            System.out.println("Drawing " + width);
 
        };
        d.draw();
    }
}
