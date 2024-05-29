package medac.stars.model; 
 
/** 
 * Clase que representa un juego entre dos equipos. 
 */ 
public class Game { 
    private Team team1; // Primer equipo 
    private Team team2; // Segundo equipo 
 
    /** 
     * Resultado del juego: 
     * 0: gana el equipo1 
     * 1: gana el equipo2 
     * 2: empate (opcional) 
     */ 
    private int result; 
 
    /** 
     * Constructor que inicializa los equipos sin el resultado. 
     * 
     * @param team1 Primer equipo 
     * @param team2 Segundo equipo 
     */ 
    public Game(Team team1, Team team2) { 
        this.team1 = team1; 
        this.team2 = team2; 
    } 
 
    /** 
     * Constructor que inicializa los equipos y el resultado. 
     * 
     * @param team1  Primer equipo 
     * @param team2  Segundo equipo 
     * @param result Resultado del juego 
     */ 
    public Game(Team team1, Team team2, int result) { 
        this.team1 = team1; 
        this.team2 = team2; 
        this.result = result; 
    } 
 
    /** 
     * Obtener el primer equipo. 
     * 
     * @return Primer equipo 
     */ 
    public Team getTeam1() { 
        return team1; 
    } 
 
    /** 
     * Establecer el primer equipo. 
     * 
     * @param team1 Primer equipo 
     */ 
    public void setTeam1(Team team1) { 
        this.team1 = team1; 
    } 
 
    /** 
     * Obtener el segundo equipo. 
     * 
     * @return Segundo equipo 
     */ 
    public Team getTeam2() { 
        return team2; 
    } 
 
    /** 
     * Establecer el segundo equipo. 
     * 
     * @param team2 Segundo equipo 
     */ 
    public void setTeam2(Team team2) { 
        this.team2 = team2; 
    } 
 
    /** 
     * Obtener el resultado del juego. 
     * 
     * @return Resultado del juego 
     */ 
    public int getResult() { 
        return result; 
    } 
 
    /** 
     * Establecer el resultado del juego. 
     * 
     * @param result Resultado del juego 
     */ 
    public void setResult(int result) { 
        this.result = result; 
    } 
} 
    

