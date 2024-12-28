public class PrintCount {

    static void printVal(int a) {
        if (a > 5) {
            return;
        }
        System.out.println(a);
        printVal(a + 1);
    }

    public static void main(String[] args) {
        
    }
}
