package Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval_List_InterSection {
    public static void main(String[] args) {
        int[][] firstList={{0,2},{5,10},{13,23},{24,25}};
        int[][] secList={{1,5},{8,12},{15,24},{25,26}};
        System.out.println(Arrays.deepToString(intervalIntersection(firstList, secList)));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            int s1=firstList[i][0];
            int e1=firstList[i][1];
            int s2=secondList[j][0];
            int e2=secondList[j][1];
            // if overlap happen the we found insertion
            if(s1<=s2){
            if(e1>=s2){
                int s=Math.max(s1,s2);
                int e=Math.min(e1,e2);
                res.add(new int[]{s,e});
              }
            }else{
                    if(e2>=s1){
                    int s=Math.max(s1,s2);
                    int e=Math.min(e1,e2);
                    res.add(new int[]{s,e});
                    }
            }

            if(e1<=e2){
                i++;
            }else{
                j++;
            }
            
        }

        return res.toArray(new int[res.size()][]);
    }
}


