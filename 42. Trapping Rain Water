class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftA[] = new int[n];
        leftA[0] = height[0];
        for(int i=1; i<n; i++){
            leftA[i] = Math.max(height[i],leftA[i-1]);
        } 
        int rightA[] = new int[n];
        rightA[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightA[i] = Math.max(height[i],rightA[i+1]);
        }

        int trapped=0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftA[i], rightA[i]);
            trapped += waterlevel - height[i];
        }
        return trapped;
    }
}

/* Explanation
This code is an implementation of the "Trapping Rain Water" problem, which asks to calculate the amount of water that can be trapped between the bars in a histogram, given their heights.

The algorithm first calculates two arrays, leftA and rightA, which represent the maximum height to the left and right of each bar, respectively. This is done by iterating over the array from left to right, and from right to left, and at each position calculating the maximum height so far.

Then, a third loop iterates over each bar, and calculates the water level at that position as the minimum between the maximum height to the left and to the right. The amount of trapped water at that position is then the difference between the water level and the height of the bar. The total amount of trapped water is the sum of all the trapped water at each position.

Finally, the algorithm returns the total amount of trapped water.

The time complexity of this algorithm is O(n), where n is the length of the input array, since each element is visited at most three times. The space complexity is O(n), since two additional arrays are used to store the maximum heights to the left and right of each bar.
*/
