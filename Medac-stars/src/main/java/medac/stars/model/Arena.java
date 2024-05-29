/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

import javax.swing.Icon;

/**
 *
 * @author gaspar
 */
public class Arena {

    private String name;
    private boolean countdown;
    private String description;
    private Icon image;
    private int barriers;

    public Arena(String name, boolean countdown, String description, Icon image, int barriers) {
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

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public int getBarriers() {
        return barriers;
    }

    public void setBarriers(int barriers) {
        this.barriers = barriers;
    }

}
