class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        int j=k-1;
        while(j<n){
            int i=j-k+1;
            int count=0;
            Map<Integer,Integer> mm=new HashMap<>();
            
            while(i<=j){
                if(!mm.containsKey(arr[i])){
                    mm.put(arr[i],mm.getOrDefault(arr[i],0)+1);
                    count++;
                }
                i++;
            }
            
            res.add(count);
            j++;
        }
        return res;
    }
}
