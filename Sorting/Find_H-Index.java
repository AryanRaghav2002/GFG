class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
         int n = citations.length;
    int[] count = new int[n + 1]; // Bucket array
    
    // Count the citations
    for (int c : citations) {
        if (c >= n) {
            count[n]++;
        } else {
            count[c]++;
        }
    }
    
    // Calculate H-Index
    int hIndex = 0;
    for (int i = n; i >= 0; i--) {
        hIndex += count[i]; // Accumulate the number of papers with at least i citations
        if (hIndex >= i) {
            return i;
        }
    }
    
    return 0; 
        
    }
}