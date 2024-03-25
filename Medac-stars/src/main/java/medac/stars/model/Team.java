/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

/**
 *
 * @author gaspar
 */
public class Team {

    private User player1;
    private MedacStar medacStar1;
    private User player2;
    private MedacStar medacStar2;

    public Team(User player1, MedacStar medacStar1, User player2, MedacStar medacStar2) {
        this.player1 = player1;
        this.medacStar1 = medacStar1;
        this.player2 = player2;
        this.medacStar2 = medacStar2;
    }

    public User getPlayer1() {
        return player1;
    }

    public void setPlayer1(User player1) {
        this.player1 = player1;
    }

    public MedacStar getMedacStar1() {
        return medacStar1;
    }

    public void setMedacStar1(MedacStar medacStar1) {
        this.medacStar1 = medacStar1;
    }

    public User getPlayer2() {
        return player2;
    }

    public void setPlayer2(User player2) {
        this.player2 = player2;
    }

    public MedacStar getMedacStar2() {
        return medacStar2;
    }

    public void setMedacStar2(MedacStar medacStar2) {
        this.medacStar2 = medacStar2;
    }
    
    

}
