package com.github.revisiteduser0.discrod_bot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
    }
}

class BotConfiguration {
    private static String token;

    private static Properties properties = new Properties();

    private static void readToken() throws IOException {
        FileInputStream fis = new FileInputStream("token.env");
        properties.load(fis);
        BotConfiguration.token = properties.getProperty("DISCORD_TOKEN");


    }
    public static String getToken() {
        return BotConfiguration.token;
    }
}