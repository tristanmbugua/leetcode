package validParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[])"));
    }

    public static boolean isValid(String s) {
        //Use a stack.
        Stack<Character> stack = new Stack<Character>();

        //Edge Case 1
        if (s.length() < 2) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            } else if (!stack.isEmpty()){
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                            s = s.substring(0, i-1) + s.substring(i + 1);
                            i -= 2;
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                            s = s.substring(0, i-1) + s.substring(i + 1);
                            i -= 2;
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.peek() == '[') {
                            stack.pop();
                            s = s.substring(0, i-1) + s.substring(i + 1);
                            i -= 2;
                        } else {
                            return false;
                        }
                        break;
                }
                continue;
            }
            return false;
        }

        if (s.isEmpty()) {
            return true;
        }

        return false;
    }
}