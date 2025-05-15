package recursion;

public class FindMaximum {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        return findMax(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(findMax(arr, 4));
    }
}
