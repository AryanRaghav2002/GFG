class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap <Integer, Integer> frst_ocrncMap=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(!frst_ocrncMap.containsKey(arr[i]))
                frst_ocrncMap.put(arr[i], i);
            else{
                int firstValue=frst_ocrncMap.get(arr[i]);
                 max=Math.max(i-firstValue, max);
            }
        }
        return max;
    }
}