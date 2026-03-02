public class PalindromeUC12 {

    public static void main(String[] args) {

        String testString = "Level";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        System.out.println("Using StackStrategy: " + testString + " -> " + strategy.checkPalindrome(testString));

        strategy = new DequeStrategy();
        System.out.println("Using DequeStrategy: " + testString + " -> " + strategy.checkPalindrome(testString));
    }
}

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }

        return true;
    }
}