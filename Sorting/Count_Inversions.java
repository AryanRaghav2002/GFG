class Solution {
    // Function to count inversions in the array.
    
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n=arr.length;
        return mergeAndCount(arr,0,n-1);
        
    }
    static int mergeAndCount(int arr[], int lo, int hi){
        int count=0;
        if(lo<hi){
            int mid=lo+(hi-lo)/2;
            count+=mergeAndCount(arr,lo,mid);
            count+=mergeAndCount(arr,mid+1,hi);
            count+=merge(arr,lo,mid,hi);
        }
        return count;
    }
    
    static int merge(int arr[], int lo, int m, int hi){
        int n1=m-lo+1;
        int n2=hi-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[lo+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int res=0;
        int i=0,j=0,k=lo;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++; 
            }else if(right[j]<=left[i]){
                arr[k]=right[j];
                res+=n1-i;
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++; k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++; k++;
        }
        return res;
    }
}