public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        int l = 0;
        while (n > 0) {
            n = n / 10;
            l++;
        }
        System.out.println(l);
    }
}
