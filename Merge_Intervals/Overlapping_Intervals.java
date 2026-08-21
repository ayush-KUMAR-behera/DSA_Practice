package Merge_Intervals;

import java.util.Arrays;

public class Overlapping_Intervals {
    public static void main(String[] args) {
         int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
         System.out.println(isOverlapping(intervals));
         int[][] intervals2={{1,3},{7,9},{4,6},{10,13}};
         System.out.println(isOverlapping(intervals2));
        }
    public static boolean isOverlapping(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int s1=intervals[0][0];
        int e1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s2=intervals[i][0];
            int e2=intervals[i][1];
            if(e1>=s2){
                return true;
            }
            s1=s2;
            e1=e2;
        }
        return false;
    }
}
