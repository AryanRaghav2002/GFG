class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(arr[mid]==key)return mid;
            
            if(arr[mid]>=arr[low]){
                if(arr[low]<=key && key<arr[mid])
                high=mid-1;
                else
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<key && key<=arr[high])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return -1;
    }
}