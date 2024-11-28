class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int N=left.length;
        int M=right.length;
        //finding max.elmnt and answer in left[]
        int leftAns=0;
        if(N>0){
            int max=left[0];
            for(int i=1;i<N;i++){
                if(left[i]>max)
                    max=left[i];
            }
            leftAns=max;
        }
        
        //finding min.elmnt and ans in right[]
        int rightAns=0;
        if(M>0){
            int min=right[0];
            for(int i=1;i<M;i++){
                if(right[i]<min)
                    min=right[i];
            }
            rightAns=n-min;
        }
        
        //returning the max out of both which is the time taken by last ant.
        return Math.max(leftAns,rightAns);
    }
}