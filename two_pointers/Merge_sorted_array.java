class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;
        int r=0;
        int k=0;
        int[] arr=new int[m+n];
        while(l<m&&r<n){
            if(nums1[l]<=nums2[r]){
                arr[k]=nums1[l];
                l++;
                k++;
            }
            else{
                if(nums1[l]>nums2[r]){
                arr[k]=nums2[r];
                r++;
                k++;
            }
            }
        }
        if(l>=m){
            while(r<n){
                arr[k]=nums2[r];
                r++;
                k++;
            }
        }
        else{
            while(l<m){
            arr[k]=nums1[l];
                l++;
                k++;
            }
        }
        System.arraycopy(arr,0,nums1,0,m+n);
    }
}