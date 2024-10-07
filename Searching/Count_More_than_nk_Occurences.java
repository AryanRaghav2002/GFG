class Solution {
    public static int countOccurence(int[] arr, int n, int k) {
        // Create a HashMap to store the frequency of elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Calculate the threshold (n/k)
        int threshold = n / k;
        
        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        
        // Count the number of elements whose frequency is greater than n/k
        int count = 0;
        for (int value : frequencyMap.values()) {
            if (value > threshold) {
                count++;
            }
        }
        
        return count;
    }
}