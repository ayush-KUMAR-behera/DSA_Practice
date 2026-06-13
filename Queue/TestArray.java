package Queue;

class Que{
    int size;
    int[] a;
    int front=-1;
    int rear=-1;
    Que(int size){
        this.size=size;
        a=new int[size];
    }

    boolean isEmpty(){
        return front==-1;
    }

    void enQueue(int data){
        if(rear==size){
            System.out.println(" Queue is Full... ");
            return;
        }
        if(isEmpty()){
            front=rear=0;
        }
            a[rear++]=data;
        
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty... ");
            return -1;
        }

        int deleteValue=a[front];
        front++;
        return deleteValue;
    }

    void Display(){
        if (isEmpty()) {
            System.out.println(" Queue is Empty ");
            return;
        }

        for(int i=front;i<rear;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

     int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return a[front];
     }
}

public class TestArray {
    public static void main(String[] args) {
     
         Que q=new Que(3);
         q.Display();
         q.enQueue(10);
         q.enQueue(11);
         q.enQueue(12);
         q.enQueue(13);
         q.Display();
         System.out.println(q.deQueue());
         q.Display();
         System.out.println(q.peek());
    }
}
