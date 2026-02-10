class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
       mergeSort(nums,0,n-1);
       return nums;
    }
    public void mergeSort(int[] nums,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    public void merge(int[] nums,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=0;
        int[] arr=new int[r-l+1];
        while(i<=mid && j<=r){
            if(nums[i]<=nums[j]){
                arr[k]=nums[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums[j];
                j++;
                k++;
            }
        }
        if(i>mid){
            while(j<=r){
                arr[k]=nums[j];
                k++;
                j++;
        }
        }
        else{
            while(i<=mid){
                arr[k]=nums[i];
                k++;
                i++;
            }
        }
        for(int p=0;p<arr.length;p++){
            nums[l+p]=arr[p];
        }
    }
}