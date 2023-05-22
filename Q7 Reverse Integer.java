class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int ld = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && ld > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && ld < -8))
                return 0;
            
            rev = rev * 10 + ld;
            x /= 10;
        }
        
        return rev;
    }
}
/*
Explanation
The variable rev is initialized to 0. This variable will store the reversed integer.
A while loop is used to extract the digits of x one by one until x becomes 0.
Inside the loop, ld (short for "last digit") is calculated as x % 10. It represents the rightmost digit of x.
The code checks if reversing x will cause an integer overflow. It compares the current value of rev with the limits of the 32-bit signed integer range. If an overflow is detected, the method immediately returns 0.
The condition rev > Integer.MAX_VALUE / 10 checks if adding the next digit will cause rev to exceed the maximum value divided by 10.
The condition (rev == Integer.MAX_VALUE / 10 && ld > 7) checks if adding the next digit will cause rev to be equal to the maximum value divided by 10 and the next digit (ld) is greater than 7. This additional check handles the case where the reversed integer would be equal to Integer.MAX_VALUE.
Similarly, there is a check for the minimum value and the digit being less than -8.
If no overflow is detected, the code updates rev by multiplying it by 10 and adding ld. This operation effectively shifts the current digits of rev to the left and adds the new digit (ld) to the rightmost position.
Finally, x is divided by 10 to remove the rightmost digit since it has already been processed.
Once the while loop completes and x becomes 0, the reversed integer rev is returned.
*/
