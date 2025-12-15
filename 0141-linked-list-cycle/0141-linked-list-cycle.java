/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //brute force

        /* if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp.next !=null){
            temp = temp.next;
            if(!set.contains(temp)){
                set.add(temp);
            }
            else{
                return true;
            }
        }
        return false;
   */

    if(head == null){
            return false;
        }
    if(head.next == null){
            return false;
        }

    ListNode temp1 = head;
    ListNode temp2 = head;

    while( temp1!=null && temp1.next != null) {
        temp1 = temp1.next.next;
        temp2 = temp2.next;
        if(temp1 == temp2) {
            return true;
        }
    }
    return false;

    }
}