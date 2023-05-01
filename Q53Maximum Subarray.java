public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}

/*Explanation
Explanation:

The maxSubArray method takes an integer array nums as input and returns the maximum subarray sum of the input array.

The algorithm used in this solution is Kadane's algorithm, which has a time complexity of O(n) and a space complexity of O(1).

First, two variables maxSum and curSum are initialized to the first element of the input array nums. maxSum will store the maximum subarray sum seen so far, and curSum will store the maximum subarray sum ending at the current position.

Then, a for loop is used to iterate through the input array nums, starting from the second element. For each element, the curSum variable is updated to the maximum of the current element and the sum of the current element and the previous curSum value. This is equivalent to deciding whether to start a new subarray or to continue the previous subarray.

After updating curSum, the maxSum variable is updated to the maximum of the previous maxSum value and the new curSum value. This is equivalent to finding the maximum subarray sum seen so far.

Finally, the maxSum variable is returned as the result.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Explanation: The subarray [4,-1,2,1] has the largest sum 6.

In this example, the maxSubArray method first initializes maxSum and curSum to -2, the first element of the input array nums.

Then, the for loop iterates through the input array nums starting from the second element. At each iteration, curSum is updated to the maximum of the current element and the sum of the current element and the previous curSum value.

Here is how the curSum variable is updated at each iteration:

i=1: curSum = max(1, -2+1) = 1
i=2: curSum = max(-3, 1-3) = -2
i=3: curSum = max(4, -2+4) = 4
i=4: curSum = max(3, 4-1) = 3
i=5: curSum = max(5, 3+2) = 5
i=6: curSum = max(6, 5+1) = 6
i=7: curSum = max(1, 6-5) = 1
i=8: curSum = max(5, 1-5) = 5
At each iteration, maxSum is updated to the maximum of the previous maxSum value and the new curSum value.

Finally, the maxSum variable is returned as the result, which is 6, the maximum subarray sum of the input array.*/
