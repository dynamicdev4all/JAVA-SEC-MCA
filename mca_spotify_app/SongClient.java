import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class SongClient {
    public static void main(String[] args) {
        ArrayList<SongModel> songList = new ArrayList<>();
        String url = "https://itunes.apple.com/search?term=taylor+swift&limit=28";

        HttpClient client = HttpClient.newHttpClient();

        // System.out.println(URI.create(url).getPath());
        // System.out.println(URI.create(url).getHost());

        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();

        try {
            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (res.statusCode() == 200) {
                System.out.println("Success");
                // System.out.println(res.body());
                String data = res.body();
                JSONObject songs = new JSONObject(data);
                // JSONArray songArray = new JSONArray(data);
                JSONArray songArray = songs.getJSONArray("results");
                // System.out.println(songArray.length());
                for (int i = 0; i < songArray.length(); i++) {
                    SongModel song;
                    JSONObject songObject = songArray.getJSONObject(i);
                    song = new SongModel(

                            songObject.has("trackName") ? songObject.getString("trackName") : "No Song Name",

                            songObject.has("artistName") ? songObject.getString("artistName") : "No Singer Name",

                            songObject.has("collectionName") ? songObject.getString("collectionName")
                                    : "No Song Playlist",

                            songObject.has("artworkUrl100") ? songObject.getString("artworkUrl100") : "No Song Pic",

                            songObject.has("previewUrl") ? songObject.getString("previewUrl") : "No Song Url");

                    songList.add(song);
                    // System.out.println(songObject.getString("artistName"));
                    // if (songObject.has("trackName")) {
                    // song = new SongModel(songObject.getString("trackName"), data, data, data,
                    // url);
                    // } else {
                    // System.out.println("No Song Name Found");
                    // }
                }
                System.out.println("the total songs are " + songList.size());
                songList.get(4).printSongData();
            } else {
                System.out.println("Fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}