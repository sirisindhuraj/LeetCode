class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] count=new int[201];
        Arrays.fill(count,0);
        int k=0;
        for(int i=0;i<n;i++){
            int idx=nums[i]+100;
            count[idx]++;
            if(count[idx]>1){
                nums[i]=201;
                k++;
            }
        }
        Arrays.sort(nums);
        return n-k;
    }
}