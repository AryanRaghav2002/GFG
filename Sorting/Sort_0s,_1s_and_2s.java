class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int low=0, i=0, high=n-1;
        while(i<=high){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
                i++; low++;
            }else if(arr[i]==1){
                i++;
            }else if(arr[i]==2){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}