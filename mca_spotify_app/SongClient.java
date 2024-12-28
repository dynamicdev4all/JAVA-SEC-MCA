import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class SongClient {
    public static void main(String[] args) {
        String url = "https://itunes.apple.com/search?term=karan+aujla&limit=25";
        HttpClient songClient = HttpClient.newHttpClient();

        HttpRequest songRequest = HttpRequest.newBuilder(URI.create(url)).GET().build();

        try {
            HttpResponse<String> songResponse = songClient.send(songRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println(songResponse.body());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}