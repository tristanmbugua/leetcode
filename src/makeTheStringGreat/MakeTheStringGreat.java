package makeTheStringGreat;

public class MakeTheStringGreat {

	public static void main(String[] args) {
		System.out.println(makeGood("Pp"));
	}
	
	public static String makeGood(String s) {
		for (int i = 0; i < s.length()-1; i++) {
			//First letter is uppercase
			if (s.substring(i, i+1).equals(s.substring(i, i+1).toUpperCase())) {
				if (s.substring(i, i+1).toLowerCase().equals(s.substring(i+1, i+2))) {
					s = s.substring(0, i) + s.substring(i+2, s.length()) ;
					if (i - 2 > 0) {
						i = i-2;
					} else {
						i = -1;
					}
					continue;
				}
			}
			//First letter is lowercase
			if (s.substring(i, i+1).equals(s.substring(i, i+1).toLowerCase())) {
				if (s.substring(i, i+1).toUpperCase().equals(s.substring(i+1, i+2))){
					s = s.substring(0, i) + s.substring(i+2, s.length()) ;
					if (i - 2 > 0) {
						i = i-2;
					} else {
						i = -1;
					}
					continue;
				}
			}
		}
		
		return s;
    }
}
