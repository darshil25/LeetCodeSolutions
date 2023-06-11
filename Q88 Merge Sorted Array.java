class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newarr[] = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                newarr[k] = nums1[i];
                i++;
            }
            else{
                newarr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            newarr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            newarr[k] = nums2[j];
            j++;
            k++;
        }

        for(int x=0; x<newarr.length; x++){
            nums1[x] = newarr[x];
        }
    }
}
/*
Explanation
In this solution, we start by initializing three pointers: i, j, and k.

Pointer i is used to iterate through nums1.
Pointer j is used to iterate through nums2.
Pointer k is used to keep track of the current position in the merged array.
We also create a temporary array mergedArray of size m + n to store the merged elements.

We then compare the elements at nums1[i] and nums2[j] in a while loop.

If nums1[i] is less than or equal to nums2[j], we store nums1[i] in mergedArray[k] and increment i.
Otherwise, if nums2[j] is less than nums1[i], we store nums2[j] in mergedArray[k] and increment j.
In both cases, we increment k.
After the above loop, if there are any remaining elements in nums1 or nums2, we copy them to mergedArray using two separate while loops.

If there are remaining elements in nums1, we copy them starting from position k in mergedArray.
If there are remaining elements in nums2, we copy them starting from position k in mergedArray.
Finally, we copy the elements from mergedArray back to nums1 using a for loop.
*/
