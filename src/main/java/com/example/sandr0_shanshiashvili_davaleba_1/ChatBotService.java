package com.example.sandr0_shanshiashvili_davaleba_1;


import java.util.ArrayList;
import java.util.List;

public class ChatBotService {
    public static String answer(String question) {
        List<Weather> result;

        switch (question) {
            case "all":
               return new ChatBotController().getWeathers().toString();
            case "Tbilisi":
                return new ChatBotController().getWeather("Tbilisi").toString();
            case "Kutaisi":
                return new ChatBotController().getWeather("Kutaisi").toString();
            case "Batumi":
                return new ChatBotController().getWeather("Batumi").toString();
        }

        return null;
    }
}