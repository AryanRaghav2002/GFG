class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        int res=n;
        while(n>0){
            n=n>>1;
            res=res^n;
        }
        return res;
        
    }
       
}