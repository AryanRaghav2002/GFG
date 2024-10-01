class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        int start=0,end=0;
        int sum=0;
        while(end<n && end>=start){
            sum+=arr[end];
            while(sum>s && start<=end){
                sum-=arr[start];
                start++;
            }
            if(sum==s && end>=start){
                res.add(start+1);
                res.add(end+1);
                return res;
            }
            end++;
        }
        res.add(-1);
        return res;
    }
}