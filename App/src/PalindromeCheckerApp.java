public class PalindromeUC9 {

    static int left = 0;

    public static void main(String[] args) {

        String original = "radar";

        left = 0;
        boolean isPalindrome = checkPalindrome(original, original.length() - 1);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(String str, int right) {

        if (right <= left) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        left++;
        return checkPalindrome(str, right - 1);
    }
}