class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int freq[]=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s1.length();i++)
            freq[s1.charAt(i)-'a']++;
        
        for(int i=0;i<s2.length();i++)
            freq[s2.charAt(i)-'a']--;
        
        for(int x:freq)
        if(x!=0) return false;
        
        return true;
    }
}