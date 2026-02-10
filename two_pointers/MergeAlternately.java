class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int k=Math.min(n,m);
        StringBuilder s=new StringBuilder();
        int i=0;
        for(i=0;i<k;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if(i<n){
            while(i<n){
                s.append(word1.charAt(i));
                i++;
            }
        }
        else{
            while(i<m){
                s.append(word2.charAt(i));
                i++;
            }
        }
        return s.toString();
    }
}