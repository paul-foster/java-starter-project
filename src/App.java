import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            // create a client
            HttpClient client = HttpClient.newHttpClient();

            // For complete documentation on the FRC API, See https://frc-api-docs.firstinspires.org/?version=ce5fcb39-f244-4e6c-b1c9-74205ac45eb9
            //
            // Some helpful info:
            //      Event Codes:  FLOR = Orlando Regional, FLTA = Tallahassee Regional

            // create a request
            HttpRequest request = HttpRequest.newBuilder(
                    URI.create("https://frc-api.firstinspires.org/v2.0/2023/matches/FLOR?teamNumber=8324"))        
                    .header("accept", "application/json")
                    .header("Authorization", "Basic <REPLACE WITH YOUR AUTH TOKEN>")
                    .build();

            // use the client to send the request and put the response in a String
            String response = client.send(request, BodyHandlers.ofString()).body();

            // the response:
            System.out.println(response);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}