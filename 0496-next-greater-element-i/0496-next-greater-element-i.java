import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i= nums2.length-1;i>=0;i--) {
            int x = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= nums2[i] ){
                stack.pop();
            }

            map.put(x, stack.isEmpty() ? -1 : stack.peek());
            stack.push(x);
        }

        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}