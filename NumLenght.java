public class NumLenght {

    // static int count = 0;

    // static int findLenght(int n, int count) {
    // if (n > 0) {
    // // count++;
    // findLenght(n / 10, count + 1);
    // }
    // return count;
    // }

    static int findLenght2(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + findLenght2(n / 10);
    }

    public static void main(String[] args) {
        // int res = findLenght(12345);
        System.out.println(findLenght2(12345));
        // count = 55;
    }
}
