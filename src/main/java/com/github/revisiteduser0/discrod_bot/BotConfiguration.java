package com.github.revisiteduser0.discrod_bot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BotConfiguration {
    private static String token;
    private static final Properties properties = new Properties();

    private static void readToken() throws IOException {
        try (FileInputStream fis = new FileInputStream("token.env")) {
            properties.load(fis);
            token = properties.getProperty("DISCORD_TOKEN");
        }
    }

    public static String getToken() {
        if (token == null) {
            try {
                readToken();
            } catch (IOException e) {
                throw new RuntimeException("Ошибка чтения токена", e);
            }
        }
        return token;
    }
}
