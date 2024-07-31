package fibonacciNumber;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(6));
    }

    public static int fibonacciNumber(int n) {
        return n - 1 + n - 2;
    }
}