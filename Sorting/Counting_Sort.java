class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int n=arr.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){  //traverse arr
            freq[arr.charAt(i)-'a']++;   //freq[arr[i]]++;
        }
        
        StringBuilder sorted=new StringBuilder();
        for(int i=0;i<26;i++){ //traverse freq[]
            while(freq[i]>0){
                sorted.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return sorted.toString();
        
    }
}