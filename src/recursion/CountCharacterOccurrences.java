package recursion;

public class CountCharacterOccurrences {
    public static int countChar(String s, char c) {
        if (s.length() < 1) {
            return 0;
        }

        if (c == s.charAt(0)) {
            return countChar(s.substring(1), c) + 1;
        }

        return countChar(s.substring(1), c);
    }

    public static void main(String[] args) {
        System.out.println(countChar("hello", 'l'));
    }
}
