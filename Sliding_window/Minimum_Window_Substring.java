class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m>n) return "";
        int[] a=new int[128];
        int[] b=new int[128];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            b[t.charAt(i)]++;
            a[s.charAt(i)]++;
        }
        if(matches(a,b)) ans=Math.min(ans,m);
        int l=0;
        int st=0;
        for(int j=m-1;j<n;j++){
            if(j>m-1)
                a[s.charAt(j)]++;
            while(matches(a,b)){
                if(ans>j-l+1){
                    ans=j-l+1;
                    st=l;
                }
                a[s.charAt(l)]--;
                l++;
            }
        }
        return ans==Integer.MAX_VALUE?"" : s.substring(st,st+ans);
    }
    public boolean matches(int[] a,int[] b){
        for(int i=0;i<128;i++){
            if(a[i]<b[i]){
                return false;
            }
            
        }
        return true;
    }
}