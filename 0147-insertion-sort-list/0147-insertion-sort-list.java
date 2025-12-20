class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        while(temp.next != null) {
            ListNode curr = temp.next;
            while(curr != null) {
                if(temp.val < curr.val) {
                    curr = curr.next;
                }
                else{
                    int t = temp.val;
                    temp.val = curr.val;
                    curr.val = t;
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
        temp = head;
        int min = Integer.MAX_VALUE;
        while(temp.next != null) {
            if(temp.val > min){
                min = temp.val;
                dummy = temp;
            }
            temp = temp.next;
        }        
        return dummy.next;
    }
}