class Solution {
    public static void convertToWave(int n, int[] arr) {
        // code here
        
        for(int i=0;i<n;i=i+2){
            //Swapping 
            if(i+1<n){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            }
        }
        return ;
    }
}
