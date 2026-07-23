package LinkedList;
public class ListCircle {
    public static void main(String[] args) {
        CircularLL circleList=new CircularLL();
        circleList.addFirst(123);
        circleList.addLast(78);
        circleList.addFirst(12);
        circleList.addLast(101);
        // circleList.display();
        System.out.println(hasCycle1(circleList.head)); // As it circilar list rtn true;
        SingelLL list=new SingelLL();
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(23);
        list.addLast(78);
        System.out.println(hasCycle2(list.head));// As it singele List rtn false;

    }

      public static boolean hasCycle2(SingelLL.Node head){
        if(head==null){
            return false;
        }
        SingelLL.Node slow=head;
        SingelLL.Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==head){
                return true;
            }
        }
        return false;
    }

    // Circular LIst parameter
    public static boolean hasCycle1(CircularLL.Node head){
        if(head==null){
            return false;
        }
        CircularLL.Node slow=head;
        CircularLL.Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==head){
                return true;
            }
        }
        return false;
    }
}
