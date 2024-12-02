
class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
          ArrayList<Integer> result = new ArrayList<>();
        int patLength = pat.length();
        int txtLength = txt.length();

        // Loop through the text string
        for (int i = 0; i <= txtLength - patLength; i++) {
            // Extract the substring of the same length as the pattern
            String substring = txt.substring(i, i + patLength);

            // Compare the substring with the pattern
            if (substring.equals(pat)) {
                result.add(i); // Add the starting index of the match
            }
        }

        return result;
    }
}