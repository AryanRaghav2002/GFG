
class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        int low=0,high=n-1;
//Using Binary search with a check since it is closely sorted and not normal sorted.
        while(low<=high){ 
            int mid=(low+high)/2;
            long element=arr[mid];
            
            if(element==x) 
            return (long)mid;
            
            else if(element>x){
                if(mid+1<n && ((long)arr[mid+1]==x))
                return (long)mid+1;
                else
                high=mid-1;
            }
            else if(element<x){
                if(mid-1>=0 && ((long)arr[mid-1]==x))
                return (long)mid-1;
                else
                low=mid+1;
            }
        }
        return -1;
    }
}