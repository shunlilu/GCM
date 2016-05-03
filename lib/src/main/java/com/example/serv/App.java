package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCORU3-ib4_9cSCKAzTs3Ecj4l-N9QwKf0";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bE9XkUJnpTaNbdMbMWX4gzWF8uNIbK02pB-g6fbZbuwDuvNvB4-OL7633OyJcor7gm5XnApfefoySb6WRmkirpC-_SWXnNFdeG41x7nWNK-q5RwUaaUgiqcZkUMONM9yj3PW7T5");

        c.createData("Working!!", "Test message");

        return c;
    }
}

