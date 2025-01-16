import java.util.*;

public class ResourceBundleDemo {

    static String getDataFromBundle(Locale locale) {
        System.out.println(locale);
        ResourceBundle rb = ResourceBundle.getBundle("Config");

        return rb.getString("greet");
    }

    public static void main(String[] args) {

        Locale locale;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your language");
        System.out.println("""
                Press 1 for Hindi
                Press 2 for English
                Press 3 for French
                """);
        int choice = sc.nextInt();
        if (choice == 1) {
            locale = new Locale("hi", "IN");
        } else if (choice == 2) {
            locale = new Locale("en", "US");
        } else if (choice == 3) {
            locale = new Locale("fr", "FR");
        } else {
            System.out.println("Wrong Input, default using English");
            locale = new Locale("en", "US");
        }

        System.out.println(getDataFromBundle(locale));

        // Locale locale = new Locale("en", "US");

    }
}
