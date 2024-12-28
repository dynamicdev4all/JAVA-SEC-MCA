public class RotateNumb {
    static int findLenght2(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + findLenght2(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        int r = 61;
        int len = findLenght2(n);
        r = r % len;
        for (int i = 0; i < r; i++) {
            int rem = n % 10;
            n = n / 10;
            int temp = rem * (int) Math.pow(10, len - 1);

            n = temp + n;
        }
        System.out.println(n);
    }
}
