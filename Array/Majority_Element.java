class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int n=arr.length;
        int count=1;
        int res=0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[res])
            count++;
            else
            count--;
            
            if(count==0){
                res=i;
                count=1;
            }
        }
        
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[res])
            cnt++;
        }
        if(cnt<=n/2)
        return -1;
        else
        return arr[res];
    }
}