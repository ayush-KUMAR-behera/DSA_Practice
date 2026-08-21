package Merge_Intervals;

import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
          int[] start={1,10,7};
      int[] end={4,15,10};
      System.out.println(minMettingRooms(start,end));
      int[] start2={2,9,6};
       int[] end2={4,12,10};
      System.out.println(minMettingRooms(start2,end2));
    }
        public static int minMettingRooms(int[] start,int[] end){
      Arrays.sort(start);
      Arrays.sort(end);
      int res=0;
      int i=0;
      int j=0;
      int room=0;
      while(i<start.length&& j<end.length){
        if(start[i]<end[j]){
          room++;
          res=Math.max(res,room);
          i++;
        }else{
          j++;
          room--;
        }
      }
      return res;
    }
}
