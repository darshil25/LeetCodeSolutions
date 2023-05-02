class Solution {
    public int arraySign(int[] nums) {
        int min = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i]<0){
                min++;
            }
        }
        if(min % 2 != 0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
/*Explanation
The method takes an integer array nums as an input parameter and returns an integer value.

The method's purpose is to determine the sign of the product of all the elements in the input array.

Here's how the method works:

It initializes a variable named min to 0.
It iterates over each element in the nums array using a for loop, starting from index 0 and going up to nums.length - 1.
Inside the loop, it checks whether the current element nums[i] is equal to 0. If it is, the method immediately returns 0 (since 0 is neither positive nor negative).
If the current element nums[i] is negative, the min variable is incremented by 1.
After the loop is finished, the method checks whether the value of min is even or odd.
If min is odd, it means that there are an odd number of negative elements in the array, so the method returns -1 (since the product of an odd number of negative numbers is negative).
If min is even, it means that there are an even number of negative elements in the array, so the method returns 1 (since the product of an even number of negative numbers is positive).
*/
