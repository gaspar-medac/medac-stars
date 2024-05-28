package medac.stars.model;

/**
 * Clase que representa un equipo compuesto por dos jugadores y dos MedacStars.
 * 
 * @autor gaspar
 */
public class Team {
    private User player1;        // Primer jugador
    private MedacStar medacStar1; // Primer MedacStar
    private User player2;        // Segundo jugador
    private MedacStar medacStar2; // Segundo MedacStar

    /**
     * Constructor que inicializa los jugadores y sus MedacStars.
     *
     * @param player1    Primer jugador
     * @param medacStar1 Primer MedacStar
     * @param player2    Segundo jugador
     * @param medacStar2 Segundo MedacStar
     */
    public Team(User player1, MedacStar medacStar1, User player2, MedacStar medacStar2) {
        this.player1 = player1;
        this.medacStar1 = medacStar1;
        this.player2 = player2;
        this.medacStar2 = medacStar2;
    }

    /**
     * Obtener el primer jugador.
     *
     * @return Primer jugador
     */
    public User getPlayer1() {
        return player1;
    }

    /**
     * Establecer el primer jugador.
     *
     * @param player1 Primer jugador
     */
    public void setPlayer1(User player1) {
        this.player1 = player1;
    }

    /**
     * Obtener el primer MedacStar.
     *
     * @return Primer MedacStar
     */
    public MedacStar getMedacStar1() {
        return medacStar1;
    }

    /**
     * Establecer el primer MedacStar.
     *
     * @param medacStar1 Primer MedacStar
     */
    public void setMedacStar1(MedacStar medacStar1) {
        this.medacStar1 = medacStar1;
    }

    /**
     * Obtener el segundo jugador.
     *
     * @return Segundo jugador
     */
    public User getPlayer2() {
        return player2;
    }

    /**
     * Establecer el segundo jugador.
     *
     * @param player2 Segundo jugador
     */
    public void setPlayer2(User player2) {
        this.player2 = player2;
    }

    /**
     * Obtener el segundo MedacStar.
     *
     * @return Segundo MedacStar
     */
    public MedacStar getMedacStar2() {
        return medacStar2;
    }

    /**
     * Establecer el segundo MedacStar.
     *
     * @param medacStar2 Segundo MedacStar
     */
    public void setMedacStar2(MedacStar medacStar2) {
        this.medacStar2 = medacStar2;
    }
}
