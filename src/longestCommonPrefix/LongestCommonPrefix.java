package longestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        //Take the first word as the anchor.
        //Iterate over each letter in the next word to find a match.
        //When not letter in the word matches, return the word.
        //Decrement the while loop to match the length of the common word.

        String comPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(comPrefix.length(), strs[i].length()); j++) {
                if (comPrefix.charAt(j) != strs[i].charAt(j)) {
                    comPrefix = comPrefix.substring(0, j);
                }
            }

            if (comPrefix.length() > strs[i].length()) {
                comPrefix = comPrefix.substring(0, strs[i].length());
            }
        }

        return comPrefix;
    }
}
