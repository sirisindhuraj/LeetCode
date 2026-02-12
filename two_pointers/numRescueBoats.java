class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int l=0;
        int r=n-1;
        int c=0;
        Arrays.sort(people);
        int s=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }
            r--;
            c++;
        }
        return c;
    }
}