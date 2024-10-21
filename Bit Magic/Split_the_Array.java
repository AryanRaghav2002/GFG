class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor ^=arr[i];
        }
        if(xor!=0) return 0;
        int mod=1000000007;
        //formula for calc. no.of ways = (2^n - 2)/2 = (2^(n-1) -1)
        int res=(int)((Math.pow(2,n-1))%(mod)-1);
        return res;
    }
}