package Q1;

public interface Printable {
    void print();

    public default void hi(){
        System.out.println("hi");
    }
}
