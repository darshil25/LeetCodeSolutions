class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        s = arr[arr.length-1];
        return s.length();
    }
}
