class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j; 
    }
}
/*
Explanation
The Solution class provides a method removeElement that takes an array of integers nums and an integer val as input and returns the length of the modified array after removing all occurrences of val.

The method begins by initializing a variable j to 0, which will be used to keep track of the index in the modified array.

A for loop is then used to iterate over each element in the nums array. Inside the loop, an if statement checks if the current element is equal to val. If it is, the continue keyword is used to skip the rest of the loop and move to the next iteration, effectively skipping the current element.

If the current element is not equal to val, the value is assigned to the nums[j] element in the modified array, and the index j is incremented by 1 to move to the next position in the modified array.

After the loop completes, the method returns the value of j, which represents the length of the modified array without the removed elements.
*/
