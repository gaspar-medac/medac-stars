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
    public static HashMap<User, Chat> chatHashMap = new HashMap<User, Chat>();
    
    public static Chat chat = new Chat();

    static {
        User usu1 = new User("HERMANO", "111", "", 0);

        User usu2 = new User("PRIMO", "111", "", 0);

        ArrayList<Message> mensajes = new ArrayList<>();
        mensajes.add(new Message("blab", usu1, usu2));
        chat = new Chat(mensajes);
        chatHashMap.put(usu1, chat);
        chatHashMap.put(usu2, chat);
    }

}
