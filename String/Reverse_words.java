class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        int n=str.length();
        String res=new String("");
        int lastDot=n;
        String s="";
        for(int i=n-1;i>=0;i--){
            
            if(str.charAt(i)!='.' )
                 s=str.substring(i,lastDot);
            
             if(str.charAt(i)=='.' || i==0){
                if(i==0){
                    res=res+s;
                }else if(str.charAt(i)=='.'){
                    res=res+s+'.';
                    lastDot=i;
                    s="";
                }
            }
    }
    return res;
}
}