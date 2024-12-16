class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int c[]=new int [n+m];
        int i=0,j=0,p=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                c[p]=a[i];
                i++;
            } else if(b[j]<=a[i]){
                c[p]=b[j];
                j++;
            }
            p++;
            if(p==k)
            return c[p-1];
        }
        
        while(i<n){
            c[p]=a[i];
            i++;p++;
            if(p==k)
            return c[p-1];
        }
        
        while(j<m){
            c[p]=b[j];
            j++;p++;
            if(p==k)
            return c[p-1];
        }
        return -1;
    }
}