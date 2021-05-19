package com.example.sandr0_shanshiashvili_davaleba_1;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@ServerEndpoint("/chatbot")
public class ChatBotController {

    public ChatBotController(){}

    @OnOpen
    public void handleOpen() {
        System.out.println("დაკავშირება ...");
    }

    @OnMessage
    public String handleMessage(String message) {
        System.out.println("კლიენტი : " + message);
        String replayMessage = ChatBotService.answer(message);
        System.out.println("სერვერი : " + replayMessage);
        return replayMessage;
    }

    @OnClose
    public void handleClose() {
        System.out.println("End Connection ...");
    }



    @GET
    @Path("/api/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeathers() {
        List<Weather> weatherList=new ArrayList<>();
        return weatherList;
    }

    @GET
    @Path("/api/weather/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeather(@PathParam("city") String city) {
        return new Weather();
    }
}