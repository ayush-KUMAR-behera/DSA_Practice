package Queue;

class Que{

    Node front;
    Node rear;
    int size=0;

    class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
        boolean isEmpty(){
            return size==0;
        }

        int getSize(){
            return this.size;
        }

        void enQueue(int data){
            Node newNode=new Node(data,null);
            if(isEmpty()){
                front=newNode;
                rear=newNode;
            }
            else{
            rear.next=newNode;
            rear=newNode;
            }
            size++;
        }
        
        void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp=front;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int deQueue(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int deleteValue=front.data;
            size--;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return deleteValue;
        }

        int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }
    
}

public class TestLinkedList {
    public static void main(String[] args) {
       Que q=new Que();
       q.display();
       q.enQueue(1);
       q.enQueue(2);
       q.enQueue(3);
       q.enQueue(4);
       System.out.println(q.getSize());
       q.display();
       System.out.println(q.deQueue());
       q.display();
       System.out.println(q.peek());
       System.out.println(q.getSize());
    }    
}
