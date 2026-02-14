class Solution {
    public int maxProfit(int[] prices) {
        int minp=100001;
        int maxpro=0;
        for(int p: prices){
            if(p<minp){
                minp=p;
            }else{
                maxpro=Math.max(maxpro,p-minp);
            }
        }
        return maxpro;
    }
}