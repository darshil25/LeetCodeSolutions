class Solution {
    public int findMaxLength(int[] nums) {
    int maxLength = 0;
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    
    for (int i = 0; i < nums.length; i++) {
        count += nums[i] == 1 ? 1 : -1;
        if (map.containsKey(count)) {
            maxLength = Math.max(maxLength, i - map.get(count));
        } else {
            map.put(count, i);
        }
    }
    
    return maxLength;
}

}

/* Explanation ->
The idea is to use a map to store the count and the index at which the count was seen. We initialize the map with an entry for 0 and -1 as the index, because we haven't seen any elements yet and a count of 0 means that there are equal number of 0s and 1s.

We then iterate through the array and for each element, we increment the count if the element is 1 and decrement it if the element is 0. We then check if we have seen this count before. If we have, we calculate the length of the subarray with equal 0s and 1s as the difference between the current index and the index stored in the map for this count. If we haven't seen this count before, we add it to the map with the current index.

Finally, we return the maxLength variable which stores the maximum length of a contiguous subarray with equal number of 0s and 1s.
*/
