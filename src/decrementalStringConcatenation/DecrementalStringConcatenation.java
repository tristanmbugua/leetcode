package decrementalStringConcatenation;

public class DecrementalStringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"aa", "ab", "bc"};
		System.out.println(minimizeConcatenatedLength(words));
	}
	
	public static int minimizeConcatenatedLength(String[] words) {
		if (words.length == 1) {
			return words[0].length();
		}
		String currentWord = words[0];
		for (int i = 0; i < words.length-1; i++) {
			String word2 = words[i+1];
			
			//Find first and last for each. Use charAt.
			if (currentWord.charAt(0) == word2.charAt(word2.length()-1)) {
				currentWord = word2 + currentWord.substring(1, currentWord.length());
			} else if (word2.charAt(0) == currentWord.charAt(currentWord.length()-1)) {
				currentWord = currentWord + word2.substring(1, word2.length());
			} else {
				currentWord = currentWord + word2;
			}
		}
		
		return currentWord.length();
    }
}