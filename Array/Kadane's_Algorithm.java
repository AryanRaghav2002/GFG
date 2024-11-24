class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

    
        // Your code here
        int n=arr.length;
        int maxEnding=arr[0];
        int res=arr[0];
        
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i] , arr[i]);
            res=Math.max(res , maxEnding);
        }
        
        return res;
    }
}