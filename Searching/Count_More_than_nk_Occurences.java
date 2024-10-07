
class Pair{
    int e;
    int c;
    Pair(int e, int c){
        this.e=e;
        this.c=c;
    }
}
class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        // Step 1: Initialize pairs for potential candidates
        Pair[] temp = new Pair[k - 1];
        for (int i = 0; i < k - 1; i++) {
            temp[i] = new Pair(Integer.MIN_VALUE, 0);
        }

        // Step 2: Process the array to find potential candidates
        for (int i = 0; i < n; i++) {
            int j;
            // Check if arr[i] is already a candidate
            for (j = 0; j < k - 1; j++) {
                if (temp[j].e == arr[i]) {
                    temp[j].c++;
                    break;
                }
            }
            
            // If arr[i] is not a candidate and there's space for a new candidate
            if (j == k - 1) {
                int l;
                for (l = 0; l < k - 1; l++) {
                    if (temp[l].c == 0) {
                        temp[l].e = arr[i];
                        temp[l].c = 1;
                        break;
                    }
                }

                // If no space for a new candidate, decrement counts
                if (l == k - 1) {
                    for (l = 0; l < k - 1; l++) {
                        temp[l].c--;
                    }
                }
            }
        }

        // Step 3: Verify actual occurrences of candidates
        Map<Integer, Integer> actualCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (actualCounts.containsKey(arr[i])) {
                actualCounts.put(arr[i], actualCounts.get(arr[i]) + 1);
            } else {
                actualCounts.put(arr[i], 1);
            }
        }

        // Step 4: Count how many elements appear more than n/k times
        int count = 0;
        for (int i = 0; i < k - 1; i++) {
            if (temp[i].e != Integer.MIN_VALUE && actualCounts.get(temp[i].e) > n / k) {
                count++;
            }
        }

        return count;
    }
}