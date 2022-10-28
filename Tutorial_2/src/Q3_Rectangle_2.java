public class Q3_Rectangle_2 {
    public static void main(String[] args)
    {
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);

        //In this program n1's value is 150. In the line 5 we have created a double named n2 and make equal to n1s value. In here it makes another memory address in stack.

        //but in previous problem we created another Rectangle object and make equal it into rectangle 1's value. So it creates a variable named r2 in stack and it pointers to teh same memory address of r1's in the heap.
    }

}
