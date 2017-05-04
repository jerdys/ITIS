package ProductAndPriceParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jerdys on 04.05.17.
 */
public class Main {
    public static void main(String[] args) {
        URL url;
        InputStream inputStream = null;
        BufferedReader bufferedReader;
        String line, html = "";
        final String PRICE = "";
        Pattern pattern = Pattern.compile("(?<=\\<span class=\"price\"\\>)(.+?)(?=\\<\\/span\\>)");
        Matcher matcher;

        try {
            url = new URL("http://www.asos.com/men/sunglasses/cat/?cid=6519");
            inputStream = url.openStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            while ((line = bufferedReader.readLine()) != null) {
                matcher = pattern.matcher(line);

                if (matcher.find()) {
                    System.out.println(matcher.group(1));
                }
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
