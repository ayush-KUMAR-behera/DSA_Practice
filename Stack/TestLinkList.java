package Stack;

// Stack Using LinkedList

class StackLL{
    Node top;
    int size=0;   
    class Node{
        Node next;
        int value;
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    boolean isEmpty(){
        return size==0;
    }   

    int getSize(){
        return this.size;
    }

    void push(int value){
        Node newNode=new Node(value,top);
         size++;
        top=newNode;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        size--;
        int value=top.value;
        top=top.next;
        return value;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        return top.value;
    }

    boolean serach(int value){
        if(isEmpty()){
            return false;
        }
        Node temp=top;
        while (temp!=null) {
            if(temp.value==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

public class TestLinkList {
    public static void main(String[] args) {
        StackLL stack=new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        // System.out.println(stack.pop());
        // stack.pop();
        // stack.pop();
        // stack.display();
        // stack.pop();
        // System.out.println(stack.peek());
        System.out.println(stack.serach(1));
        System.err.println(stack.serach(5));
        System.out.println(stack.getSize());
        stack.pop();
        System.out.println(stack.getSize());
    }
}
