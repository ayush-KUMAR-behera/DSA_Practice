package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="{{}}";
        String s2="{{[)}}";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
    }
      public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }           
        }
        return stack.isEmpty();
    }
}
