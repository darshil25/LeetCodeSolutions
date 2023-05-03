class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
/* Explanation
Declare variables: start and end are initialized to the first and last indices of the array, respectively.

Perform binary search using a while loop. While start is less than or equal to end, calculate the middle index mid of the array using integer division.

If the target value is equal to nums[mid], return mid as the index of the target value in the array.

If the target value is less than nums[mid], it must be located in the left half of the array. So, update end to be one less than mid to restrict the search range to the left half of the array.

If the target value is greater than nums[mid], it must be located in the right half of the array. So, update start to be one greater than mid to restrict the search range to the right half of the array.

If the target value is not found in the array, return start as the index where the target would be inserted in order.





*/
