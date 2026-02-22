class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1=new Stack<>();
        for(int p : asteroids){
            boolean d=false;
            while(!s1.isEmpty()&&p<0&&s1.peek()>0){
                if(s1.peek()< -p){
                    s1.pop();
                }else if(s1.peek()== -p){
                    s1.pop();
                    d=true;
                    break;
                }else{
                    d=true;
                    break;
                }
            }
            if(!d) s1.push(p);
        }
        int[] res=new int[s1.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=s1.pop();
        }
        return res;
    }
}