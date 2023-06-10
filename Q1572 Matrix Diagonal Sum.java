class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
            if(i != n-1-i){
                sum += mat[i][n-1-i];
            }
        }
        return sum;
    }
}
/*
Explanation
The method diagonalSum takes a 2-dimensional integer array mat as input and returns an integer value as the sum.

It initializes a variable sum to store the sum of the diagonal and anti-diagonal elements.

It determines the size of the square matrix by accessing the length of the mat array and assigns it to the variable n.

The for loop iterates from i = 0 to i < n, incrementing i by 1 in each iteration. This loop is used to traverse the rows of the matrix.

Inside the loop, it adds the element at the ith row and ith column (mat[i][i]) to the sum. This is the diagonal element.

The if condition checks if the current row index (i) is not equal to the difference between the size of the matrix minus 1 (n - 1) and i (i.e., n-1-i). This condition ensures that the anti-diagonal element is not counted twice in the case of an odd-sized matrix (where the diagonal and anti-diagonal intersect at the same element).

If the condition is true, it adds the element at the ith row and (n-1-i)th column (mat[i][n-1-i]) to the sum. This is the anti-diagonal element.

After the loop completes, the method returns the final value of sum, which represents the sum of the diagonal and anti-diagonal elements of the matrix.
*/
