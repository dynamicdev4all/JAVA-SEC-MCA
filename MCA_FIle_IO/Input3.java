import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("temp.txt");
            int a = fr.read();
            fr.close();
            System.out.println(a);

        } catch (IOException e) {
            System.out.println("some errro occured");
            e.printStackTrace();
        }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter your name");
        // String name = scanner.next();
        // String name2 = scanner.nextLine();

        // System.out.println(name);
        // System.out.println(name2);

    }
}
