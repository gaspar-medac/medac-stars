package medac.stars.model;

import java.util.ArrayList;

/**
 * @author gaspar
 */
public class Chat {

    private final ArrayList<Message> messages;
    public User user1;
    public User user2;

    public Chat(User user1, User user2) {
        this.messages = new ArrayList<>();
        this.user1 = user1;
        this.user2 = user2;
    }

    public Chat(ArrayList messages) {
        this.messages = messages;
    }

    public ArrayList getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

}
