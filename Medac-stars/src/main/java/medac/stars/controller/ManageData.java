package medac.stars.controller;

import java.awt.List;
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
 * @author C28p1Q
 */
public class ManageData {

    public static Set<User> userSet = new HashSet<User>();
    public static Set<Arena> arenaSet = new HashSet<Arena>();
    public static ArrayList<MedacStar> medacStarSet = new ArrayList<>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static HashMap<User, Chat> chatHashMap = new HashMap<User, Chat>();   
    
    static {
        medacStarSet.add(new MedacStar("Julio", 1, 2, "prueba1", ""));
        medacStarSet.add(new MedacStar("Alberta", 10, 5, "prueba2", ""));
        medacStarSet.add(new MedacStar("Ortencia", 7, 10, "prueba3", ""));
        medacStarSet.add(new MedacStar("Pechugas Laru", 100, 10, "prueba4", ""));
    }
}
