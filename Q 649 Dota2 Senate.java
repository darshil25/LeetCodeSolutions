class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>(); 
        Queue<Integer> q2 = new LinkedList<>(); 
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                q1.offer(i);
            } else {
                q2.offer(i);
            }
        }
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int i = q1.poll();
            int j = q2.poll();
            if (i < j) {
                q1.offer(i + n);
            } else {
                q2.offer(j + n);
            }
        }
        return q1.isEmpty() ? "Dire" : "Radiant";
    }
}
/*Explanation
The solution uses two queues q1 and q2 to store the indices of the Radiant and Dire senators, respectively. 
It loops through the queues as long as both are not empty. At each iteration, it dequeues the next senator from 
each queue and compares their indices. If the Radiant senator has a smaller index, it means that he can ban 
the next Dire senator's right, so he keeps his own right and enqueues himself with an index of i + n (where n is the length of senate) 
to indicate that he has lost his right in all subsequent rounds. Otherwise, the Dire senator can ban the next Radiant senator's right, 
so he keeps his own right and enqueues himself with an index of j + n. After all the rounds are finished, the solution returns the name 
of the party that still has senators with rights to vote.
*/
