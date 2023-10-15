class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i=1; i<n-1; i++){
            if(nums[i-1]+1 < nums[i] && nums[i]+1 < nums[i+1]){
                ans.add(nums[i]);
            }
        }

        if(n==1){
            ans.add(nums[0]);
        }
        if(n>1){
            if(nums[0]+1 < nums[1]){
                ans.add(nums[0]);
            }
            if(nums[n-2]+1 < nums[n-1]){
                ans.add(nums[n-1]);
            }
        }
        return ans;
    }
}
