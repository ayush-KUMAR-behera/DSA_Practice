package LinkedList;
// Singel Linked List impl
class SingelLL{
    Node head;
    int size;
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
        size++;
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void addLast(int data){
        Node newNode=new Node(data,null);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void print(){
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" => ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void deleteFirst(){
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    void deleteLast(){
        if (isEmpty()) {
             System.out.println("List is empty");
             return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while (curr.next!=null) {
            prev=prev.next;
            curr=curr.next;
        }
        prev.next=null;
    }

    void reverse(){
        Node next=null;
        Node prev=null;
        Node curr=head;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

}
public class Test1 {

    public static void main(String[] args) {
        SingelLL l=new SingelLL();
        l.print();
        l.addFirst(4444);
        l.addFirst(11);
        l.addLast(77);
        l.addLast(89);
        l.print();
        l.deleteLast();
        l.print();
        l.addFirst(7878);
        l.print();
        l.deleteFirst();
        l.print();
        l.reverse();
        l.print();
    }
    
}
