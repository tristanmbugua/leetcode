package longestPalindromicSubstring;

public class LongestPalindromicString {

    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        //Two-pointer solution
        String curr = "";
        StringBuilder flip = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                //Use a string reversal method to compare based on the distqnce from the start.
                curr = s.substring(i, j);
                flip = new StringBuilder(s.substring(j, 2 * j - i - 1));
                flip.reverse();

                if (curr.equals(flip.toString())) {
                    if () {}
                }
            }
        }
    }
}