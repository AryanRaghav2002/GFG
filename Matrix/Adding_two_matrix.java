class Solution
{
    //Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][])
    {
       // code here
       int res[][]={{-1}};
       if(A.length!=B.length)
        return res; 
       
       for(int i=0;i<A.length;i++){
            if(A[i].length!=B[i].length)
            return res;
       }
       int n1=A.length;
       int m1=A[0].length;
       int ans[][]=new int[n1][m1];
       for(int i=0;i<n1;i++){
           for(int j=0;j<m1;j++){
               ans[i][j]=A[i][j]+B[i][j];
           }
       }
       return ans;
    }
}