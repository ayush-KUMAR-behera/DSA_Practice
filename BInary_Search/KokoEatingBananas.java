package BInary_Search;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles, h));
    }

 public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxEle(piles);
        int res=-1;
        while(low<=high){
           int mid = low + (high - low) / 2;
            long eatTime=inHour(piles,mid);
            if(eatTime>h){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }

    public static int maxEle(int[] piles){
        int max=-1;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        return max;
    }

    public static long inHour(int[] piles,int speed){
        long hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=piles[i]/speed;
            if(piles[i]%speed!=0){
                hour++;
            }
        }
        return hour;
    }

}
