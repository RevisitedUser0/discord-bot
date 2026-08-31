package com.github.revisiteduser0.discrod_bot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        try {
            JDA jda = JDABuilder.createLight(BotConfiguration.getToken(), GatewayIntent.GUILD_MEMBERS)
                    .build()
                    .awaitReady();
        } catch (InterruptedException e) {
            System.err.println("Поток был прерван во время ожидания готовности JDA");
            Thread.currentThread().interrupt();
        }
    }
}