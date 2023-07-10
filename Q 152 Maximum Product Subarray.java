class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int c_pro = 1;
        
        for(int i=0; i<n; i++){
            c_pro = c_pro * nums[i];
            ans  = Math.max(ans, c_pro);

            if(c_pro == 0){
                c_pro = 1;
            }
        }

        c_pro = 1;
        for(int j=n-1; j>=0; j--){
            c_pro = c_pro * nums[j];
            ans  = Math.max(ans, c_pro);
            if(c_pro == 0){
                c_pro = 1;
            }
        }
        return ans;
    }
}
/*Explanation
Initialize variables: n to store the length of the input array, ans to store the maximum product, and c_pro to store the current product.
Iterate over the input array from left to right:
Multiply the current element (nums[i]) with the current product (c_pro).
Update ans with the maximum value between ans and c_pro.
If the current product becomes 0, reset c_pro to 1.
Reset c_pro to 1.
Iterate over the input array from right to left:
Multiply the current element (nums[j]) with the current product (c_pro).
Update ans with the maximum value between ans and c_pro.
If the current product becomes 0, reset c_pro to 1.
Return the maximum product (ans).*/
