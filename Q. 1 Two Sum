class Solution {
    public int[] twoSum(int[] nums, int target) {
        int total = 0;
        int n[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int k=i+1; k<nums.length; k++){
                total = nums[i]+nums[k];
                if(total==target){
                    n[0] = i;
                    n[1] = k;
                    return n;
                }
            }
        }
        return new int[]{};
    }
}
/*
Explanation
The function twoSum takes two parameters: an integer array nums and an integer target. It returns an integer array of length 2 containing the indices of the two numbers in nums that add up to target.

The code initializes two integer variables: total and n. total is used to keep track of the sum of two numbers, and n is the array that will contain the indices of the two numbers that add up to target.

The code then uses two nested for loops to iterate over all possible pairs of numbers in the nums array. The outer loop iterates over each element in nums, and the inner loop iterates over all subsequent elements in nums. This ensures that each pair of numbers is checked only once.

For each pair of numbers, the code computes their sum and checks whether it is equal to target. If the sum is equal to target, the code sets the values of n[0] and n[1] to the indices of the two numbers and returns n. If no pair of numbers is found that add up to target, the code returns an empty array.

The main idea behind the algorithm is to iterate through each element in the array and check whether a complementary element exists in the array such that their sum equals the target. By iterating through each pair of elements only once, we ensure that the algorithm runs in O(n^2) time complexity, where n is the length of the input array. However, this approach is not the most optimal, and there exists a more efficient O(n) solution using a hashmap.
*/
