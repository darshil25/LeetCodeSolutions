class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []plus=new int[nums.length/2];
        int []minus=new int[nums.length/2];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                plus[a++]=nums[i];
            }
            if(nums[i]<0){
                minus[b++]=nums[i];
            }
        }
        a=0;
        for(int j=0;j<nums.length;j+=2){
            nums[j]=plus[a];
            nums[j+1]=minus[a];
            a++;
        }
        return nums;
    }
}
