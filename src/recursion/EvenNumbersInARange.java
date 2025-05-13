package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start < end) {
            printEvens(start, end - 1);
        }

        if (end % 2 == 0) {
            System.out.println(end);
        }
    }

    public static void main(String[] args) {
        printEvens(1, 10);
    }
}
