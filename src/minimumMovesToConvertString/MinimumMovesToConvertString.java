package minimumMovesToConvertString;

public class MinimumMovesToConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumMoves("XXXOOXXX"));
	}
	
	public static int minimumMoves(String s) {
		int moves = 0;
		String current = "";
		
		do {
			//Trim leading 'O's
			if (s.indexOf('O') < s.indexOf('X') && s.indexOf('O') > -1) {
				s = s.substring(s.indexOf('X'));
				continue;
			}
			current = s.substring(0, 3);
			if (current.indexOf('X') > -1) {
				moves++;
			}
			s = s.substring(3);
		} while (s.length() > 2);
		
		if (s.indexOf('X') > -1) {
			moves++;
		}
		
		return moves;
    }
}
