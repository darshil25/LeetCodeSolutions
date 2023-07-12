class Solution {
  public void nextPermutation(int[] nums) {
    final int n = nums.length;

    int i;
    for (i = n - 2; i >= 0; --i)
      if (nums[i] < nums[i + 1])
        break;

    if (i >= 0)
      for (int j = n - 1; j > i; --j)
        if (nums[j] > nums[i]) {
          swap(nums, i, j);
          break;
        }

    reverse(nums, i + 1, n - 1);
  }

  private void reverse(int[] nums, int l, int r) {
    while (l < r)
      swap(nums, l++, r--);
  }

  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}

/*
Explanation
The nextPermutation method takes an array of integers as input and does not return any value.

The variable n is initialized with the length of the input array nums.

The algorithm starts by finding the first pair of adjacent elements in nums from right to left, where the left element is smaller than the right element. This is done using the for loop with the variable i. This step identifies the point where a rearrangement can be made to obtain the next permutation.

If such a pair is found (i.e., i is greater than or equal to 0), the algorithm proceeds to find the smallest element in the suffix of nums (from i+1 to the end) that is greater than the element at index i. This is done using another for loop with the variable j.

Once the smallest element greater than nums[i] is found, the swap method is called to swap these two elements.

After the swap, the elements from index i+1 to the end of the array are in descending order. To obtain the next permutation, these elements need to be reversed to be in ascending order. The reverse method is called to achieve this.

The reverse method takes the nums array, the starting index l, and the ending index r as parameters. It uses a while loop to swap the elements at the indices l and r, incrementing l and decrementing r until they meet in the middle.

The swap method is a helper method that takes the nums array, the indices i and j, and swaps the elements at those indices using a temporary variable.*/
