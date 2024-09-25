class Solution
{
    // arr[]: input array
    // n: size of array
    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int currDiff=1, maxDiff=1;
        
        for(int i=1;i<n;i++){
            if((arr[i-1]%2==0 && arr[i]%2!=0) || (arr[i-1]%2!=0 && arr[i]%2==0)){
                currDiff++;
                maxDiff=Math.max(currDiff,maxDiff);
            }
            else
            currDiff=1;
        }
        return maxDiff;
    }
}