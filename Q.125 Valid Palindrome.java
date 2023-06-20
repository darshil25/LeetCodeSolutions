class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
/*
Explanation
The original string is first processed using replaceAll() to remove any non-alphanumeric characters. The regular expression [^a-zA-Z0-9] matches any character that is not a letter (lowercase or uppercase) or a digit.
The processed string is then converted to lowercase using toLowerCase() to make the palindrome check case-insensitive.
Two pointers, start and end, are initialized. The start pointer starts from the beginning of the string, and the end pointer starts from the end of the string.
A while loop is used to compare characters at the start and end positions. The loop continues until the start pointer is less than the end pointer.
Inside the loop, if the characters at the start and end positions do not match, it means the string is not a palindrome, so false is returned.
If the characters match, the start pointer is incremented and the end pointer is decremented to continue checking the next pair of characters.
Once the loop completes without finding any mismatches, it means the string is a palindrome, so true is returned.
The code effectively checks if the given string, after removing non-alphanumeric characters and ignoring case, is a palindrome.
*/
