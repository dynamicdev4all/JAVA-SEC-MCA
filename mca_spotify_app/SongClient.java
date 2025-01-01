import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class SongClient {
    public static void main(String[] args) {
        String url = "https://itunes.apple.com/search?term=taylor+swift&limit=28";

        HttpClient client = HttpClient.newHttpClient();

        // System.out.println(URI.create(url).getPath());
        // System.out.println(URI.create(url).getHost());

        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();

        try {
            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(res.statusCode() == 200){
                System.out.println("Success");
                System.out.println(res.body());
                String data = res.body();
            }else{
                System.out.println("Fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}