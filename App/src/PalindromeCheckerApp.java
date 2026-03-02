import java.util.Stack;

public class PalindromeUC5 {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
    }
}