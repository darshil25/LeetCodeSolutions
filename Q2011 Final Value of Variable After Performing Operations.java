class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n =0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                n = n + 1;
            }
            else{
                n = n - 1;
            }
        }
        return n;
    }
}
