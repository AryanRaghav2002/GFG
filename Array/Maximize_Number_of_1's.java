class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        // code here
        int n=arr.length;
        int start=0,end=0;
        int count=0;
        int res=0;
        while(end<n){
            if(arr[end]==0) count++;
            
            while(count>k){
                if(arr[start]==0) count--;
                start++;
            }
            
            res=Math.max(res,(end-start+1));
            end++;
        }
        return res;
    }
}