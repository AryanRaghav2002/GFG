
class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int count=0;
        
        for(int i=0;i<n-2;i++){
            int k=i+2;
            for(int j=i+1;j<n-1;j++){
                
                while(k<n && arr[i]+arr[j]>arr[k]){
                    ++k;
                }
            count+=k-j-1;
            }
        }
        return count;
    }
}