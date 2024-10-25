
class Solution {
    public static int[] binSort(int n, int[] arr) {
        // code here
        if(n==1) return arr;
        int i=-1,j=n;
        while(true){
            do{i++;}while(arr[i]==0 && i<n-1);
            do{j--;}while(arr[j]==1 && j>0);
            if(i>=j) break;
            //swapping
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}