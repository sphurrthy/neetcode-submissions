class Solution {
    public int maxProfit(int[] prices) {
        int minP= prices[0];
        int maxPf =0;
        for(int i=0;i<prices.length; i++){
            int currP = prices[i];
            if(minP>currP){
                minP=currP;
            }
            else{
                int profit= currP- minP;
                if(maxPf<profit){
                    maxPf=profit;
                }
            }
        }
        return maxPf;
    }
}
