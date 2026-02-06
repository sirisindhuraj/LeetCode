class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i]=51;
                c++;
            }
        }
        Arrays.sort(nums);
        c=n-c;
        return c;
    }
}