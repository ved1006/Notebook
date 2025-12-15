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
        if(head == null){
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
    }
}