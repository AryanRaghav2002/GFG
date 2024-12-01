class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        Map<Character,Integer> mm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mm.put(ch, mm.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mm.get(ch)==1)
            return ch;
        }
        return '$';
        
    }
}