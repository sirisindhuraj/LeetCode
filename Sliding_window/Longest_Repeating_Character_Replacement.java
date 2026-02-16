class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq=new int[26];
        int l=0;
        int mf=0;
        int ml=0;
        for(int r=0;r<n;r++){
            int idx=s.charAt(r)-'A';
            freq[idx]++;
            mf=Math.max(mf,freq[idx]);
            while((r-l+1)-mf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}