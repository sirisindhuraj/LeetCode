class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while(low <= high){

            int pX = (low + high) / 2;
            int pY = (m + n + 1) / 2 - pX;

            int maxLeftX = (pX == 0) ? Integer.MIN_VALUE : nums1[pX - 1];
            int minRightX = (pX == m) ? Integer.MAX_VALUE : nums1[pX];

            int maxLeftY = (pY == 0) ? Integer.MIN_VALUE : nums2[pY - 1];
            int minRightY = (pY == n) ? Integer.MAX_VALUE : nums2[pY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((m + n) % 2 == 0){
                    return (double)(Math.max(maxLeftX, maxLeftY) + 
                                    Math.min(minRightX, minRightY)) / 2;
                }
                else{
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            }
            else if(maxLeftX > minRightY){
                high = pX - 1;
            }
            else{
                low = pX + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}

/**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
*/