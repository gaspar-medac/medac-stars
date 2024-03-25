/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

/**
 *
 * @author gaspar
 */
public class Arena {

    String name;
    boolean countdown;
    String description;
    String image;
    int barriers;

    public Arena(String name, boolean countdown, String description, String image, int barriers) {
        this.name = name;
        this.countdown = countdown;
        this.description = description;
        this.image = image;
        this.barriers = barriers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCountdown() {
        return countdown;
    }

    public void setCountdown(boolean countdown) {
        this.countdown = countdown;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBarriers() {
        return barriers;
    }

    public void setBarriers(int barriers) {
        this.barriers = barriers;
    }

}
