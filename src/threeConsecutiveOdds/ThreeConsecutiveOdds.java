package threeConsecutiveOdds;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 4, 3};
		System.out.println(threeConsecutiveOdds(arr));
	}

	public static boolean threeConsecutiveOdds(int[] arr) {
		int counter = 0;
		if (arr.length < 3) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				counter++;
				if (counter == 3)
					return true;
				continue;
			}
			counter = 0;
		}
		return false;
	}
}