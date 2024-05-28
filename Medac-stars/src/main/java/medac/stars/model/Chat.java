package medac.stars.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un chat, compuesto por una lista de mensajes.
 * 
 * @autor gaspar
 */
public class Chat {

    private List<Message> messages; // Lista de mensajes en el chat

    /**
     * Constructor que inicializa una lista vacía de mensajes.
     */
    public Chat() {
        this.messages = new ArrayList<>();
    }

    /**
     * Constructor que inicializa el chat con una lista dada de mensajes.
     * 
     * @param messages Lista de mensajes inicial
     */
    public Chat(List<Message> messages) {
        this.messages = messages;
    }

    /**
     * Obtener la lista de mensajes.
     * 
     * @return Lista de mensajes
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * Establecer la lista de mensajes.
     * 
     * @param messages Lista de mensajes
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
