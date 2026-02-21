class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1=new Stack<>();
        int n=tokens.length;
        if(n==0) return 0;
        if(n==1) return Integer.parseInt(tokens[0]);
        int ans=0;
        for(int i=0;i<n;i++){
            String str=tokens[i];
            if(str.equals("+")){
                 ans=s1.pop()+s1.pop();
                s1.push(ans);
            }
            else if(str.equals("*")){
                 ans=s1.pop()*s1.pop();
                s1.push(ans);
            }
            else if(str.equals("/")){
                int a=s1.pop();
                int b=s1.pop();
                 ans=b/a;
                s1.push(ans);
            }
            else if(str.equals("-")){
                int a=s1.pop();
                int b=s1.pop();
                 ans=b-a;
                s1.push(ans);
            }
            else{
                s1.push(Integer.parseInt(str));
            }
        }
        return ans;
    }
}



/**You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.*/