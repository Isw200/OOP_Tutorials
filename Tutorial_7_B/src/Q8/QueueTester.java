package Q8;

public class QueueTester {
    public static<T> void main(String[] args) {
        Queue newQueue = new Queue(5);
        newQueue.enQueue("a");
        newQueue.enQueue("b");
        newQueue.enQueue("c");
        newQueue.enQueue("e");
        newQueue.enQueue("f");

        System.out.println((T) newQueue.toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.toString());
    }
}
