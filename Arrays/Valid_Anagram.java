class Solution {
    public boolean isAnagram(String s, String t) {
        Scanner sc=new Scanner(System.in);
        if(s.length()!=t.length()){
            return false;
        }
        s.toLowerCase();
        t.toLowerCase();
        int[] count = new int[256];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        for(char c : t.toCharArray()){
            count[c]--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}