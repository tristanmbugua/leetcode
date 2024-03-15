package reverseInteger;

import java.util.List;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-321));

	}
	
	public static int reverse(int x) {
		String s = String.valueOf(x); 
		boolean negative = false;
		char firstValue;
		
		//Remove potential negative sign
		if (s.charAt(0) == '-') {
			negative = true;
			s = s.substring(1);
		}
		
		int length = s.length()-1;
		//Hold length subtract
		for (int i = 0; i < s.length() / 2; i++) {
			firstValue = s.charAt(i);
			s = s.substring(0, i) + s.charAt(length - i) + s.substring(i+1, length+1);
			s = s.substring(0, (length-i)) + firstValue + s.substring((length-i)+1);
		}
		
		//Remove leading zeroes
		while (s.length() > 1) {
			if (s.charAt(0) != '0') {
				break;
			}
			s = s.substring(1);
		}
		
		//Add potential negative sign
		if (negative == true) {
			s = '-' + s.substring(0);
		}
		
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
	}

}
