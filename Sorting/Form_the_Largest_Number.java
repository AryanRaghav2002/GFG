class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        // Compare concatenated strings
        String ab = a + b;
        String ba = b + a;
        return ba.compareTo(ab); // Reverse order to sort descending
    }
}

class Solution {
    String findLargest(int[] arr) {
        int n = arr.length;
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = String.valueOf(arr[i]); // Convert int to String
        }

        // Sort using the custom comparator
        Arrays.sort(strArr, new MyComp());

        // Edge case: If the largest number is "0", the result is "0"
        if (strArr[0].equals("0")) {
            return "0";
        }

        // Build the result
        StringBuilder res = new StringBuilder();
        for (String s : strArr) {
            res.append(s);
        }
        return res.toString();
    }
}