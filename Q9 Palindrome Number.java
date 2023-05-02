class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
            int rev = 0;
            int n = x;
            while(n>0){
                int ld = n%10;
                rev = rev*10 + ld;
                n = n/10;
            }
            return (x==rev);
        }
    }
/*Explanation
The isPalindrome method takes an integer x as input and returns true if x is a palindrome, and false otherwise.

The first if statement checks if x is negative. If x is negative, then it cannot be a palindrome (since palindromes are by definition symmetrical), so the method immediately returns false.

If x is non-negative, the method creates two integer variables: rev to store the reversed value of x, and temp to store the original value of x. The original value of x is stored in temp so that we can modify x in the while loop without losing its original value.

The while loop runs as long as temp is positive. In each iteration of the loop, the method gets the last digit of temp using the modulo operator (temp % 10). It then adds this digit to rev by multiplying rev by 10 and adding the last digit (rev = rev * 10 + ld). Finally, the method removes the last digit from temp using integer division (temp = temp / 10).

After the loop is complete, the method compares the original value of x with the reversed value of x (which is stored in rev). If these two values are equal, then x is a palindrome, and the method returns true. Otherwise, x is not a palindrome, and the method returns false.
*/
