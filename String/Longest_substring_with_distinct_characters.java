class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        if(s==null || s.isEmpty())
        return 0;
        
        int n=s.length();
        int maxLength=0;
        int start=0;
        HashSet<Character> seen=new HashSet<>();
        
        for(int end=0;end<n;end++){
            char currentChar=s.charAt(end);
            while(seen.contains(currentChar)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(currentChar);
            maxLength=Math.max(maxLength, end-start+1);
        }
        
        return maxLength;
    }
}