class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int res=Math.abs(arr[0]-arr[1]);
        int curr_diff=Math.abs(arr[0]-arr[1]);
        
        for(int i=0;i<n;i++){
            if(i==n-1){
                curr_diff=Math.abs(arr[n-1]-arr[0]);
                res=Math.min( res,curr_diff );
            }
            else if(i<n-1){
                curr_diff=Math.abs(arr[i]-arr[i+1]);
                res=Math.min( res,curr_diff );
            }
        }
        
        return res;
    }
}