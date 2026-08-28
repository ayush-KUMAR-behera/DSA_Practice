package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * PreviosSmaller
 */
public class PreviousSmaller {

    	public static void main(String[] args) {
        int[] arr={4,1,2,5,3,2,1,7};
        System.out.println(Arrays.toString(prevSmaller(arr)));
        
	}
	public static int[] prevSmaller(int[] a){
	    int[] res=new int[a.length];
	    Stack<Integer> s=new Stack();
	    res[0]=-1;
	    s.push(a[0]);
	    for(int i=1;i<a.length;i++){
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