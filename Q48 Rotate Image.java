class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int newarr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                newarr[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = newarr[i][j];
            }
            // System.arraycopy(newarr[i], 0, matrix[i], 0, n);
        }
    }
}

/*
Explanation
The first line inside the rotate method calculates the length of the matrix array, which represents the number of rows or columns in the square matrix. It assigns this value to the variable n.

A new two-dimensional integer array called newarr is created with the same size as the input matrix using new int[n][n]. This array will store the rotated matrix.

The code then enters a nested loop with i representing the row index and j representing the column index. The loop iterates over each element in the matrix.

Inside the nested loop, the current element at position matrix[i][j] is assigned to newarr at a rotated position newarr[j][n-1-i]. This rotation moves each element from its original position to its corresponding rotated position in the newarr array.

After the nested loop completes, the newarr array contains the rotated matrix.

The next set of nested loops assigns the values from the newarr array back to the matrix array. This step is necessary because the goal is to modify the original matrix with the rotated values. The loops iterate over each element in the matrix and assign the corresponding value from newarr to it.

Once the second nested loop completes, the matrix array contains the rotated matrix, and the method execution is finished.*/
