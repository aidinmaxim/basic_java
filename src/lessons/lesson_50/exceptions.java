package lessons.lesson_50;

import java.net.MalformedURLException;
import java.net.URL;

public class exceptions {
    URL url;

    {
        try {
            url = new URL("htps://example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
