package medac.stars.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import medac.stars.model.Arena;
import medac.stars.model.Chat;
import medac.stars.model.Game;
import medac.stars.model.MedacStar;
import medac.stars.model.Message;
import medac.stars.model.User;

/**
 *
 * @author gaspar
 */
public class ManageData {

    public static Set<User> userSet = new HashSet<User>();
    public static Set<Arena> arenaSet = new HashSet<Arena>();
    public static Set<MedacStar> medacStarSet = new HashSet<MedacStar>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static HashMap<String, Chat> chatHashMap = new HashMap<String, Chat>();

    public static Chat chat = new Chat();

    static {
        User usu1 = new User("HERMANO", "111", "", 0);
        User usu2 = new User("PRIMO", "111", "", 0);
        User usu3 = new User("SAMUEL", "111", "", 0);
        User usu4 = new User("ALEJANDRO", "111", "", 0);
        User usu5 = new User("Heredia forever", "111", "", 0);

        ArrayList<Message> mensajes = new ArrayList<>();
        mensajes.add(new Message("blab", usu1, usu2));
        chat = new Chat(mensajes);

        String chatKey1 = usu1.getName() + "-" + usu2.getName();
        String chatKey2 = usu1.getName() + "-" + usu3.getName();
        String chatKey3 = usu1.getName() + "-" + usu4.getName();
        String chatKey4 = usu1.getName() + "-" + usu5.getName();

        Chat chat1 = new Chat();
        ArrayList messages1 = new ArrayList();
        ManageData.chat.getMessages().add(new Message("Yeee", usu1, usu2));
        messages1.add(new Message("klk?", usu2, usu1));
        messages1.add(new Message("¿Le damos al competi?", usu1, usu2));
        messages1.add(new Message("D1", usu2, usu1));
        messages1.add(new Message("Me piro, eres to malo jurao", usu1, usu2));
        messages1.add(new Message("Qué ladras parguela", usu2, usu1));
        messages1.add(new Message("No juego más contigo", usu2, usu1));
        messages1.add(new Message("Comeme los huevos", usu1, usu2));
        chat1.setMessages(messages1);
        
        Chat chat2 = new Chat();
        ArrayList messages = new ArrayList();
        ManageData.chat.getMessages().add(new Message("Yeee", usu1, usu2));
        messages.add(new Message("klk?", usu2, usu1));
        messages.add(new Message("¿Le asdfasdfasdf competi?", usu1, usu2));
        messages.add(new Message("sssssssD1", usu2, usu1));
        messages.add(new Message("Me pissssssro, eres to malo jurao", usu1, usu2));
        messages.add(new Message("Qué ladras parguela", usu2, usu1));
        messages.add(new Message("No juego más contigo", usu2, usu1));
        messages.add(new Message("Comeme los huevos", usu1, usu2));
        chat2.setMessages(messages);
        
        chatHashMap.put(chatKey1, chat1);
        chatHashMap.put(chatKey2, chat2);
        chatHashMap.put(chatKey3, chat1);
        chatHashMap.put(chatKey4, chat1);
        
        
        chatHashMap.get(chatKey1);

    }

}
