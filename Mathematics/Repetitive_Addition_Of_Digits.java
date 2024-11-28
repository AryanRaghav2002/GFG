class Solution {
    public int sumOfNum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int singleDigit(int n) {
        // code here

        while(n>9){
        int sum=sumOfNum(n);
        if(sum>9)
        n=sum;
        else if(sum<10) return sum;
    }
    return n;
    }
}