package reversePrefix;

public class ReversePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversePrefix("Helpo", 'p'));
	}
	
	public static String reversePrefix(String word, char ch) {
		for (int i = 0, val = word.indexOf(ch); val > i;) {
			word =  word.substring(0, i) +
					word.charAt(val) +
					word.substring(i+1, val) + 
					word.charAt(i) + 
					word.substring(val+1);
			i++;
			val--;
		}
		
		return word;
    }
}