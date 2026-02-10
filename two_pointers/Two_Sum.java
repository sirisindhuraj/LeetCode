class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int l=0;
        int r=n-1;
        while(l<r){
            int s=numbers[l]+numbers[r];
            if(s==target){
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
            else if(s<target){
                l++;
            }
            else{
                r--;
            }
        }
        return arr;
    }
}