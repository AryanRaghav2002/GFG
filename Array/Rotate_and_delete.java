class Solution {
    public static void reverse(ArrayList<Integer> arr, int start, int end){
        while(start<=end){
            int temp=arr.get(end);
            arr.set(end, arr.get(start));
            arr.set(start, temp);
            start++;
            end--;
        }
    }
    public static void rotate(ArrayList<Integer> arr){
        reverse(arr, 0, arr.size()-2);
        reverse(arr, 0, arr.size()-1);
    }
    
    
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        int k=1;
        while(n>k){
            rotate(arr);
            arr.remove(n-k);
            k++;
            n--;
        }
        return arr.get(0);
    }
}
