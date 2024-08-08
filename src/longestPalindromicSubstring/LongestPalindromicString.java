package longestPalindromicSubstring;

//Unsolved.

public class LongestPalindromicString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static String longestPalindrome(String s) {
        //Edge case: one letter string
        if (s.length() == 1)
            return s;

        //Two-pointer solution
        String curr = "";
        StringBuilder flip = new StringBuilder();
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                curr = s.substring(i, j);

                flip = new StringBuilder(curr);
                flip.reverse();

                if (curr.equals(flip.toString())) {
                    if (curr.length() > longest.length()) {
                        longest = curr;
                    }
                }
            }
        }

        return longest;
    }
}