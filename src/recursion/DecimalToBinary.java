package recursion;

public class DecimalToBinary {
    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }

        if (n % 2 == 0) {
            return toBinary(n / 2) + "0";
        }

        return toBinary(n / 2) + "1";
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }
}
