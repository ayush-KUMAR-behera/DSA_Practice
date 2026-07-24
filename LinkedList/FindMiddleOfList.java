package LinkedList;
class ListNode{
     Node head;
    class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    void addElement(int data){
        Node newNode=new Node(data,null);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        if(head==null){
            System.out.println("List is Empty");
            return;
         }
         Node temp=head;
         while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
         }
         System.out.println("null");
    }
}
public class FindMiddleOfList {
    public static void main(String[] args) {
        ListNode list=new ListNode();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        list.display();
        System.out.println(findMiddle(list.head).data);
        list.addElement(6);
        list.addElement(7);
        list.display();
        System.out.println(findMiddle(list.head).data);
    }
    public static ListNode.Node  findMiddle(ListNode.Node head){
        ListNode.Node slow=head;
        ListNode.Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
