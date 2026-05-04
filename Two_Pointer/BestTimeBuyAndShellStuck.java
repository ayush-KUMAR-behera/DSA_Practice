package Two_Pointer; 
// Problem:121. Best Time to Buy and Sell Stock
//Time:O(n)
//Space:O(1)
public class BestTimeBuyAndShellStuck {
    public static void main(String[] args) {
        // int[] prices1={7,1,5,3,6,4};
        int[] prices2={7,6,4,3,1};
        // System.out.println(bestSell(prices1));
        System.out.println(bestSell(prices2));

    }
    public static int bestSell(int[] prices){
        int maxProfit=0;
        int minBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(minBuy>prices[i])
            {
                minBuy=prices[i]; // min price so best time to buy
            }
            else
            {
                    int profit=prices[i]-minBuy;
                    if(profit>maxProfit){
                        maxProfit=profit;
                    }
            }
        }
        return maxProfit;
    }
}