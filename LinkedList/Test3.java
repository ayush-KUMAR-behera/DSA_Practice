package LinkedList;
//Circular Linked List
class CircularLL{
    Node head;
    Node tail;
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
        return head==null;
    }

    int getSize(){
        return this.size;
    }

    void addFirst(int data){
        Node newNode=new Node(data,null);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        size++;
    }

    void addLast(int data){
        Node newNode=new Node(data,null);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
        size++;
    }

    void display(){
        if(isEmpty()){
            System.out.println("List is Empty...");
            return;
        }
        Node temp=head;
        while (temp!=tail) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    void deleteFirst(){
        if (isEmpty()) {
            System.out.println("List is Empty...");
            return;
        }
        if(getSize()==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        size--;
        head=head.next;
        tail.next=head;
    }

    void deleteLast(){
        if(isEmpty()){
            System.out.println("List is empty...");
            return;
        }
        
        if(getSize()==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        Node curr=head.next;
        Node prev=head;
        while (curr!=tail) {
            curr=curr.next;
            prev=prev.next;
        }
        curr.next=null;
        tail=prev;
        tail.next=head;
        size--;
    }

    void reverse(){
        if(isEmpty()){
            System.out.println("List is Empty...");
            return;
        }
        Node curr=head;
        Node prev=tail;
        Node next=null;
        /*do {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } while (curr!=head);
         */
        int count=0;
        while(count<getSize()){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        tail=head;
        head=prev;
    }
}

public class Test3 {
    public static void main(String[] args) {
        CircularLL l=new CircularLL();
        l.display();
        l.addFirst(12);
        l.addFirst(9); 
        l.addLast(15);
        l.addLast(23);
        l.display();
        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        l.deleteFirst();
        l.display();
        l.deleteLast();
        l.display();
        System.out.println(l.getSize());
        l.addFirst(123);
        l.addLast(999);
        l.addFirst(1);
        l.addLast(9);
        l.display();
        System.out.println(l.getSize());
        l.reverse();
        l.display();
    }
}
