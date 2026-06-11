package Stack;
// Implemention of Stack Using Array

class StackArray{
    int[] data;
    int size;
    int top=-1;
    StackArray(int size){
        data=new int[size];
    }
    boolean isEmpty(){
        return top==-1;
    }
    int getSize(){
        return top+1;
    }

    void push(int value){
        if(getSize()==data.length){
            System.out.println("Stack Over Flow");
            return;
        }
        top++;
        data[top]=value;
    }
    void print(){
        if(isEmpty()){
            System.out.println("Stack is under Flow");
            return;
        }else{
            for(int i=0;i<=top;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }

    }

    int pop(){
        if (isEmpty()) {
            System.out.println("Stack under flow");
            return -1;
        }else{
            int value=data[top];
            top--;
            return value;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack under flow");
            return -1;
        }else{
            return data[top];
        }
    }

    boolean search(int value){
        if(isEmpty()){
            return false;
        }else{
            for(int i=0;i<=top;i++){
                if(value==data[i]){
                    return true;
                }
            }
        }
        return false;
    }
}

public class TestArray {
    public static void main(String[] args) {
        StackArray stack=new StackArray(3);
        stack.push(777);
        stack.push(888);
        stack.push(999);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.search(777));
        System.out.println(stack.search(555));
    }
    
}
