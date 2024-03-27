package medac.stars.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import medac.stars.model.Arena;
import medac.stars.model.Chat;
import medac.stars.model.Game;
import medac.stars.model.MedacStar;
import medac.stars.model.User;

/**
 *
 * @author gaspar
 */
public class ManageData {

    public static ArrayList<User> userSet = new ArrayList<User>();
    public static Set<Arena> arenaSet = new HashSet<Arena>();
    public static Set<MedacStar> medacStarSet = new HashSet<MedacStar>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static HashMap<User, Chat> chatHashMap = new HashMap<User, Chat>();

    static {
        userSet.add(new User("nombre", "1", "", 0));
        userSet.add(new User("Carlos", "1", "", 0));
        userSet.add(new User("Cristian", "1", "", 0));
        userSet.add(new User("Cristian2", "1", "", 0));
    }
}
