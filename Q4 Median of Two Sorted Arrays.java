class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get the lengths of the two arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Create an array to hold the merged elements.
        int[] merge = new int[n + m];

        // Initialize the pointers to the start of each array.
        int i = 0;
        int j = 0;

        // Iterate over both arrays, adding the smaller element to the merge array.
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merge[k++] = nums1[i++];
            } else {
                merge[k++] = nums2[j++];
            }
        }

        // Copy any remaining elements from nums1 to the merge array.
        while (i < n) {
            merge[k++] = nums1[i++];
        }

        // Copy any remaining elements from nums2 to the merge array.
        while (j < m) {
            merge[k++] = nums2[j++];
        }

        // If the number of elements in the merge array is odd, the median is the middle element.
        if (k % 2 == 1) {
            return merge[k / 2];
        }

        // If the number of elements in the merge array is even, the median is the average of the two middle elements.
        else {
            return (merge[k / 2 - 1] + merge[k / 2]) / 2.0;
        }
    }
}
/*

*/
