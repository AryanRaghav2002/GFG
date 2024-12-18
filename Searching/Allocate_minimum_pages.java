class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n) return -1;
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int ans=0;
        int low=max, high=sum;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(isFeasible(arr,n,k,mid)){
                ans=mid;
                high=mid-1;
            } else
                low=mid+1;
        }
        return ans;
    }
    public static boolean isFeasible(int[] arr, int n, int k, int mid){
        int required=1;
        int sumPages=0;
        for(int i=0;i<n;i++){
            if(sumPages+arr[i]>mid){
                required++;
                sumPages=arr[i];
            }
            else sumPages+=arr[i];
        }
        return (required<=k);
    }
}