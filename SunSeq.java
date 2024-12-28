import java.util.ArrayList;

public class SunSeq {
    public static void main(String[] args) {
        String name = "JOY";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (list.size() == 0) {
                list.add("");
                list.add("" + ch);
                // continue;
            }

            int listLen = list.size();
            for (int j = 0; j < listLen; j++) {
                String temp = list.get(j) + ch;
                list.add(temp);
            }
        }
    }
}
