import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class Bill {
    static String printDate(Locale locale) {
        Date abc = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL, locale);
        return dtf.format(abc);
    }

    static String printTotal(Locale locale, double val) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(val);
    }

    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String custName = sc.nextLine();
        System.out.println("Item Name?");
        String itemName = sc.nextLine();
        System.out.println("Purchase Price");
        double purchsePrice = sc.nextDouble();
        System.out.println("Tax in %?");
        double taxRate = sc.nextDouble();

        double taxAmount = (taxRate / 100) * purchsePrice;
        double netAmount = purchsePrice - taxAmount;

        System.out.println("Welcome, " + custName);
        System.out.println("You have purchased " + itemName + " on " + printDate(locale));
        System.out.println("Unit Price :" + printTotal(locale, netAmount));
        System.out.println("TAX :" + taxRate);
        System.out.println("Tax Amount :" + printTotal(locale, taxAmount));
        System.out.println("Total Amount :" + printTotal(locale, purchsePrice));
    }
}
