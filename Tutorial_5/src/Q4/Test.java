package Q4;

class X1 {
    public void foo() {
        System.out.println("foo() called in X1");
    }
}
class X2 extends X1 {
    public void foo() {
        System.out.println("foo() called in X2");
    }
}
class X3 extends X2 {
    // overriding foo() of X2
    public void foo() {
        System.out.println("foo() called in X3");
    }
}
public class Test {
    public static void main(String[] args) {
    }
}
/*
  Final classes are used to prevent inheritance
  Final classes are cannot be inherited by any classes
 */
