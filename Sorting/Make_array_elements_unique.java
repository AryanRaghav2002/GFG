class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        int n=arr.length;
        Arrays.sort(arr);
        int maxChange=0;
        for(int i=1;i<n;i++){
           if(arr[i]<=arr[i-1]){
               maxChange+=arr[i-1]-arr[i]+1;
               arr[i]=arr[i-1]+1;
           }
        }
        return maxChange;
    }
}