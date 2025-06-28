import java.util.NoSuchElementException;
import java.util.LinkedList;

import static java.nio.file.Files.size;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// try to add element in the list

public class CustomLinkedList<T> {
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
    //adding at the ending/last
    public void addLast(int data) {
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
        size++;
    }
    // Remove from the beginning
    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }
    // Remove last element
    public void removeLast() {
        if (head == null | head.next != null) {
            head=null;
            return ;
        }
       Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next=null;
    }
    //traverse
    public void traverse(){
        Node current =head;
        while(current != null){
            System.out.print(current.data + "->" );
            current = current.next;
        }
        System.out.println("null");
    }

    // Get element at index
     public int get(int index) {
         checkBounds(index);
         Node current = head;
         for (int i = 0; i < index; i++) {
             current = current.next;
         }
         return  current.data;
     }  // Size of the list
        public int size() {
           return size;
        }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }



}
