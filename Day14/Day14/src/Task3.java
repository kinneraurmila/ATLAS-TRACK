
class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Node first = new Node(36);
        Node second = new Node(78);
        Node third = new Node(12);

        first.next = second;
        second.next = third;
        third.next = first;

        Node current = first;
        System.out.print("Circular LL: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;

        } while (current != first);

    }

}



