class Solution {
    // Pair Class
    static class Pair {
        long x;
        long y;
        
       Pair() {
            this.x = -1;
            this.y = -1;
       }
        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int first_Occurence(long arr[],int n,int low, int high, long x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x) high=mid-1;
            else if(arr[mid]<x) low=mid+1;
            else if(arr[mid]==x){
                if(mid!=0 && arr[mid]==arr[mid-1])
                high=mid-1;
                else
                return mid;
            }
        }
            return -1;
    }
    public static int last_Occurence(long arr[],int n,int low, int high, long x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x) high=mid-1;
            else if(arr[mid]<x) low=mid+1;
            else if(arr[mid]==x){
                if(mid!=n-1 && arr[mid]==arr[mid+1])
                low=mid+1;
                else
                return mid;
            }
        }
         return -1;
    }

    // Function to find repeated element and its frequency.
    public static Pair findRepeating(long arr[], int n) {
        // Your code here
        Pair res=new Pair();
        int low=0,high=n-1;
        while(low<=high){ // Main logic
            int mid=(low+high)/2;
            if(arr[mid] < arr[0]+mid)
            high=mid-1;
            else if(arr[mid] >=arr[0]+mid)
            low=mid+1;
        }
        if(low>0){
        long key=arr[low-1];
        
        int first=first_Occurence(arr,n,0,n-1,key);
        int last=last_Occurence(arr,n,0,n-1,key);
         if(first!=last){
            long freq=last - first+1;
            res.x=key;
            res.y=freq;
         }else{
            res.x=-1;
            res.y=-1;
         }
        }
        return res;
    }
};