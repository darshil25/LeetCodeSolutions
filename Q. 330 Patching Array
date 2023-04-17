class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long sum = 0;
        int i = 0;
        
        while (sum < n) {
            if (i >= nums.length || nums[i] > sum + 1) {
                sum += sum + 1; 
                patches++;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return patches;
    }
}
/*
Explanation ->
We initialize the number of patches as 0 and the sum of the numbers in the array as 0. We also use a pointer i to iterate through the array.

We loop until the sum of the numbers in the array is greater than or equal to n. In each iteration, we check if the current number in the array is less than or equal to the current sum plus 1. If it is, we use that number by adding it to the sum. Otherwise, we add the smallest missing number (sum+1) to the array and increment the number of patches required.

Note that we use a long variable to avoid integer overflow when computing the sum. Also, we need to handle the case where the array is empty or the first number in the array is greater than 1. In such cases, we need to add 1 to the array to ensure that 1 can be formed by the sum of the numbers in the array.
*/
