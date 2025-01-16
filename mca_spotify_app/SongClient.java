import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
// import org.json.;*

public class SongClient {

    static HttpResponse<String> getSongsFromAPI(String url) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();
            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (res.statusCode() == 200) {
                return res;
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return null;
    }

    static ArrayList<SongModel> convertSongs(String url) {
        ArrayList<SongModel> songList = new ArrayList<>();
        HttpResponse<String> response = getSongsFromAPI(url);
        String data = response.body();
        JSONObject songs = new JSONObject(data);
        JSONArray songArray = songs.getJSONArray("results");
        for (int i = 0; i < songArray.length(); i++) {
            SongModel song;
            JSONObject songObject = songArray.getJSONObject(i);
            song = new SongModel(

                    songObject.has("trackName") ? songObject.getString("trackName") : "No Song Name",

                    songObject.has("artistName") ? songObject.getString("artistName") : "No Singer Name",

                    songObject.has("collectionName") ? songObject.getString("collectionName")
                            : "No Song Playlist",

                    songObject.has("artworkUrl100") ? songObject.getString("artworkUrl100") : "No Song Pic",

                    songObject.has("previewUrl") ? songObject.getString("previewUrl")
                            : "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview211/v4/3c/ac/99/3cac99b7-b3d0-7770-ec46-df6246d71f19/mzaf_4346138457410138458.plus.aac.p.m4a");

            // if(true){
            // songList.remove(songObject);
            // }

            songList.add(song);
        }
        return songList;
    }

}