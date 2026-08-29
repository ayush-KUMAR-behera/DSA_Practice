package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmaller {
    	public static void main(String[] args) {
        int[] arr={4,1,2,5,3};
        System.out.println(Arrays.toString(nextSmaller(arr)));
        
	}
	public static int[] nextSmaller(int[] a){
	    int[] res=new int[a.length];
	    Stack<Integer> s=new Stack();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=s.peek();
            }
            
            s.push(a[i]);
        }
	    return res;
	}
}
