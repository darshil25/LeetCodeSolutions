class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy; 
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; 
            int y = (l2 != null) ? l2.val : 0; 

            int sum = carry + x + y; 
            carry = sum / 10;
            current.next = new ListNode(sum % 10); 
            current = current.next; 
            if (l1 != null)
                l1 = l1.next; 
            if (l2 != null)
                l2 = l2.next;

        if (carry > 0) {
            current.next = new ListNode(carry); 
            }
        }
        return dummy.next; 
    }
}
/*
Explanation
The code defines a class named Solution that contains the method addTwoNumbers, which takes two parameters: l1 and l2, representing two linked lists.

A dummy node is created with an initial value of 0. This node will serve as the starting point of the resulting linked list.

A current node is initialized to point to the dummy node. This current node will be used to traverse and build the resulting linked list.

An integer variable carry is set to 0. This variable will hold the carry value during addition.

The code enters a while loop, which continues until both l1 and l2 become null. This loop iterates through the linked lists, performing the addition operation.

Inside the loop, two integer variables x and y are assigned the values of the current nodes in l1 and l2, respectively. If either l1 or l2 becomes null, the corresponding value is set to 0.

The sum of x, y, and carry is calculated and stored in the sum variable. The carry value is determined by dividing the sum by 10.

A new node is created with the value equal to sum % 10, which represents the remainder of the sum when divided by 10. This node is appended after the current node.

The current node is updated to point to the newly created node, effectively moving to the next position in the resulting linked list.

If l1 or l2 is not null, the corresponding pointer is moved to the next node in the respective linked list.

After the while loop finishes, if there is still a remaining carry value, a new node is created with that value and appended to the resulting linked list.

Finally, the code returns the linked list starting from the node after the dummy node. This skips the dummy node itself and provides the actual result.
*/
