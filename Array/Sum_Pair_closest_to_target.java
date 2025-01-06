class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> res=new ArrayList<>();
        int closest=12314245;
        int i=0,j=n-1;
        int absDiff=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            int currentClosest=Math.abs(target-sum);
            if(currentClosest<closest){
                closest=currentClosest;
                absDiff=Math.abs(arr[i]-arr[j]);
                res.clear();
                res.add(arr[i]);
                res.add(arr[j]);
            }else if(currentClosest==closest){
                int currentAbsDiff=Math.abs(arr[i]-arr[j]);
                if(currentAbsDiff>absDiff){
                    res.clear();
                    res.add(arr[i]);
                    res.add(arr[j]);
                }
            }
            
            if(sum>target)
                j--;
            else
                i++;
        }
        return res;
    }
}