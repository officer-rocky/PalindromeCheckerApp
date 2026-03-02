public class PalindromeCheckerApp{

    public static void main(String[] args) {

        String testString = "A man a plan a canal Panama";

        long start, end;

        // UC3: String Reverse
        start = System.nanoTime();
        boolean resultUC3 = checkPalindromeStringReverse(testString);
        end = System.nanoTime();
        System.out.println("UC3 (String Reverse): " + resultUC3 + " | Time: " + (end - start) + " ns");

        // UC4: Two-pointer char array
        start = System.nanoTime();
        boolean resultUC4 = checkPalindromeTwoPointer(testString);
        end = System.nanoTime();
        System.out.println("UC4 (Two-pointer): " + resultUC4 + " | Time: " + (end - start) + " ns");

        // UC5: Stack
        start = System.nanoTime();
        boolean resultUC5 = checkPalindromeStack(testString);
        end = System.nanoTime();
        System.out.println("UC5 (Stack): " + resultUC5 + " | Time: " + (end - start) + " ns");

        // UC7: Deque
        start = System.nanoTime();
        boolean resultUC7 = checkPalindromeDeque(testString);
        end = System.nanoTime();
        System.out.println("UC7 (Deque): " + resultUC7 + " | Time: " + (end - start) + " ns");
    }

    private static String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    private static boolean checkPalindromeStringReverse(String input) {
        String str = normalize(input);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    private static boolean checkPalindromeTwoPointer(String input) {
        String str = normalize(input);
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    private static boolean checkPalindromeStack(String input) {
        String str = normalize(input);
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    private static boolean checkPalindromeDeque(String input) {
        String str = normalize(input);
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}