class Solution {
    public ArrayList<Integer> valid(int arr[]) {
        // code here.
        int n=arr.length;
        ArrayList <Integer> res=new ArrayList<>(n);
        int count=0;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count++;
            else{
                if(j==-1 || arr[i]!=arr[j]){
                    j=i;
                }
                else{
                  if(arr[j]==arr[i]){
                    arr[i]=arr[i]*2;
                    //swapping
                    arr[j]=arr[i];
                    arr[i]=0;
                    count++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            res.add(arr[i]);
        }
        
        for(int i=n-count;i<n;i++){
            res.add(0);
        }
        return res;
    }
}