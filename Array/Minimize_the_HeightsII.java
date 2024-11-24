class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
         int n = arr.length;
        if (n == 1) return 0; // Only one tower, no difference.

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Calculate the initial difference
        int initialDifference = arr[n-1] - arr[0];

        // Step 3: Initialize result with initial difference
        int result = initialDifference;

        // Step 4: Traverse and calculate new differences
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        for (int i = 1; i < n; i++) {
            if(arr[i]-k <0) // find the the firt element which doesnt give -ve value afterr subtrcting k.
            continue;
            
            int minHeight = Math.min(smallest, arr[i] - k);
            int maxHeight = Math.max(largest, arr[i-1] + k);

            // Update result with the minimum difference found
            result = Math.min(result, maxHeight - minHeight);
        }

        return result;
    }
}