class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // int n=arr.length;
        // int maxDiff=0;
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>i;j--){
        //         if(arr[i]<=arr[j]){
        //             if((j-i)>maxDiff)
        //             maxDiff=j-i;
        //         }
        //     }
        // }
        
        // return maxDiff;
        int n=arr.length;
        int l_Min[]=new int[n];
        int r_Max[]=new int[n];
        l_Min[0]=arr[0];
        r_Max[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++){
            l_Min[i]=Math.min(arr[i],l_Min[i-1]);//minimum values from left
        }
        
        for(int i=n-2;i>=0;i--){
            r_Max[i]=Math.max(arr[i],r_Max[i+1]);//maximum values from right
        }
        
        int i=0,j=0;
        int res=0;
        while(i<n && j<n){ 
            if(l_Min[i]<=r_Max[j]){ //start checking from same index and update on a condition.
                res=Math.max(res,j-i);
                j++;
            }
            else
            i++;
        }
        
        return res;
    }
}