class Solution {
    long mod=1000000007;
    public long numConvert(Node node){
        long num=0;
        while(node!=null){
            num=(num*10 + node.data)%mod;
            node=node.next;
        }
        return num;
        
    }
    
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1=numConvert(first);
        long num2=numConvert(second);
        
        return (num1 * num2)%mod;

    }
}