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
        arenaSet.add(new Arena("arena1", false, "bla", "", 10));
        arenaSet.add(new Arena("arena2", false, "bla", "", 10));
        arenaSet.add(new Arena("arena3", false, "bla", "", 10));
        arenaSet.add(new Arena("arena4", false, "bla", "", 10));
        arenaSet.add(new Arena("arena5", false, "bla", "", 10));
        arenaSet.add(new Arena("arena6", false, "bla", "", 10));
        arenaSet.add(new Arena("arena7", false, "bla", "", 10));
        arenaSet.add(new Arena("arena8", false, "bla", "", 10));
        arenaSet.add(new Arena("arena9", false, "bla", "", 10));
        arenaSet.add(new Arena("arena10", false, "bla", "", 10));
        arenaSet.add(new Arena("arena11", false, "bla", "", 10));
        arenaSet.add(new Arena("arena12", false, "bla", "", 10));
        
        
    }
}
