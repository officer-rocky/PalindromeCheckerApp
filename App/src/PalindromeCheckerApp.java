public class PalindromeUC11 {

    public static void main(String[] args) {

        String testString = "Deed";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(testString);

        if (result) {
            System.out.println("The string \"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + testString + "\" is not a palindrome.");
        }
    }
}

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null) return false;

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}