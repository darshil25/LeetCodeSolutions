
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey, k, 'T'), helper(answerKey, k, 'F'));
    }

    public int helper(String s, int k, char c){
        int sp=0; 
        int ep=0;
        int ans = 0;

        while(ep < s.length()){
            char currc = s.charAt(ep);
            if(currc != c){
                k--;
            }

            while(k < 0){
                if(s.charAt(sp) == c){
                    sp++;
                }
                else{
                    k++;
                    sp++;
                }
            }

            ans = Math.max(ans, ep - sp + 1);
            ep++;
        }
        return ans;
    }
}

/*
Explanation
"answerKey" (String): Represents the answer key string consisting of characters 'T' (true) and 'F' (false).
"k" (int): Represents the maximum number of incorrect answers that can be changed.
The method utilizes the helper method to calculate the maximum number of consecutive answers for both 'T' (true) and 'F' (false). It returns the larger value between the two using the Math.max function.

The helper method takes three parameters:

"s" (String): Represents the answer key string.
"k" (int): Represents the maximum number of incorrect answers that can be changed.
"c" (char): Represents the current character ('T' or 'F') for which the maximum consecutive answers need to be calculated.
Within the helper method, the following steps are performed:

Initialize variables:

"sp" (int): Start pointer for the sliding window.
"ep" (int): End pointer for the sliding window.
"ans" (int): Stores the maximum number of consecutive answers.
Iterate through the answer key string using the end pointer "ep" until it reaches the end of the string.

Retrieve the current character at the end pointer position.

If the current character is not equal to "c", it means an incorrect answer, so decrement the value of "k" by 1.

Enter a nested while loop to handle cases where "k" becomes negative, indicating that the maximum number of incorrect answers has been exceeded:

Check the character at the start pointer position.
If it is equal to "c", increment the start pointer "sp" to exclude the character from the window.
Otherwise, increment "k" to indicate that the previous incorrect answer has been changed to the correct one, and increment the start pointer "sp" to exclude the character from the window.
Calculate the length of the current window (ep - sp + 1) and update the "ans" variable with the maximum length encountered so far using the Math.max function.

Increment the end pointer "ep" to move the sliding window.

Return the final value of "ans" representing the maximum number of consecutive answers.
*/
