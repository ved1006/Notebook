class Solution {
    public void reorderList(ListNode head) {
        //using counter logic 
        /*
        if (head == null || head.next == null) return;

        ListNode temp = head;
        int counter=1;
        while(temp.next != null) {
            counter++;
            temp = temp.next;
        }
        ListNode curr = head;
        for(int i=0;i<(counter+1)/2;i++) {
            curr = curr.next;
        }
        ListNode temp1 = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        for(int i=1;i<(counter+1)/2;i++){
            temp1=temp1.next;
        }
        temp1.next = null;

        ListNode First = head;
        ListNode Second = head.next;
        ListNode rFirst = temp;
        ListNode rSecond = temp.next;

        while(rFirst != null) {
            First.next = rFirst;
            rFirst.next = Second;
            Second = First;
            Second = Second.next;
            rSecond = rFirst;
            rSecond = rSecond.next;

    */

    //using slow fast ka logic;
    
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow.next;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow.next = null;
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode fNext = first.next;
            ListNode sNext = second.next;

            first.next = second;
            second.next = fNext;

            first = fNext;
            second = sNext;
        }
    }
}
        