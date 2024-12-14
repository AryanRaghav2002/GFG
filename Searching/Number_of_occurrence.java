class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int first=firstOccurence(arr, n, target);
        if(first==-1) return 0;
        int last=lastOccurence(arr, n, target);
        return last-first+1;
    }
    int firstOccurence(int[] arr, int n, int target){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target)
            high=mid-1;
            else if(arr[mid]<target)
            low=mid+1;
            else if(arr[mid]==target){
                if(mid!=0 && arr[mid-1]==target)
                high=mid-1;
                else return mid;
            }
        }
        return -1;
    }
    
    int lastOccurence(int[] arr, int n, int target){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target)
            high=mid-1;
            else if(arr[mid]<target)
            low=mid+1;
            else if(arr[mid]==target){
                if(mid!=n-1 && arr[mid+1]==target)
                low=mid+1;
                else return mid;
            }
        }
        return -1;
    }
}