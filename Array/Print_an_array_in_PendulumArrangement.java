class Solution {
    public int[] pendulumArrangement(int arr[]) {
        // Write your code here
        int n=arr.length;
        Arrays.sort(arr);
        int [] res=new int[n];
        int mid=(n-1)/2;
        res[mid]=arr[0];
        
        int i=1;
        for(int x=mid+1;x<n;x++){
            res[x]=arr[i];
            i+=2;
        }
        
        int j=2;
        for(int x=mid-1;x>=0;x--){
            res[x]=arr[j];
            j+=2;
        }
        return res;
     
    }
}