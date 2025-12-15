/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//brute force

class Solution {
    public ListNode middleNode(ListNode head) {



       /* if(head == null) {
            return null;
        }
        int counter = 1;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            counter++;
        }
        counter = (counter/2) + 1;
        int count = 1;
        ListNode temp1 = head;
        while(count < counter) {
            temp1 = temp1.next;
            count++;
        }
        return temp1;
*/

        //optimized approach
        if(head == null) {
            return null;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp1 != null && temp1.next != null) {
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        return temp2;

    }
}