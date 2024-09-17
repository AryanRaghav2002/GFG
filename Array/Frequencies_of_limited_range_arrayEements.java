class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        for(int i=0;i<N;i++){
            if( arr[i]%(P+1)>0 && arr[i]%(P+1)<=N)
                arr[arr[i]%(P+1)-1]=arr[arr[i]%(P+1)-1]+P+1;
            
        }
        
        for(int i=0;i<N;i++){
            arr[i]=arr[i]/(P+1);
        }
        
        return ;
    }
}
