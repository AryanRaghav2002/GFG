class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[j]+arr[k]==target-arr[i])
                return true;
                else if(arr[j]+arr[k]>target-arr[i])
                k--;
                else
                j++;
            }
        }
        return false;
    }
}