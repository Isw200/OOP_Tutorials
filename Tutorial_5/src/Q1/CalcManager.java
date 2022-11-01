package Q1;

public class CalcManager {
    static boolean isEven(int n){
        if (n%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    static int cube(int n){
        return n*n*n;
    }
    static double add(double...x){
        //varargs
        double sum = 0;
        for (double i: x){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(cube(3));
        System.out.println(add(1,2,3,4,5));
    }
}
