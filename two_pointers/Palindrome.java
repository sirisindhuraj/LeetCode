class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        char[] arr=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
        }
        return true;
    }
}