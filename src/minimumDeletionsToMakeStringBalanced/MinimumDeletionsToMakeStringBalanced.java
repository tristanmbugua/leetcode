package minimumDeletionsToMakeStringBalanced;

import java.util.Stack;

public class MinimumDeletionsToMakeStringBalanced {
    public static void main(String[] args) {
        System.out.print(
                minimumDeletionsToMakeStringBalanced("baababbaabbaaabaabbabbbabaaaaaabaabababaaababbb"));
    }

    public static int minimumDeletionsToMakeStringBalanced(String s) {
        //Use a stack to remove all 'ba' pairs.
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty() && stack.peek() == 'b' && s.charAt(i) == 'a') {
                stack.pop();
                count++;
            } else {
                stack.push(s.charAt(i));
            }
        }

        return count;
    }
}