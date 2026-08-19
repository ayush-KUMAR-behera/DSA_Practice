package Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{6,9}};
        int[] newInterval={2,5};

        System.out.println(Arrays.deepToString(insertInterval(intervals, newInterval)));

    }
public static int[][] insertInterval(int[][] intervals,int[] newInterval){
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
    List<int[]> res=new ArrayList<>();
    boolean insert=false;
    for(int i=0;i<intervals.length;i++){
        int start=intervals[i][0];
        int end=intervals[i][1];
        if(start>=newInterval[0]&&!insert){
            res.add(newInterval);
            insert=true;
        }
        res.add(new int[]{start,end});
    }
    if(!insert){
        res.add(newInterval);
    }
    return merge(res.toArray(new int[res.size()][]));
}

public static int[][] merge(int[][] intervals){
    List<int[]> list=new ArrayList<>();
    int start1=intervals[0][0];
    int end1=intervals[0][1];
    for(int i=1;i<intervals.length;i++){
        int start2=intervals[i][0];
        int end2=intervals[i][1];
        if(end1>=start2){
            end1=Math.max(end1, end2);
        }else{
            list.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
    } 
    list.add(new int[]{start1,end1});
    return list.toArray(new int[list.size()][]);
}

}
