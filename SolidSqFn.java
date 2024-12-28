public class SolidSqFn {

    static void printStar(int starCount) {
        if (starCount > 0) {
            System.out.print("*");
            printStar(starCount - 1);
        }
    }

    static void printPattern(int row, int col) {
        if (row > 0) {
            printStar(col);
            System.out.println();
            printPattern(row - 1, col);
        }

    }

    public static void main(String[] args) {
        printPattern(2, 50);
    }
}
