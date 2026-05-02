package HashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Problem: ContainsDuplicate
// Time: O(n)
//Space: O(n) HashSet & HashMap

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,3};
        // System.out.println(isDuplicate(arr));
        System.out.println(isDuplicatePresent(arr));
    }

//Using HasSet
public static boolean isDuplicatePresent(int[] arr){
    Set<Integer> res=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(res.contains(arr[i])){
            return true;
        }
        res.add(arr[i]);
    }
    return false;
}

    //Using HashMap
    public static boolean isDuplicate(int[] arr){
        Map<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(res.containsKey(arr[i])){
                res.put(arr[i],res.get(arr[i])+1);
            }else{
                res.put(arr[i],1);
            }

            if(res.get(arr[i])>1){
                return true;
            }
        }
        return false;
    }
}
