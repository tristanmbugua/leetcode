package palindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int copy = x;
        int newNum = 0;
        //Reverse this number using modulus.
        while (copy != 0) {
            newNum *= 10;

            newNum += copy % 10;

            copy /= 10;
        }

        if (newNum == x) {
            return true;
        }

        return false;
    }
}