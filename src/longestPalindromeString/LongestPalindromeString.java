package longestPalindromeString;

import java.util.*;

public class LongestPalindromeString {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aba"));
	}
	
	public static String longestPalindrome(String s) {
		//Use a stack.
		String list = "";
		String remaining = "";
		String substring = ""; 
		String copyList = "";
		for (int i = 0; i < s.length(); i++) {
			list += s.substring(0, i+1);
			remaining = s.substring(i+1);
			copyList = list;
			
			//Trim strings
			if (list.length() > remaining.length()+1) {
				list = list.substring(list.length() - remaining.length());
			} else if (list.length()+1 < remaining.length()) {
				remaining = remaining.substring(remaining.length() - list.length());
			}
			
			//Compare to the rest of the string.
			while (remaining.length() > 0) {
				//On odd length
				if (remaining.length() % 2 == 1) {
					if (copyList.substring(0, copyList.length() -1).equals(remaining.substring(1))) {
						substring = copyList + remaining.substring(1);
					}
				}
				//On even length
				else {
					if (copyList.equals(remaining)) {
						substring = copyList + remaining;
					}
				}
				remaining = remaining.substring(1);
				copyList = copyList.substring(1);
			}
		}
		return substring;
	}
}