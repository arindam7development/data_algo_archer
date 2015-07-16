import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Arindam on 7/16/2015.
 */
public class TestTogether {

    public static void main(String args[]){
        String url_input ="https://www.google.com,https://www.youtube.com,https://www.linkedin.com";

        List<String> elephantList = Arrays.asList(url_input.split(","));
        String temp = null;
        for (int i=0;i<elephantList.size();i++){
            temp = elephantList.get(i);
            try {
                URL url = new URL(temp);
                HttpURLConnection connection = (HttpURLConnection)url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int code = connection.getResponseCode();
                String res_msg = connection.getResponseMessage();
                System.out.println(temp+" "+"says"+" "+res_msg+" "+code+" "+"Success");

            } catch (Exception e) {

            }
        }



    }

}
