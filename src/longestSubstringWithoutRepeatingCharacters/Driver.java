package longestSubstringWithoutRepeatingCharacters;

/**
 * Problem:
 * <pre>
 * Problem Name: Longest Substring Without Repeating Characters
 * Problem Difficulty: Medium.
 * </pre>
 * Solution Stats:
 * <pre>
 * Date: March 8th 2024
 * Runtime: 396ms
 * Runtime Rank: Beats 5.00% of users with Java
 * Memory: 45.27MB
 * Memory Rank: Beats 14.57% of users with Java
 * </pre>
 * @version Date: March 9th 2024
 * @author Tristan Mbugua
 */

public class Driver {

	public static void main(String[] args) {
		System.out.println(LengthOfLongestSubstring("aab"));
	}
	
	/**
	 * Find the longest substring in a string.
	 * @param s String to be searched.
	 * @return The length of the longest substring in a string.
	 */
	public static int LengthOfLongestSubstring(String s) {
        String usedCharacters = "";
        int returnVal = 0;
        for (int i = 0; i < s.length(); i++) {
        	if (usedCharacters.replace(s.charAt(i), 'შ').equals(usedCharacters)) {
        		usedCharacters += s.substring(i, (i+1));
        		if (usedCharacters.length() > returnVal) {
            		returnVal = usedCharacters.length();
            	}
            } else {
    			usedCharacters = "";
    			s = s.substring(1);
    			i = -1;
    			continue;
            }
        }
        return returnVal;
    }
	
}
