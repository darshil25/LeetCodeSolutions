class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalTime = 0;
        
        int passedTime = customers[0][0];
        
        for(int i = 0; i < customers.length;i++){
            passedTime = Math.max(passedTime , customers[i][0]);
            passedTime += customers[i][1];
            totalTime += passedTime - customers[i][0];
        }
        
        return totalTime / customers.length;
    }
}
