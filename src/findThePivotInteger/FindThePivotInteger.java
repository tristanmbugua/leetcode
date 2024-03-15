package findThePivotInteger;

public class FindThePivotInteger {

	public static void main(String[] args) {
		System.out.println(findThePivotInteger(8));
	}
	
	public static int findThePivotInteger(int n) {
		int holder = 0;
		int total = 0;
		for (int i = 0; i <= n; i++) {
			total += i;
		}
		for (int i = 0; i <= n; i++) {
			holder += i;
			if (holder == ((total + i) - holder))
				return i;
		}
		return -1;
	}

}
