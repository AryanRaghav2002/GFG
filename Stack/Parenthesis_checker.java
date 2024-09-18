class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack <Character> st=new Stack<>();
        Map<Character,Character> m= new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        
        for(int i=0;i<x.length();i++){
            char ch= x.charAt(i);
            if (ch=='(' || ch=='[' || ch=='{')
            st.push(ch);
            else if(st.empty())
            return false;
            else{
                if(st.peek()!=m.get(ch))
                return false;
                
                st.pop();
            }
        }
        
        return st.empty();
    }
}