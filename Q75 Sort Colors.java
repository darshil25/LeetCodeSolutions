class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
/* Explanation ->
This is a Java class named Solution that contains a method sortColors which takes an integer array nums as input and sorts it in ascending order using the bubble sort algorithm.

The bubble sort algorithm works by repeatedly iterating through the array, comparing adjacent elements and swapping them if they are in the wrong order. The inner loop for(int j=0; j<n-1-i; j++) iterates through the unsorted portion of the array from index 0 up to n-1-i, where i is the number of sorted elements at the end of the array. This means that in each iteration of the outer loop, the largest element in the unsorted portion will "bubble" up to the end of the array, hence the name "bubble sort".

The if statement if(nums[j]>nums[j+1]) checks if the current element at index j is greater than the next element at index j+1, and if so, it swaps them using a temporary variable temp. This effectively moves the larger element towards the end of the array.

At the end of the method, the input array nums will be sorted in ascending order.

Note that bubble sort is not the most efficient sorting algorithm, and has a worst-case time complexity of O(n^2). There are other more efficient sorting algorithms such as quicksort and mergesort that have a time complexity of O(n log n).
*/
