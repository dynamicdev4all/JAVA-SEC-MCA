import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        String str = "The JAVA code is BAD";
        // String[] temp = str.split("@");
        // for (String a : temp) {
        // System.out.println(a);
        // }

        Scanner scanner = new Scanner(str);

        int count = 0;

        while (scanner.hasNext("v")) {
            scanner.next();

            count++;
        }
        System.out.println("The number of words are :" + count);
    }
}
