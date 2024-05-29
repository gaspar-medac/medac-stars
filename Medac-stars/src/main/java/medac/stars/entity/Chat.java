package medac.stars.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user1")
    private String user1;

    @Column(name = "user2")
    private String user2;

    @ElementCollection
    @CollectionTable(name = "messages", joinColumns = @JoinColumn(name = "chat_id"))
    @AttributeOverrides({@AttributeOverride(name = "message", column = @Column(name = "message_text")), @AttributeOverride(name = "receiver", column = @Column(name = "receiver_username")), @AttributeOverride(name = "sender", column = @Column(name = "sender_username")), @AttributeOverride(name = "date", column = @Column(name = "message_date"))})
    private List<Message> messages;

    public Chat(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public Chat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", user1='" + user1 + '\'' + ", user2='" + user2 + '\'' + '}';
    }
}