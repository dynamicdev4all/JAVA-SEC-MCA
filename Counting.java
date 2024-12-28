public class Counting {

    static void printNames(int i) {
        if (i < 5) {
            System.out.println("Khajamu");
            printNames(i + 1);
        }
        return;
    }

    static void printCounting(int i) {
        if (i < 5) {
            System.out.println(i);
            printCounting(i + 1);
        }
        return;
    }

    public static void main(String[] args) {

        // printNames(0);
        printCounting(0);
        // System.out.println();

        // for (int i = 0; i < 50; i++) {
        // System.out.println("Khajamu");
        // }

    }
}
