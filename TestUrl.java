import java.util.Arrays;
import java.util.List;

/**
 * Created by Arindam on 7/16/2015.
 */
public class TestUrl {

public static void main(String args[]){
    String url ="https://www.google.com,https://www.youtube.com,https://www.linkedin.com";

    List<String> elephantList = Arrays.asList(url.split(","));
   String temp = null;
    for (int i=0;i<elephantList.size();i++){
        temp = elephantList.get(i);
        System.out.println(i+" "+temp);
    }



}

}
