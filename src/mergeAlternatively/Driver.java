package mergeAlternatively;

/**
 * Problem:
 * <pre>
 * Problem Name: Merge Strings Alternately
 * Problem Difficulty: Easy
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 2ms
 * Runtime Rank: Beats 32.25% of users with Java 
 * Memory: 42.78MB
 * Memory Rank: Beats 15.33% of users with Java
 * </pre>
 * @version Date: March 9th 2024
 * @author Tristan Mbugua
 */
public class Driver {
	public static void main(String[] args) {
		System.out.println(mergeAlternately("abc", "pqr"));
	}

	public static String mergeAlternately(String word1, String word2) {
		int fullLength = word1.length() + word2.length();
        String newWord = "";
        for (int i = 0; i < fullLength; i++) {
            if (word1.length() > 0) {
            	if (word2.length() > 0) {
            		if ((i % 2) == 0) {
            			newWord += word1.substring(0, 1);
            			word1 = word1.substring(1);
            		} else {
            			newWord += word2.substring(0, 1);
            			word2 = word2.substring(1);
            		}
            	} else {
            		newWord += word1;
            		return newWord;
            	}
        	} else {
        		newWord += word2;
        		return newWord;
        	}
        }
        return newWord;
	}
}

/* Shorter answer:
 * for (int i = 0; ((word1.length() > i) && (word2.length() > 0)); i=i+2) {
 * word1 = word1.substring(0, i + 1) + word2.substring(0, 1) + word1.substring(i
 * + 1); word2 = word2.substring(1); } word1 += word2; return word1;
 */