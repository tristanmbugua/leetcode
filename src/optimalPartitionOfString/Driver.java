package optimalPartitionOfString;


/**
 * Problem:
 * <pre>
 * Problem Name: Optimal Partition of String
 * Problem Difficulty: Medium
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 1365ms
 * Runtime Rank: Beats 5.05% of users with Java 
 * Memory: 46.61MB
 * Memory Rank: Beats 7.82% of users with Java
 * </pre>
 * @version Date: March 9th 2024
 * @author Tristan Mbugua
 */
public class Driver {

	public static void main(String[] args) {
		System.out.println(partitionString("abacaba"));
	}
	
	public static int partitionString(String s) {
        String usedCharacters = "";
        int stringTotal = 0;
		while(s.length() > 0) {
			if (usedCharacters.replace(s.charAt(0), 'შ').equals(usedCharacters)) {
        		//Replacement does not work. This means that this letter is not in the usedCharacters string.
        		usedCharacters += s.subSequence(0, 1); 
        		
        	} else {
        		//Replacement does work. This means that this letter is already in the usedCharacters string.
        		stringTotal++;
        		usedCharacters = "";
        		continue;
        	}
        	s = s.substring(1);
        }
		stringTotal++;
		return stringTotal;
    }
}
