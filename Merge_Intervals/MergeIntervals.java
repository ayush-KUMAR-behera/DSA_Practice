package Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                end1=Math.max(end1,end2);
            }else{
        
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
            }
            
        }

        res.add(new int[]{start1,end1}); 

        return res.toArray(new int[res.size()][]);
    }
}
