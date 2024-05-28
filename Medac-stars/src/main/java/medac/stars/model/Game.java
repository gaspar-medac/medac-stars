/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

/**
 * Clase que representa un juego entre dos equipos.
 * Permite almacenar y obtener los equipos y el resultado del juego.
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

    // Constructor que inicializa los equipos sin el resultado
    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Constructor que inicializa los equipos y el resultado
    public Game(Team team1, Team team2, int result) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
    }

    // Obtener el primer equipo
    public Team getTeam1() {
        return team1;
    }

    // Establecer el primer equipo
    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    // Obtener el segundo equipo
    public Team getTeam2() {
        return team2;
    }

    // Establecer el segundo equipo
    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    // Obtener el resultado del juego
    public int getResult() {
        return result;
    }

    // Establecer el resultado del juego
    public void setResult(int result) {
        this.result = result;
    }
}
