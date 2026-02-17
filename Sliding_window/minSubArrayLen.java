class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int ans=1000000001;
        if(Arrays.stream(nums).sum()<target) return 0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return ans;
    }
}