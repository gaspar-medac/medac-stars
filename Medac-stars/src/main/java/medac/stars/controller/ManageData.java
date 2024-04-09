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

    public static Set<User> userSet = new HashSet<User>();
    public static Set<Arena> arenaSet = new HashSet<Arena>();
    public static Set<MedacStar> medacStarSet = new HashSet<MedacStar>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static HashMap<User, Chat> chatHashMap = new HashMap<User, Chat>();   
    
    static {
        medacStarSet.add(new MedacStar("1", 10, 10, "prueba", ""));
        medacStarSet.add(new MedacStar("1", 10, 10, "prueba", ""));
        medacStarSet.add(new MedacStar("1", 10, 10, "prueba", ""));
        medacStarSet.add(new MedacStar("1", 10, 10, "prueba", ""));
    }
}
