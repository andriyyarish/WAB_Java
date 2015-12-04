package WAB.Service;

/**
 * Created by yarish on 12/4/2015.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// this class should take variables like url, username, password from some external file and initialize variables in target classes ny them

public class ConfigHandler {
    public static Properties getConfigProperties() {
        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("");
            property.load(fis);
            return property;
        } catch (FileNotFoundException e) {
            System.out.println("Properties file wasn't found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}