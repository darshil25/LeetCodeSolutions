public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {   // Square each element in 'nums'.
            nums[i] *= nums[i];
        }
        int i = n - 1;  //initial position of i 
        int l = 0, r = n - 1;
 // Use two pointers to merge sorted squares in non-decreasing order.
        while (l <= r) {
            if (nums[l] > nums[r]) {
                ans[i--] = nums[l++];
            } else {
                ans[i--] = nums[r--];
            }
        }
        return ans;
    }
}
