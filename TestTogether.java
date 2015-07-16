import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Created by AR277544 on 7/16/2015.
 */
public class TestTogether {

    public static void main(String args[]){
        String url_input ="https://www.google.com,https://www.youtube.com,https://www.linkedin.com";

        List<String> elephantList = Arrays.asList(url_input.split(","));
        String temp = null;
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();

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
                hmap.put(temp,code);
            } catch (Exception e) {

            }
        }

        Iterator it = hmap.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry)it.next();

            System.out.println("Hi I am hash map ."+" "+"I have "+pair.getKey()+" "+pair.getValue());
        }





        }

}
