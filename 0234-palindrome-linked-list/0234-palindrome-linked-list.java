class Solution {
    public boolean isPalindrome(ListNode head) {
       /* if(head == null) {
            return true;
        }
        if(head.next == null) {
            return true;
        }

        ListNode temp = head;
        int counter = 1;

        while(temp.next != null) {
            counter++;
            temp = temp.next;
        }
        temp = head;
        Stack<Integer> stack = new Stack<>();   
        int count =1;
        if(counter%2 == 0) {
            while(count <= counter/2){
                stack.push(temp.val);
                temp = temp.next;
                count++;
            }
            while(count <= counter) {
                if(stack.pop() != temp.val) {
                    return false;
                }
                temp = temp.next;
                count++;
            }
            return true;
        }
        else{
            while(count <= counter/2){
                stack.push(temp.val);
                temp = temp.next;
                count++;
            }
            count++;
            temp = temp.next;
            while(count <= counter) {
                if(stack.pop() != temp.val) {
                    return false;
                }
                temp = temp.next;
                count++;
            }
            return true;
        }
        */

    ListNode fast = head;
    ListNode slow = head;

    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode prev = null;
    while(slow !=null) {
        ListNode next = slow.next;  // understand this better while revising;
        slow.next = prev;
        prev = slow;
        slow = next;
    }
    ListNode left = head;
    ListNode right = prev;

    while(right != null) {
        if(left.val != right.val) {
            return false;
        }
        left = left.next;
        right=right.next;
    }
    return true;
    }
}