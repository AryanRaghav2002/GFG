class Solution {

    int Maximize(int arr[]) {
        // Complete the function
       Arrays.sort(arr); // Sort array in ascending order
        int n = arr.length;
        long sum = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            // (arr[i] * (long)i) % mod keeps values within range
            sum = (sum + (arr[i] * (long) i) % mod) % mod;
//i is automatically converted from int to long in java, this is called type promotion.
        }

        return (int) sum;
    }
}