class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int tcount=0;
        for(int i=0; i<sentences.length; i++){
            String s = sentences[i];
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==' '){
                    tcount++;
                }
            }
            if(tcount>count){
                count = tcount;
            }
            tcount = 0;
        }
        return count+1;
    }
}
