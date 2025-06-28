class Node1 { //node class
    int data;
    Node next;
    Node1(int data){
        this.data= data;
        this.next= next;
    }
}
public class LinkedList {
    private Node head;
    private int size = 0;

    // Add at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
        //add at end
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }else{

        }




    }
}
