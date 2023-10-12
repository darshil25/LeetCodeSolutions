class Solution {
    public int maxSum(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res=nums[i]+nums[j];
                if(func(nums[i],nums[j]))
                    ans=Math.max(ans,res);
            }
        }
        return ans;
    }
    boolean func(int a, int b){
        int c=Integer.MIN_VALUE;
        int d=Integer.MIN_VALUE;
        
        while(a!=0){
            c=Math.max(c,a%10);
            a/=10;
            
        }
        while(b!=0){
            d=Math.max(d,b%10);
            b/=10;
            
        }
        if(c==d)
            return true;
        return false;
        
    }
}
