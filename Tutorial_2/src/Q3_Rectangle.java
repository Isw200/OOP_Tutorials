import java.awt.Rectangle;

public class Q3_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        System.out.println("R1: "+r1);

        Rectangle r = new Rectangle(0, 0, 100, 50);
        r.grow(10, 20);
        System.out.println("R: "+r);


        Rectangle r2 = r1;

        //r2 refers r1's memory location. So r2 is also has pointed to r1

        System.out.println("New R2: "+r2);
    }
}
