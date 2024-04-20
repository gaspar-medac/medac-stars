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
 
@author gaspar*/
public class ManageData {

    public static ArrayList<User> userSet = new ArrayList<User>();
    public static Set<Arena> arenaSet = new HashSet<Arena>();
    public static Set<MedacStar> medacStarSet = new HashSet<MedacStar>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static HashMap<User, Chat> chatHashMap = new HashMap<User, Chat>();    
    
    static {
        arenaSet.add(new Arena("arena1", false, "bla", null, 10));
        arenaSet.add(new Arena("arena2", false, "bla", null, 10));
        arenaSet.add(new Arena("arena3", false, "bla", null, 10));
        arenaSet.add(new Arena("arena4", false, "bla", null, 10));
        arenaSet.add(new Arena("arena5", false, "bla", null, 10));
        arenaSet.add(new Arena("arena6", false, "bla", null, 10));
        arenaSet.add(new Arena("arena7", false, "bla", null, 10));
        arenaSet.add(new Arena("arena8", false, "bla", null, 10));
        arenaSet.add(new Arena("arena9", false, "bla", null, 10));
        arenaSet.add(new Arena("arena10", false, "bla", null, 10));
        arenaSet.add(new Arena("arena11", false, "bla", null, 10));
        arenaSet.add(new Arena("arena12", false, "bla", null, 10));

        
    }

    static {
        userSet.add(new User("Usuario1", "1", "", 0));
        userSet.add(new User("Usuario2", "2", "", 0));
        userSet.add(new User("Gestor1", "1", "", 1));
        userSet.add(new User("Gestor2", "2", "", 1));
    }
}
