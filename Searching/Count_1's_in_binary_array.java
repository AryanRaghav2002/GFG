class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    
    public static int countOnes(int arr[], int N){
        
        // Your code here
        
        int low=0,high=N-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0)
            high=mid-1;
            else if(arr[mid]==1){
                if(mid==N-1 || arr[mid]!=arr[mid+1])
                return mid+1;
                low=mid+1;
            }
        }
        return 0;
        
    }
}