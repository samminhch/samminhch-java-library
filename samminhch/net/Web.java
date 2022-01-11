package samminhch.net;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The Web class contains functions for fetching things from websites.
 *
 * @author samminhch
 * @since January 11, 2022
 */
public class Web {

    /**
     * Fetch data from a URL.
     *
     * @param websiteURL the website url
     * @return the website data
     */
    public static String fetchFromURL(String websiteURL) {
        StringBuilder webData = new StringBuilder();
        try {
            URL url = new URL(websiteURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = reader.readLine();
            while (line != null) {
                webData.append(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return webData.toString();
    }
}
