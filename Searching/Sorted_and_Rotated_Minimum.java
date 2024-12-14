class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            if(low==high) return arr[low];
            int mid=(low+high)/2;
            if(arr[mid]>arr[high])
                low=mid+1;
            else high=mid;
        }
        return arr[low];
    }
}