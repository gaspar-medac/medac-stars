package medac.stars.model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author gaspar
 */
public class Chat {

    private ArrayList<Message> messages;

    
    public Chat() {
        this.messages = new ArrayList<>();
    }
    public Chat(ArrayList  messages) {
        this.messages = messages;
    }

    public ArrayList getMessages() {
        return messages;
    }

    public void setMessages(ArrayList messages) {
        this.messages = messages;
    }

}
