package LinkedList;
// Double Linked List
class DoubleLL{
    Node head;
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int data,Node prev,Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

    boolean isEmpty(){
       return head==null;
    }

    void addFirst(int data){
        Node newNode=new Node(data,null, null);
        if(head==null){
            head=newNode;
         }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
         }

    }

    void addLast(int data){
        Node newNode=new Node(data,null, null);
        if(head==null){
            head=newNode;
        }else{
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
      }
    }

    void display(){
        if (isEmpty()) {
            System.out.println("List is empty....");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void deleteFirst(){
        if (isEmpty()) {
            System.out.print("List is Empty...");
            return;
        }
        if(head.next==null){
            head=head.next;
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        head.prev=null;     
    }

    void deleteLast(){
        if(isEmpty()){
            System.out.println("List is Empty---");
            return;
        }
        if(head.next==null){
            head=head.next;
            return;
        }
        Node temp1=head.next;
        Node temp2=head;
        while (temp1.next!=null) {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.prev=null;
        temp2.next=null;
    }

    boolean search(int data){
        if (isEmpty()) {
           return false;
        }
        Node temp=head;
        while (temp!=null) {
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    void reverse(){
        Node curr=head;
        Node temp=null;
        while (curr!=null) {
           temp=curr.prev;
           curr.prev=curr.next;
           curr.next=temp;
           curr=curr.prev;
       }
       if (temp != null) {
       head = temp.prev;
        }
    }
 }
public class Test2 {
    public static void main(String[] args) {
        DoubleLL dl=new DoubleLL();
        dl.display();
        dl.addFirst(123);
        dl.addFirst(12);
        dl.addLast(67);
        dl.addLast(789);
        dl.display();
        // dl.deleteFirst();
        // dl.display();
        // dl.deleteFirst();
        // dl.deleteLast();
        // dl.deleteLast();
        // dl.display();
        // System.out.println(dl.search(67));
        // System.out.println(dl.search(76));
        dl.reverse();
        dl.display();

    }
}
