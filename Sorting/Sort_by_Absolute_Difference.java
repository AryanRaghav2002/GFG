class absDiffComp implements Comparator<Integer>{
    public int k;
 //to pass the value of k   
    public absDiffComp(int k){
        this.k=k;
    }
 //to make your own custom sorting logic.   
    public int compare(Integer a ,Integer b){
       int diff1=Math.abs(a-k);
       int diff2=Math.abs(b-k);
       return diff1-diff2;
    }
}

class Solution {
    // Function to sort the array according to difference with given number.
    
    static void sortABS(int k, List<Integer> arr) {
        // add your code here
        int n=arr.size();
        Comparator<Integer> comp=new absDiffComp(k); 
        Collections.sort(arr,comp);
    }
}