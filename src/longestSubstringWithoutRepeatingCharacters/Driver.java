package longestSubstringWithoutRepeatingCharacters;

/**
 * 
 */
public class Driver {

	public static void main(String[] args) {
		System.out.println(LengthOfLongestSubstring("aab"));
	}
	
	public static int LengthOfLongestSubstring(String s) {
        String usedCharacters = "";
        Boolean alarm = false;
        String newString = "";
        int returnVal = 0;
        for (int i = 0; i < s.length(); i++) {
        	if (usedCharacters.replace(s.charAt(i), 'შ').equals(usedCharacters)) {
        		usedCharacters += s.substring(i, (i+1));
        		
            	newString+=s.substring(i, (i+1));
            	if (newString.length() > returnVal) {
            		returnVal = newString.length();
            	}
            	
            } else {
            	newString = "";
    			usedCharacters = "";
    			s = s.substring(1);
    			i = -1;
    			continue;
            }
        }
        return returnVal;
    }
	
}
