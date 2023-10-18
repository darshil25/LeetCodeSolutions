class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        
        int multiplier = 1;
        int index = 0;
        char firstChar = s.charAt(0);

        if (firstChar == '-' || firstChar == '+') {
            if (firstChar == '-') {
                multiplier = -1;
            }
            index++;
        }

        int num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            // Checking for overflow and underflow
            if (multiplier == 1 && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit >= 7))) {
                return Integer.MAX_VALUE;
            }
            if (multiplier == -1 && (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && digit >= 8))) {
                return Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit * multiplier;
            index++;
        }
        System.gc();
        return num;

    }
}
