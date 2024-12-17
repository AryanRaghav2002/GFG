class Solution {
    public static boolean isPossible(int[] stalls, int n, int minDiff, int k){
        int placedCows=1, placedAt=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-placedAt>=minDiff){
                placedCows++;
                placedAt=stalls[i];
            }
            if(placedCows==k)
            return true;
        }
        return false;
    }
    
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        int low=0,high=stalls[n-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(isPossible(stalls,n,mid,k)){
                //means minimum difference would be mid or more.
                ans=Math.max(ans,mid);
                low=mid+1;
            } else
                high=mid-1;
        }
        return ans;
    }
}