import java.util.*;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("MessageBundle",locale);       
        System.out.println(rb.getString("greet"));
    }
}
