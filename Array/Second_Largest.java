class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n=arr.length;
        int largest=0,sec_largest=-1;
        int i=1;
        while(i<n){
            if(arr[i]>arr[largest]){
                sec_largest=largest;
                largest=i;
            }else if(arr[i]<arr[largest]){
                if(sec_largest==-1 || arr[i]>arr[sec_largest] ){
                    sec_largest=i;
                }
            }
            i++;
        }
        if(sec_largest==-1) return -1;
        return arr[sec_largest];
        
    }
}