class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
         HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // Initialize with difference 0 and count 1 (empty sub-array case)
        
        int countX = 0; // Count of x
        int countY = 0; // Count of y
        int result = 0; // Number of valid sub-arrays

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update the count of x and y
            if (arr[i] == x) {
                countX++;
            } else if (arr[i] == y) {
                countY++;
            }

            // Calculate the current difference between countX and countY
            int diff = countX - countY;

            // If this difference has been seen before, there are sub-arrays ending at i
            // where the number of occurrences of x and y are equal
            if (countMap.containsKey(diff)) {
                result += countMap.get(diff);
            }

            // Increment the count of the current difference in the map
            countMap.put(diff, countMap.getOrDefault(diff, 0) + 1);
        }

        return result;
    
    }
}