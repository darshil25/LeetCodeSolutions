int n = 0;
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int reverses = n/k;
        
        temp = dummy;
        while(reverses > 0){
            ListNode tail = head;
            int m = k;
            ListNode next = null;
            while(m > 0){
                ListNode nextHead = head.next;
                head.next = next;
                next = head;
                head = nextHead;
                m--;
            }
            temp.next = next;
            temp = tail;
            reverses--;
        }
        temp.next = head;
        return dummy.next;
