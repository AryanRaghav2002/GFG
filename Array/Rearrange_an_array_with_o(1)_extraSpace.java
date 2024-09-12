class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        //int modified value=n * new value + old value.
        for(int i=0;i<n;i++){
            //modifying
            long newValue = arr[(int)arr[i]] % n;//%n for everytime giving the Correct old value 
            arr[i] = newValue * n + arr[i];
            
        }
        
        for(int i=0;i<n;i++){
            //fetching
            arr[i]=arr[i]/n;
        }
    }
}