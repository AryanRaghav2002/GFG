class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        int i=0,j=n-1;
        int count=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            
            if(sum==target){
                
                if(arr[i]==arr[j]){
                    int N=j-i+1;
                    count+=(N*(N-1))/2;
                    break;
                }
                
                int left=1;
                while(i+1<j && arr[i+1]+arr[j]==target){
                    i++;
                    left++;
                }
                
                int right=1;
                while(j-1>i && arr[i]+arr[j-1]==target){
                    j--;
                    right++;
                }
                count+=left*right;
                i++; j--;
            }
            else if(sum>target)
                j--;
            else
                i++;
        }
        return count;
    }
}