package Stack;

import java.util.Stack;

public class RemoveAllAdjDuplicateInString {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicate(s));
    }
    public static String removeDuplicate(String s){
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }

            // if (stack.peek()==ch) {
            //     stack.pop();
            //     continue;
            // }
            // stack.push(ch);
            if(!stack.isEmpty() &&   stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
