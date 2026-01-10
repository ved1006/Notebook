import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++) {
            char ele = s.charAt(i);

            if( ele =='(' || ele == '{' || ele == '[') {
                stack.push(ele);
            } else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if (ele == ')' && top != '(') return false;
                if (ele == '}' && top != '{') return false;
                if (ele == ']' && top != '[') return false;

            }
        }
        return stack.isEmpty();
    }
}