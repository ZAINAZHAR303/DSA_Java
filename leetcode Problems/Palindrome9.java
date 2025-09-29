public class Palindrome9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10)); // Output: false
    }

    static boolean isPalindrome(int x) {
        // Handle negative numbers (they cannot be palindromes)
        if (x < 0) {
            return false;
        }

        int originalNumber = x; // Save the original number
        String output = "";

        while (x > 0) {
            int digit = x % 10; // Get the last digit
            output = output + digit; // Append the digit to the output string
            x = x / 10; // Remove the last digit
        }

        // Compare the reversed string with the original number as a string
        return output.equals(Integer.toString(originalNumber));
    }
}