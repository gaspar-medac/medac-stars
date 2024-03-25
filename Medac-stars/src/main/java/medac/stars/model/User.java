/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

/**
 *
 * @author gaspar
 */
public class User {

    private String name;
    private String password;
    private String email;
    /**
     * 0 -> Manager/gestor 1 -> Player/jugador
     */
    private int type;

    public User(String name, String password, String email, int type) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 0 -> Manager/gestor 1 -> Player/jugador
     * @return 
     */
    public int getType() {
        return type;
    }

    /**
     * 0 -> Manager/gestor 1 -> Player/jugador
     * @param type el valor que tiene que valer el tipo
     */
    public void setType(int type) {
        this.type = type;
    }
    
    
}
