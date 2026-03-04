class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int l=1;
        int r=0;
        for(int p:piles){
            r=Math.max(r,p);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            int hr=0;
            for(int p:piles){
                h+=(p+mid-1)/mid;
            }
             if(hr<=h){
                l=mid;
        }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}

/**
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4*/