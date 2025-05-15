package recursion;

public class SumOfArray {
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        return sumArray(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(sumArray(arr, 4));
    }
}
