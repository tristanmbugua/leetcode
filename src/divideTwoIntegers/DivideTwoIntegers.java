package divideTwoIntegers;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147
				, -1));
	}
	public static int divide(int dividend, int divisor) {
		if (divisor == dividend) {
			return 1;
		} else if (divisor*-1 == dividend || divisor == dividend*-1) {
			return -1;
		}
		
		if (divisor == 1) {
			return dividend;
		}
		
		if (divisor == -1) {
			return -1*dividend;
		}
		
		int answer = 0;
		
		if (divisor < 0) {
			divisor *= -1;
		}
		if (dividend < 0) {
			dividend *= -1;
		}
//		divisor = Math.abs(divisor);
//		dividend = Math.abs(dividend);

		while (dividend >= divisor) {
			dividend -= divisor;
			answer++;
        };
		
        if (divisor > 0) {
        	return answer;
        } else {
        	return -1*answer;
        }
    }
}
