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
public class PalindromeList {
    public static void main(String[] args) {
        ListNode list=new ListNode();
        list.addElement(1);
        list.addElement(2);
        list.addElement(1);
        // list.addElement(45); // if i comment this line 1-2-1 is true, if not then 1-2-1-45 false
        list.display();
        System.out.println(isPalindrome(list.head));
    }

    public static boolean isPalindrome(ListNode.Node head){
        // 1-> find middel 2--> Rev 2nd half then comapre value of first half and second half
        ListNode.Node slow=head;
        ListNode.Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now slow point midel of node
        //2->rev half of node
         ListNode.Node curr=slow;
         ListNode.Node next=null;
         ListNode.Node prev=null;
         while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
        ListNode.Node temp1=head;
        ListNode.Node temp2=prev;
        //-> Compare value
        while (temp2!=null) {
            if(temp1.data==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }else{
                return false;
            }
        }
        return true;
    }
}
