class Solution {
    public String longestPalindrome(String str) {
        
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                dp[i][j]=1;
            }
        }
         int[] ans = new int[]{0, 0};
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                dp[i][i+1]=1;
                ans[0]=i;
                ans[1]=i+1;
            }
        }
        for(int j=2;j<n;j++){
            for(int i=0;i<n-j;i++){
                int k=i+j;
                if(str.charAt(i)==str.charAt(k)&&dp[i+1][k-1]>0){
                    dp[i][k]=1;
                    ans[0]=i;
                    ans[1]=k;
                }
            }
        }
         return str.substring(ans[0],ans[1]+1);
       
    }
}
