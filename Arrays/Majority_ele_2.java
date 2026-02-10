class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);    
        }
        for(int key: map.keySet()){
            if(map.get(key)>n/3){
                arr.add(key);
            }
        }
        return arr;
    }
}