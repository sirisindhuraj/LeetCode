class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uni=new HashSet<>();
        for(int ele:nums){
            if(!uni.add(ele)){
                return true;
            }
        }
        return false;
    }
}