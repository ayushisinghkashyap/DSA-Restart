class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int p = prices[0];
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]-p < 0){
                p = prices[i];
            }
            else{
                mp = Math.max(mp,prices[i]-p);
            }
            
        }

        return mp;
    }
}