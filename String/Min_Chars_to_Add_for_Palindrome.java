class Solution {
    public static int minChar(String s) {
        // Reverse the string
        String reversedS = new StringBuilder(s).reverse().toString();
        
        // Concatenate original and reversed string with a delimiter
        String combined = s + "#" + reversedS;
        
        // Compute the LPS array
        int[] lps = computeLPS(combined);
        
        // Length of the longest palindromic suffix
        int longestPalindromicSuffix = lps[combined.length() - 1];
        
        // Minimum characters to add
        return s.length() - longestPalindromicSuffix;
    }
    
    private static int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;
        
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}