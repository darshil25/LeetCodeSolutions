class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
/*
Explanation
Initialize row to 0 and col to the index of the last column of the matrix (matrix[0].length - 1).
Enter a while loop that continues as long as row is less than the number of rows in the matrix and col is greater than or equal to 0.
Inside the loop, check if the current element matrix[row][col] is equal to the target value.
If they are equal, return true since the target has been found in the matrix.
If the current element is greater than the target:
Decrease col by 1 to move to the previous column (since the elements in each column are sorted in ascending order).
This step effectively eliminates the current column from consideration as the target can't be present in it.
If the current element is less than the target:
Increase row by 1 to move to the next row (since the elements in each row are sorted in ascending order).
This step effectively eliminates the current row from consideration as the target can't be present in it.
Repeat steps 3 to 5 until the target is found or all elements in the matrix have been examined.
If the loop completes without finding the target, return false to indicate that the target does not exist in the matrix.
*/
