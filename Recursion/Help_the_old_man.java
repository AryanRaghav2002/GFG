class Solution{
    public static void TOI(int from, int aux, int to, int N, List<Integer> res){
        if(N==1){
            res.add(from);
            res.add(to);
            return ;
        }
        TOI(from,to,aux,N-1,res);
        res.add(from);
        res.add(to);
        TOI(aux,from,to,N-1,res);
    }
    
    
    static List<Integer> shiftPile(int N, int n){
        // code here
        List<Integer> res=new ArrayList<> ();
        List<Integer> result=new ArrayList <>();
        TOI(1,2,3,N,res);
        
        if((n*2)-2 < res.size()){
           int a=res.get((n*2)-2);
            int b=res.get((n*2)-1);
         result.add(a);
         result.add(b); 
        }
        else
        result.add(-1);
        
        return result;
        
    }
}