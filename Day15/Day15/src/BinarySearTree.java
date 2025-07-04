class BNode{
    int data;
    BNode left,right;

    BNode(int value){
        data=value;
        left=right=null;
    }
}
public class BinarySearTree {
    BNode root;

    BinarySearTree(){
        root =null;
    }
    BNode insert(BNode root,int value){
        if(root == null){
            root =new BNode(value);
            return root;
        }
        if(value< root.data){
            root.left=insert(root.left, value);
        }
        else if (value> root.data) {
            root.right=insert(root.right,value);
        }
        return root;

    }
    void preorder(BNode root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    }
    void inorder(BNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }


    void postorder(BNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

    }

    boolean search(BNode root,int key){
        if(root == null){
            return false;
        }if(key ==root.data){
            return true;
        } else if (key< root.data) {
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    BNode delete(BNode root, int key){
        if(root == null){
            return null;
        } else if (key< root.data) {
            root.left = delete(root.left, key);
        } else if (key> root.data) {
            root.right=delete(root.right,key);
        }else{
            if(root.left == null  && root.right == null){
                return null;
            } else if (root.left == null) {
                return root.left;
            } else if (root.right == null) {
                return root.right;
            }
            BNode success = findMin(root.right);
            root.data= success.data;
            root.right =delete(root.right,success.data);
        }
        return root;
    }
    BNode findMin(BNode root){
        while (root.left != null){
            root =root.left;
        }
        return root;
    }
    public static void main(String[] args){
        BinarySearTree tree =new BinarySearTree();

        tree.root =tree.insert(tree.root,50);

        tree.insert(tree.root,70);
        tree.insert(tree.root,90);
        tree.insert(tree.root,55);
        tree.insert(tree.root,40);
        tree.insert(tree.root,30);

        System.out.println("preorder: ");
        tree.preorder(tree.root);

        System.out.println("\n inorder: ");
        tree.inorder(tree.root);

        System.out.println(" \n postorder: ");
        tree.postorder(tree.root);

        System.out.println("\n Searching value/node :"  );

        boolean found =tree.search(tree.root , 40);
        System.out.println(found ?  "found":"not found");

        boolean found1 =tree.search(tree.root , 100);
        System.out.println(found1 ?  "found":"not found");


        System.out.println("Before Deleting :");
        tree.inorder(tree.root);

        tree.root=tree.delete(tree.root,30);

        System.out.println("\n After deletion: ");
        tree.inorder(tree.root);

    }
}
