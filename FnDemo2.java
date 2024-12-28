public class FnDemo2 {
    static void printCounting(int i) {
        if (i > 0) {
            
            printCounting(i - 1);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printCounting(5);
    }
}
