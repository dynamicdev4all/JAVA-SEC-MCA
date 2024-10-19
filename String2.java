public class String2 {
    public static void main(String[] args) {
        String name = "Aman";
        // String name2 = "Shekhar";
        // String name2 = new String(      "Aman"); // heap
        String name2 = new String("aman"); // heap
        // System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.compareTo(name2));
    }
}










