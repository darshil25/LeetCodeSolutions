class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length, res = 0;
        for(int i = 0; i < n - res; i++)
            if(citations[i] != res)
                res = Math.max(res, Math.min(citations[i], n-i));
        return res;
    }
}
