class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            if(arr.get(i)>=0)
            positive.add(arr.get(i));
            else
            negative.add(arr.get(i));
        }
        
        int P=0,N=0;
        int i=0;
        while(P<positive.size() && N<negative.size()){ //filling both negative and positive till one finish
            if(i%2==0){
                arr.set(i,positive.get(P));
                i++;
                P++;
            }else{
                arr.set(i,negative.get(N));
                i++;
                N++;
            }
        }
        
        while(P<positive.size()){ //remaing positive elements
          arr.set(i,positive.get(P));
                i++;
                P++;  
        }
            
        while(N<negative.size()){ //remaing negative elements
            arr.set(i,negative.get(N));
                i++;
                N++;
        }
        
        return ;
    }
}