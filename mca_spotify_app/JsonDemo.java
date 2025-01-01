import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDemo {
    public static void main(String[] args) {
        String data = """
                [{"artistName":"Diljit Dosanjh", "songName":"Case", "Country":"US"},
                {"artistName":"Arijit Singh", "songName":"Shayad", "Country":"US"},
                {"artistName":"Jubin Nautiyal", "songName":"Chitthi", "Country":"US"},
                {"artistName":"KK", "songName":"Labon", "Country":"US"},
                {"artistName":"Pawan Singh", "songName":"Kismat", "Country":"US"},
                {"artistName":"Sonu Nigam", "songName":"Apne", "Country":"US"}]
                """;
        JSONArray songArray = new JSONArray(data);
        // System.out.println(songArray.length());
        for (int i = 0; i < songArray.length(); i++) {
            JSONObject songObject = songArray.getJSONObject(i);
            // System.out.println(songObject.getString("artistName"));
            System.out.println(songObject.getString("songName"));
        }
    }
}
