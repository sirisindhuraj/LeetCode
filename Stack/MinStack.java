class MinStack {
    Stack<Integer> s1;
    Stack<Integer> minstack;
    public MinStack() {
        s1=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(s1.isEmpty()) return;
        int r=s1.pop();
        if(!minstack.isEmpty()&&r==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */



 /**Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.*/