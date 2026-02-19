class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n==1) return false;
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<n;i++){
            char p=s.charAt(i);
            if(p=='('||p=='{'||p=='['){
                sta.push(p);
            }
            else{
                if(sta.isEmpty()) return false;
                char t=sta.pop();
                if(p==')'&& t!='(') return false;
                if(p==']'&& t!='[') return false;
                if(p=='}'&& t!='{') return false;
            }
        }
        return sta.isEmpty();
    }
}