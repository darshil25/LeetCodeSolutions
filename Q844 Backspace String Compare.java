class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb = new StringBuilder("");

        for(char chs : s.toCharArray()){

            if(chs =='#'){

                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else{
                sb.append(chs);
            }
        }

        StringBuilder sb2 = new StringBuilder("");

        for(char cht : t.toCharArray()){

            if(cht =='#'){

                if(sb2.length() > 0){
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            }
            else{
                sb2.append(cht);
            }
        }
        return sb.toString().equals(sb2.toString());

    }
}

/*
Explanation
The given code implements the backspaceCompare method, which takes two strings s and t as input. The method compares the strings after applying backspace functionality, where a backspace character ('#') removes the preceding character from the string.

Here's a step-by-step description of the code:

Initialize two empty StringBuilder objects, sb and sb2, to store the processed strings.

Iterate over each character, chs, in the string s using a enhanced for loop with s.toCharArray(). This loop processes each character in s individually.

Inside the loop, check if chs is equal to the backspace character ('#'). If it is, and if sb is not empty (sb.length() > 0), remove the last character from sb using sb.deleteCharAt(sb.length() - 1). This simulates the effect of the backspace character by deleting the previous character.

If chs is not the backspace character, append it to sb using sb.append(chs). This adds the character to sb as it is.

Repeat steps 3-4 for each character in string t, updating sb2 accordingly.

After processing both strings, compare the resulting strings by calling sb.toString().equals(sb2.toString()). This checks if the processed strings sb and sb2 are equal.

Return the result of the comparison, indicating whether the original strings s and t are equal when the backspaces are considered.

The code effectively handles backspaces in the input strings and compares the resulting strings to determine equality.
*/
