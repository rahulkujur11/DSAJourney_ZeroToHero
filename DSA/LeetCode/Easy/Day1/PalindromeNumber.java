package DSA.LeetCode.Easy.Day1;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reversed = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            // Check for overflow/underflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return false;  // Overflow case for large inputs
            }
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber checker = new PalindromeNumber();
        
        int number = 121;  // Example number
        System.out.println(number + " is palindrome: " + checker.isPalindrome(number));  
        // Output: true
    }
}
