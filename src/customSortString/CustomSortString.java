package customSortString;

public class CustomSortString {
	public static void main(String[] args) {
		System.out.println(customSortString("exv", "xwvee"));
	}
	
	public static String customSortString(String order, String s) {
		char holder;
		int holder_;
		char holder1;
		int matchingPosition;
		int index = 1;
		for (int i = 0; order.length() > 0; i++) {
			holder_ = s.indexOf(order.charAt(0));
			if (holder_ > 0) {
				holder = s.charAt(i);
				if (holder_ > 0) {
					s = s.substring(0, i) + order.charAt(0) + s.substring(i+1, s.length());
					s = s.substring(0, holder_) + holder + s.substring(holder_+1, s.length()); 
				}
			}
			order = order.substring(1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			//Find similar and swap.
			holder = s.charAt(i);
			if ((i+1) < s.length()) {
				holder1 = s.charAt(i+1);
				
				matchingPosition = s.indexOf(holder, i+index);
				
				while (matchingPosition > 0 && (i+2) < s.length()) {
					//Place the macthingValue value right next to the current value.
					s = s.substring(0, i+1) + holder + s.substring(i+2, s.length());
					//Place the non-matching value at the old position of the current value.
					s = s.substring(0, matchingPosition) + holder1 + s.substring(matchingPosition+1, s.length());
					index++;
					matchingPosition = s.indexOf(holder, i+index);
				}
			}
			index = 1;
		}
		return s;
	}
}