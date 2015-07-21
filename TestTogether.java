import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Created by AR277544 on 7/16/2015.
 */
public class New_test {

    public static void main(String args[]){
        String url_input ="https://www.google.com,https://www.youtube.com,https://www.linkedin.com,https://www.yahoo.co.in";

        List<String> elephantList = Arrays.asList(url_input.split(","));
        String temp = null;
        HashMap<String,String> hmap = new HashMap<String,String>();
        System.out.println(elephantList.size());
        for (int i=0;i<elephantList.size();i++){
            temp = elephantList.get(i);
            try {
                URL url = new URL(temp);
                HttpURLConnection connection = (HttpURLConnection)url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                Integer code = connection.getResponseCode();
                String res_msg = connection.getResponseMessage();
                System.out.println(temp+" "+"says"+" "+res_msg+" "+code.toString()+" "+"Success");
                hmap.put(temp,code.toString());
            } catch (Exception e) {
                 String msg= e.getMessage();
                
                hmap.put(temp ,msg);
            }
        }

        Iterator it = hmap.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry)it.next();

            System.out.println("Hi I am hash map ."+" "+"I have "+pair.getKey()+" "+pair.getValue());
        }





    }

}
