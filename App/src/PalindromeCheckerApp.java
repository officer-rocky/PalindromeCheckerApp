public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "madam";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        if (text.equals(reversed)) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }

    }
}