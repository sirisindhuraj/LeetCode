class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int l=0;
        int j=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1)
                dq.poll();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();
            dq.offer(i);
            if(i>=k-1){
                arr[j++]=nums[dq.peek()];
                l++;
            }
        }
        return arr;
    }
}