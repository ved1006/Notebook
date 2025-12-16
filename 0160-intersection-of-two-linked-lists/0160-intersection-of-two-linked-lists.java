/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) { return null ;}

        ListNode a= headA;
        ListNode b = headB;

        int count1 =1;
        int count2=1;
        while(a.next !=null) {
            count1++;
            a= a.next;
        }
        while(b.next != null) {
            count2++;
            b=b.next;
        }

        a=headA;
        b=headB;

        if(count1 > count2){
            for(int i=0;i<count1-count2;i++){
                a=a.next;
            }
        }
        else{
            for(int i=0;i<count2-count1;i++){
                b=b.next;
            }
        }

        while(a!=null && b!=null){
            if(a==b){
                return a;
            }
            a=a.next;
            b=b.next;
        }
        return null;
    }

}
