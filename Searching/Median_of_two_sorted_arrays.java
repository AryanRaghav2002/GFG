class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here
        if(n>m){
            return findMedian(brr,m,arr,n);
        }
        
        int begin1=0,end1=n;
        while(begin1<=end1){
            int i1=(begin1 +end1)/2;
            int i2=(n+m+1)/2 -i1;
            
            int min1=(i1==n)? Integer.MAX_VALUE : arr[i1];
            int max1=(i1==0)? Integer.MIN_VALUE : arr[i1-1];
            int min2=(i2==m)? Integer.MAX_VALUE : brr[i2];
            int max2=(i2==0)? Integer.MIN_VALUE : brr[i2-1];
            
            if(max1<=min2 && min1>=max2){
                if((n+m)%2==0)
                return (Math.max(max1, max2) + Math.min(min1, min2))/2;
                else
                return (Math.max(max1, max2));
            }
            else if(max1>min2)
                 end1=i1-1;
            else
                 begin1=i1+1;
        }
        return -1;
    }
}