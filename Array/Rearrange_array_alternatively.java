class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int i=0,j=n-1;
        long max=arr[n-1]+1;// for using it to access element rather than n
        long new_val;
        for(int x=0;x<n;x++){
            if(x%2==0){
                new_val=arr[j]%max;
                arr[x]=new_val * max + arr[x];
                j--;
            }else{
                new_val=arr[i]%max;
                arr[x]=new_val * max + arr[x];
                i++;
            }
        }
        
        for(int x=0;x<n;x++){
            arr[x]=arr[x]/max;
        }
    }
    
}