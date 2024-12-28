public class FunctionsDemo {

    static void sum0() {
        System.out.println("fn0");
    }

    static void sum1(int a) {
        System.out.println("fn1");
        // System.out.println(true);
        // System.out.println(0x12);
    }

    static boolean sum2() {
        System.out.println("fn2");
        return false;
    }

    static boolean sum3(int b) {
        System.out.println("fn3");
        return false;
    }

    public static void main(String[] args) {
        // sum0();
        sum3(0);
        sum3(true);
        // sum2();
    }
}
