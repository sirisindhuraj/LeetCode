class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!s1.isEmpty()&&temperatures[i]>temperatures[s1.peek()]){
                int in=s1.pop();
                res[in]=i-in;
            }
            s1.push(i);
        }
        return res;
    }
}