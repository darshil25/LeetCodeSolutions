class Solution {
    public List<Integer> intersection(int[][] nums) {
        // add 1st row to set
        HashSet<Integer> common= new HashSet<>();

        for(int i=0;i<nums[0].length;i++){
            common.add(nums[0][i]);
        }
        //now add other rows and retain only those in common if it present in current set;

        for(int i=1;i<nums.length;i++){
            HashSet<Integer> current= new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                if(common.contains(nums[i][j]))
                        current.add(nums[i][j]);
            }
            common.retainAll(current);
        }

        List<Integer> ls= new ArrayList<>(common);
        Collections.sort(ls);

        return ls;

    }
}
