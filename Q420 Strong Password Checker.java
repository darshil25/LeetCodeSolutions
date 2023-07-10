class Solution {
    public int strongPasswordChecker(String password) {
        int[] ok = new int[]{1, 1, 1};
        char[] A = password.toCharArray();
        for (char ch : A){ 
            ok[0] &= Character.isLowerCase(ch)? 0 : 1;
            ok[1] &= Character.isUpperCase(ch)? 0 : 1;
            ok[2] &= Character.isDigit(ch)? 0 : 1;
        }
        int ans = 0, len = password.length(), cond = ok[0]+ok[1]+ok[2]; 
        var minheap = new PriorityQueue<Integer>(Comparator.comparingInt(o -> o%3)); 
        for (int i = 0, cnt = 1; i < len; i++, cnt++){ 
            if (i == len-1 || A[i] != A[i+1]){
                if (cnt >= 3){
                    minheap.offer(cnt);
                }
                cnt = 0;
            }
        }
        while(len > 20 && !minheap.isEmpty()){ 
            int cur = minheap.poll();
            if (--cur >= 3){
                minheap.offer(cur);
            }
            --len;
            ++ans;
        }
        while(!minheap.isEmpty()){ 
            int cur = minheap.poll();
            cond -= cur/3;
            ans += cur/3;
            if (len < 6){ 
                len++;   
            }
        }
        while(len > 20){ 
            ans++;
            len--;
        }
        while(len < 6){ 
            cond--;
            ans++;
            len++;
        }
        return ans + (cond < 0? 0 : cond); 
    }
}
/*
Explanation
This method takes a password as input and returns an integer representing the number of changes required to make the password a strong password.

The method begins by initializing an array called "ok" with three elements, all set to 1. This array will be used to check if the password meets certain criteria for a strong password. The password is converted to a character array called "A".

The method then iterates over each character in the password and checks if it is a lowercase letter, an uppercase letter, or a digit. If any of these conditions are met, the corresponding element in the "ok" array is set to 0, indicating that the password does not meet the criteria for that condition.

After checking the password for lowercase, uppercase, and digit requirements, the method calculates the total number of conditions that are not met (stored in the variable "cond") by summing the elements of the "ok" array.

Next, a priority queue called "minheap" is created to store the lengths of consecutive characters in the password. The priority is determined based on the remainder when the length is divided by 3.

The method then iterates over the password, counting the consecutive characters. When a different character is encountered or the end of the password is reached, if the count of consecutive characters is 3 or more, it is added to the "minheap" priority queue.

The method then enters a loop that runs as long as the password length is greater than 20 and the "minheap" is not empty. In each iteration, the smallest value (based on the priority) is removed from the "minheap". If the value is decreased by 1 and still greater than or equal to 3, it is added back to the "minheap". The length of the password is decreased by 1, and the variable "ans" (representing the number of changes made so far) is incremented by 1.

Following that, another loop runs until the "minheap" is empty. In each iteration, the smallest value is removed from the "minheap". The number of conditions that are not met ("cond") is decreased by the result of dividing the value by 3. The "ans" variable is incremented by the result of dividing the value by 3. If the length of the password is less than 6, it is increased by 1.

After that, two more loops are executed to handle cases where the length of the password is greater than 20 or less than 6. In each iteration, the "ans" variable is incremented, and the length of the password is either decreased or increased, depending on the loop.
*/
