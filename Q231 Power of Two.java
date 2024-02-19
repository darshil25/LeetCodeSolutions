class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n<1){
            return false;
        }
        int rem;
        while(n>1){
            rem = n%2;
            if(rem == 1){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
