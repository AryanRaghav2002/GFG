class Solution {
    // Function to find the majority elements in the array
 public static List<Integer> findMajority(List<Integer> nums) {
    List<Integer> res = new ArrayList<>(2);
    int n = nums.size();

    // Step 1: Finding candidates using modified Boyer-Moore
    int count1 = 0, count2 = 0;
    Integer el1 = null, el2 = null;

    // Normal for loop instead of for-each
    for (int i = 0; i < n; i++) {
        int num = nums.get(i);
        if (el1 != null && num == el1) {
            count1++;
        } else if (el2 != null && num == el2) {
            count2++;
        } else if (count1 == 0) {
            el1 = num;
            count1 = 1;
        } else if (count2 == 0) {
            el2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    // Step 2: Count the occurrences of the candidates
    int cnt1 = 0, cnt2 = 0;
    for (int i = 0; i < n; i++) {
        int num = nums.get(i);
        if (el1 != null && num == el1) cnt1++;
        else if (el2 != null && num == el2) cnt2++;
    }

    // Step 3: Validate the candidates
    if (cnt1 > n / 3) res.add(el1);
    if (cnt2 > n / 3) res.add(el2);

    // Step 4: Return the result, either sorted or -1
    if (res.isEmpty()) {
        res.add(-1);
    } else {
        Collections.sort(res);  // Sort only if needed
    }

    return res;
 }
}