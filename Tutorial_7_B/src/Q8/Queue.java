package Q8;

import java.util.ArrayList;

public class Queue<T> {
    private int maxSize;
    private ArrayList<T> queue = new ArrayList<>();

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }
    public void enQueue(T item){
        if (queue.size() < maxSize){
            queue.add(item);
        }
    }

    public T deQueue(){
        if (queue.size() > 0){
            return queue.remove(0);
        }
        return null;
    }

    public String toString(){
        return queue.toString();
    }
}
