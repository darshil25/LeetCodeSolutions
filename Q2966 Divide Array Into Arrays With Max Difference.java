

class Solution {
    public List<List<Integer>> divideArray(int[] nums, int k) {
        int size = nums.length;
        if (size % 3 != 0)
            return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int groupIndex = 0;
        for (int i = 0; i < size; i += 3) {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                result.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
                groupIndex++;
            } else {
                return new ArrayList<>();
            }
        }
        return result;
    }
}

