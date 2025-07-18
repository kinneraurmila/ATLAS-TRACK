
import java.util.*;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class  Task18{
    static void storeAlternate(Node1 root, List<Integer> arr, int lvl) {
        if (root == null) return;
        storeAlternate(root.left, arr, lvl + 1);

        if (lvl % 2 != 0)
            arr.add(root.data);

        storeAlternate(root.right, arr, lvl + 1);
    }

    static void modifyTree(Node1 root, List<Integer> arr, int lvl) {
        if (root == null) return;
        modifyTree(root.left, arr, lvl + 1);

        if (lvl % 2 != 0) {
            root.data = arr.remove(arr.size() - 1);
        }
        modifyTree(root.right, arr, lvl + 1);
    }

    static void reverseAlternate(Node1 root) {
        List<Integer> arr = new ArrayList<>();
        storeAlternate(root, arr, 0);
        modifyTree(root, arr, 0);
    }
    static void printInorder(Node1 root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);

        System.out.println("Inorder Traversal of given tree");
        printInorder(root);

        reverseAlternate(root);

        System.out.println("\nInorder Traversal of modified tree");
        printInorder(root);
    }
}

