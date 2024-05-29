package medac.stars.controller;

import java.util.ArrayList;
import java.util.HashMap;
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

    public static ArrayList<User> userSet = new ArrayList<User>();
    public static ArrayList<Arena> arenaSet = new ArrayList<Arena>();
    public static ArrayList<MedacStar> medacStarSet = new ArrayList<MedacStar>();
    public static ArrayList<Game> gameList = new ArrayList<Game>();
    public static User currentUser = new User("HERMANO1", "111", "", 0);


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
        userSet.add(new User("nombre", "1", "nombre@gmail.com", 0));
        userSet.add(new User("Carlos", "1", "carlos@gmail.com", 0));
        userSet.add(new User("Cristian", "1", "cristian@gmail.com", 0));
        userSet.add(new User("Cristian2", "1", "cristian2@gmail.com", 0));
        userSet.add(new User("Usuario1", "1", "", 0));
        userSet.add(new User("Usuario2", "2", "", 0));
        userSet.add(new User("Gestor1", "1", "", 1));
        userSet.add(new User("Gestor2", "2", "", 1));
    }

    static {
        medacStarSet.add(new MedacStar("Julio", 1, 2, "prueba1", ""));
        medacStarSet.add(new MedacStar("Alberta", 10, 5, "prueba2", ""));
        medacStarSet.add(new MedacStar("Ortencia", 7, 10, "prueba3", ""));
        medacStarSet.add(new MedacStar("Pechugas Laru", 100, 10, "prueba4", ""));
    }
}
