class Solution {
    public double average(int[] salary) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i=0; i<salary.length; i++){
            if(max<salary[i]){
                max = salary[i];
            }
            if(min>salary[i]){
                min = salary[i];
            }
            sum = sum + salary[i];
        }
        return((sum-min-max)/(salary.length-2));
    }
}
/* Explanation
The given code is a Java solution to find the average of an array of integers called salary.

The method signature is public double average(int[] salary) which takes an array of integers salary as an argument and returns a double value as the average of the elements in the array.

The code first initializes max and min variables with the minimum and maximum possible double values respectively.

Then, it iterates through the elements of the salary array using a for loop and checks if the current element is greater than the current max value. If it is, then it sets the max value to the current element. Similarly, if the current element is less than the current min value, it sets the min value to the current element.

At the same time, the code calculates the sum of all the elements in the salary array by adding each element to the sum variable.

Finally, the code calculates the average by subtracting the max and min values from the sum and dividing it by the length of the salary array.
*/
