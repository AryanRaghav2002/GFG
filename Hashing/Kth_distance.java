class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        Map<Integer,Integer>mm =new HashMap<>(k);
        int n=arr.length;
        int i=0;
        while(i<n){
           if(mm.containsKey(arr[i]))
           return true;
        
           mm.put(arr[i],1);
           
           if(i>=k)
           mm.remove(arr[i-k]);
           i++;
        }
        return false;
    }
}