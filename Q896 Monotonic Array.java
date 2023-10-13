class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean increase = true;
        boolean decrease = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                increase = false;
            }
            if(arr[i] < arr[i+1]){
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
