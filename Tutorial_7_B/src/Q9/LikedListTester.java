package Q9;

public class LikedListTester {
    public static void main(String[] args) {
LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);

        list.traverse();
        list.deleteFront();
        list.traverse();
        list.addAfter(100, 3);
        list.traverse();

    }
}
