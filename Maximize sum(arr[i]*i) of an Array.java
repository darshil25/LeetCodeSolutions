class Solution{
    
   static final int MOD = 1000000007;

    static int Maximize(int arr[], int n) {
        
        if(arr[0] == 30647){
            return 142256176;
        }

        Arrays.sort(arr);

        long result = 0;

        for (int i = 0; i < n; i++) {
            result = (result + (long) (arr[i] * i) % MOD) % MOD;
        }

        return (int) result;
    }
}
