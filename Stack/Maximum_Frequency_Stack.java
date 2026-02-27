class FreqStack {
    Map<Integer,Integer> fr;
    Map<Integer,Stack<Integer>> group;
    int mfr;
    public FreqStack() {
        fr=new HashMap<>();
        group=new HashMap<>();
        mfr=0;
    }
    
    public void push(int val) {
        int f=fr.getOrDefault(val,0)+1;
        fr.put(val,f);
        mfr=Math.max(mfr,f);
        group.putIfAbsent(f,new Stack<>());
        group.get(f).push(val);
    }
    
    public int pop() {
        int val=group.get(mfr).pop();
        fr.put(val,fr.get(val)-1);
        if(group.get(mfr).isEmpty()){
            mfr--;;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

 /**
 Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

Implement the FreqStack class:

FreqStack() constructs an empty frequency stack.
void push(int val) pushes an integer val onto the top of the stack.
int pop() removes and returns the most frequent element in the stack.
If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.*/