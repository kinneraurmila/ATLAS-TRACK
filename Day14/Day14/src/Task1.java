
class MaNode {
    int data;
    MaNode next;

    public MaNode(int data) {
        this.data = data;
        this.next=null;
    }
}

public class Task1 {
    MaNode head;

    public void add(int data){

        MaNode newNode =new MaNode(data);
        if (head == null){
            head= newNode;
        }else{
            MaNode current =head;
            while(current.next !=null){
                current =current.next;
            }
            current.next=newNode;
        }

    }
    public void display(){
        MaNode current =head;
        if(head == null){
            System.out.println("List empty: ");
            return;
        }
        System.out.print("Singly LinkedList : ");
        while (current != null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Task1 obj =new Task1();
        obj.add(23);
        obj.add(67);
        obj.add(56);
        obj.add(12);

        obj.display();
    }

}


