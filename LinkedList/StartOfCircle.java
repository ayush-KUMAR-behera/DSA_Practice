package LinkedList;

/* To solve start of circle point of LinkedList i devlop my own custom LinkedList goes of to 5 element, you can easily change  circle meeting in addelement() and text it according to your condition
*/
class SList{
    Node head;
    int size=0;
     Node pointer;
    class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    int getSize(){
        return this.size;
    }
     
    void addElement(int data){
        Node newNode=new Node(data,null);
        if(getSize()<5){
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp=head;
        pointer=head;
        while(temp.next!=null){
           
            temp=temp.next;
        }
            
        temp.next=newNode;
        size++;
        if(getSize()==5){
            temp.next.next=pointer;
        }
        if(getSize()==3){
            pointer=newNode;
        }
           
    }else{
        System.out.println("List is full");
       return;
      }
    }

    void display(){
        if(head==null){
            System.out.println("List is empty...");
            return;
        }
        Node temp=head;
        int count=1;
        while (count<=getSize()) {
            System.out.print(temp.data+" --> ");
            count++;
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class StartOfCircle {
    public static void main(String[] args) {
        SList s=new SList();
        s.addElement(1);
        s.addElement(2);
        s.addElement(3);
        s.addElement(4);
        s.addElement(5);
        // s.addElement(6); // List is full
        s.display();
        // System.out.println(hasCircle(s.head));
        System.out.println(startIndexOfCircle(s.head));

    }

    public static boolean hasCircle(SList.Node head){
        if(head==null){
            return false;
        }
        SList.Node slow=head;
        SList.Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static SList.Node startIndexOfCircle(SList.Node head){
        SList.Node slow=head;
        SList.Node fast=head;
        while (fast!=null&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
                
            }
        }
        return null;
    }
}
