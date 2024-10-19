
import java.util.*;
import java.text.*;

public class LocaleDemo {

    static void printDate(Locale locale) {
        Date abc = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dtf.format(abc));
    }

    static void printTotal(Locale locale){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(2950));
    }

    public static void main(String[] args) {
        Locale locale = new Locale("fr", "FR");
        printDate(locale);
        printTotal(locale);
    }
}
