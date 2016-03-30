import java.util.Arrays;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Arindam on 7/16/2015.
 */
public class TestUrlPing {

    public static void main(String args[]) {
        String url_input = "https://www.google.com";
        try {
            URL url = new URL(url_input);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            String res_msg = connection.getResponseMessage();
            System.out.println(url_input+" "+"says"+" "+res_msg+" "+code+" "+"Success");

        } catch (Exception e) {

        }

    }
}
