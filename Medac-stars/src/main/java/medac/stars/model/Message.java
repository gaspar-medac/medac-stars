/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medac.stars.model;

/**
 *
 * @author gaspar
 */
public class Message {

    private String messageText;
    private User receptor;
    private User emisor;

    public Message(String messageText, User receptor, User emisor) {
        this.messageText = messageText;
        this.receptor = receptor;
        this.emisor = emisor;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getReceptor() {
        return receptor;
    }

    public void setReceptor(User receptor) {
        this.receptor = receptor;
    }

    public User getEmisor() {
        return emisor;
    }

    public void setEmisor(User emisor) {
        this.emisor = emisor;
    }
    
    

}
