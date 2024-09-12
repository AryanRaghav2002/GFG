class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int countIncreasing=0;
        int countDecreasing=0;
        
        for(int i=1;i<num;i++){
            if(arr[i]<arr[i-1])
                countDecreasing++; //for increasing order
            else
                countIncreasing++; //for decreasing order
        }
        
        if(countIncreasing==1 || countDecreasing==1){
            if(countDecreasing==1 && (arr[num-1]<arr[0]))//for inc order
            return true;
            else if(countIncreasing==1 && (arr[num-1]>arr[0]))//for dec order
            return true;
        }
        
        return false;
    }
    
}
