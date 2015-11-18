package rakesh;

import java.io.FileInputStream;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Created by rakeshprabhakaran on 18/11/2015.
 */
public class Prop {

    public static void main(String[] args){

        FileInputStream fileInputStream;
        String dir =System.getProperty("user.dir");
        System.out.println(dir);
        try {

            System.out.println("test");

            fileInputStream= new FileInputStream(dir+"/src/Text.properties");

            ResourceBundle resourceBundle= new PropertyResourceBundle(fileInputStream);
            String url = resourceBundle.getString("url");
            System.out.println("url is "+url );

        }catch (Exception e){

            e.printStackTrace();
        }

    }
}
