package Stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String s="abc";
        System.out.println(reverse(s));
    }
    
    public  static String reverse(String s){
        StringBuilder res=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.toString();
    }

}