class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;
        int[] ans=new int[m];
        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);
        return ans;
    }
}