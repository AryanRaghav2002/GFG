class Solution {
    void reverse(int arr[], int n, int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;high--;
        }
    }
    
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int index=-1;
        for(int i=n-1;i>=1;i--){
            if(arr[i-1]<arr[i])
            {index=i-1;
             break;
            }
        }
        
        if(index==-1){
        reverse(arr,n,0,n-1);
        return;
        }
        
       for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                break;
                }
            }
        reverse(arr,n,index+1,n-1);
    }
}