class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        for(int j=0;j<n;j++){
            Set<Character> dup=new HashSet<>();
            int i=j;
            while(i<n){
            if(!dup.add(s.charAt(i))){
                break;
            }
            i++;
        }
        ans=Math.max(ans,dup.size());
        }
        return ans;
    }
}