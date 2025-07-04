import java.util.Queue;
public class Task11 {
    int front,rear,size;
    int[] que;

    public Task11(int size){
        this.size= size;
        que=new int[size];
        front =rear-1;
    }

    //checking empty

    public boolean isEmpty(){
        return  front == -1;
    }
    public boolean isFull(){
        return  rear == size-1;
    }
    //enquing elements
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Que is full..");
            return;
        }
        if(isEmpty()){
            front =0;
        }
        rear++;
        que[rear] =element;
        System.out.println(" element enqued : " + element);
    }
    public void dequeue(){
  //here checking que is empty or not
        if(isEmpty()){
            System.out.println("Que is Empty..");
            return;
        }
        System.out.println(que[front] + "dequeued");
        if(front == rear){
            front = rear =-1; //making que as empty
        }else{
            front++;

        }

    }

    public void peek(){
        if(isEmpty()){
            System.out.println("que empty");
        }else{
            System.out.println("Frong element: " + que[front]);
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Que is Empty..");
            return;
        }
        System.out.println("Que elements: " );
        for (int i=front;i<= rear;i++){
            System.out.print(que[i]+ " ");
        }

    }

    public static void main(String[] args){
        Task11 obj =new Task11(4);
        obj.enqueue(23);
        obj.enqueue(89);
        obj.enqueue(30);
//        obj.enqueue(56);
        obj.display();

        obj.peek();
        obj.dequeue();

        obj.dequeue();


        System.out.println("Que empty? : " + obj.isEmpty());
        System.out.println("Que full? : " + obj.isFull());

    }

}

