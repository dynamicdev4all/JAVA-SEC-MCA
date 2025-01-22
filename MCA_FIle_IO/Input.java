
public class Input {
    public static void main(String[] args) {
        String str = "             ";
        str = str.trim();
        String[] temp = str.split(" ");
        System.out.println(temp.toString());
        for (String n : temp) {
            System.out.println(n);
        }
        int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
        // count++;
        // }
        // }
        // count = count + 1;
        // System.out.println("Word Count is :" + count);
    }
}
