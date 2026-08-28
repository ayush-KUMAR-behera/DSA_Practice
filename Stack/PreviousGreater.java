package Stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreater {
	public static void main(String[] args) {
        int[] arr={4,1,2,5,3};
        System.out.println(Arrays.toString(prevGreater(arr)));
        
	}
	public static int[] prevGreater(int[] a){
	    int[] res=new int[a.length];
	    Stack<Integer> s=new Stack();
	    res[0]=-1;
	    s.push(a[0]);
	    for(int i=1;i<a.length;i++){
	        while(!s.isEmpty()&&s.peek()<=a[i]){
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