package passThePillow;

public class PassThePillow {

	public static void main(String[] args) {
		System.out.println(passThePillow(3, 6));
	}
	
	public static int passThePillow(int n, int time) {
		int remainder = 0;
		
		//If there is less than one traversion of the line, the return value is simple;
		if (time < n) {
			return 1 + time;
		}
		
		//It takes n - 1 steps to make each traversion.
		double fullCycle = (n-1) * 2;
		
		double upOrDown = ((time) / fullCycle) % 1.0;
		
		//Traversion going down
		if (upOrDown >= 0.5) {
			remainder = time % (n-1);
			return n - remainder;
		//Traversion going up	
		} else {
			remainder = time % (n-1);
			return 1 + remainder;
		}
	}
}