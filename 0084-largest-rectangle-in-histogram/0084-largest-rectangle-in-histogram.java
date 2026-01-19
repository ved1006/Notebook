import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] prev = findPreviousLow(heights);
        int[] next = findNextLow(heights);
        int max = Integer.MIN_VALUE;

        for(int i =0;i<heights.length;i++) {
            int height = heights[i];
            int width = next[i] - prev[i] -1;
            int area = height*width;
            max = Math.max(max,area);
        }
        return max;
    }

    public int[] findPreviousLow(int[] heights) {
        int n = heights.length;
        int[] prev = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 :stack.peek();
            stack.push(i);
        }
        return prev;
    }

    public int[] findNextLow(int[] heights) {
        int n = heights.length;
        int[] next = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n;i>=0;i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            next[i] = stack.isEmpty() ? -1 :stack.peek();
            stack.push(i);
        }
        return next;
    }
}