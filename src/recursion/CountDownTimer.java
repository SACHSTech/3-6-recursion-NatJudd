package recursion;

public class CountDownTimer {
    public static int countDown(int n) {
        if (n == 1) {
            System.out.println(n);
            return n;
        }

        System.out.println(n);
        return countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}