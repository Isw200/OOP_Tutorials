package Q9;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add a new node to the end of the list
    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.getNextNode() != null){
                temp = temp.getNextNode();
            }

            temp.setNextNode(newNode);
        }
    }

    // Add a new node to the front of the list
    public void insertAtFront(int value) {
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else{
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    // Add a new node to after n th node
    public void addAfter(int value, int n) {
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            for (int i = 0; i < n; i++) {
                temp = temp.getNextNode();
            }
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
        }
    }

    // Delete a node from front
    public void deleteFront(){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.getNextNode();
        }
    }

    // Delete after n th node
    public void deleteAfter(int n){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            for (int i = 0; i < n; i++) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(temp.getNextNode().getNextNode());
        }
    }

    // Print the LinkedList
    public void traverse() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

}
