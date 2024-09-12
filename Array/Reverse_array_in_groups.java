class Solution {

    // Function to reverse every sub-array group of size k.
    void Reverse(ArrayList<Long> arr, int start, int end){
        while(start < end){
            // Unboxing the Long object to long primitive
            long temp = arr.get(start);  
            // Setting the value by boxing the primitive long into Long
            arr.set(start, arr.get(end));  
            arr.set(end, temp);  
            start++;
            end--;
        }
    }
    
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        for(int i = 0; i < n; i += k){
            if(i + k - 1 < n)
                Reverse(arr, i, i + k - 1);
            else 
                Reverse(arr, i, n - 1);
        }
    }
}