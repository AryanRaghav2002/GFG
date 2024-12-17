class Solution {

    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
            return mid;
            
            if(mid<n-1  && arr[mid]<=arr[mid+1])
            low=mid+1;
            else
            high=mid-1;
        }
        return -1;
    }
}