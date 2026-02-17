class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int l=0;
        int r=n-k;
        int s=Integer.MAX_VALUE;
        ArrayList<Integer> lis=new ArrayList<>();
        while(l<r){
            int m=(l+r)/2;
            if(x-arr[m]>arr[m+k]-x){
                l++;
            }
            else{
                r--;
            }
        }
        for(int i=l;i<l+k;i++){
            lis.add(arr[i]);
        }
        return lis;
    }
}