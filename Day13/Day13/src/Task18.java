
class Node18 {
    int data;
    Node18 next;
    Node18 prev;


    Node18(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }
}
public class Task18 {
    Node18 head;
    Node18 tail;

    public Task18() {
        this.head = null;
        this.tail = null;
    }

    // Method to add a node to the end of the list
    public void addNode(int data) {
        Node18 newNode = new Node18(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to display the list (forward traversal)
    public void displayForward() {
        Node18 current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Doubly Linked List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the list (backward traversal)
    public void displayBackward() {
        Node18 current = tail;
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Doubly Linked List (Backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task18 dll = new Task18();
        dll.addNode(10);
        dll.addNode(40);
        dll.addNode(90);
        dll.addNode(80);
        dll.addNode(30);
        dll.displayForward();
        dll.displayBackward();
    }
}