package medac.stars.ui.chat;

import medac.stars.config.Hibernate;
import medac.stars.controller.ManageData;
import medac.stars.entity.Chat;
import medac.stars.entity.Message;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ChatInterfaz extends javax.swing.JFrame {
    private javax.swing.JButton bEnviar;
    private javax.swing.JButton bSalirAlMenú;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pChat;
    private javax.swing.JTextField tEscribirMensaje;

    private List<Chat> chats;
    private Chat currentChat;
    private Timer refreshTimer;

    public ChatInterfaz() {
        initComponents();
        initUsersAndMessages();
        mostrarBotones();
        setupRefreshTimer();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ChatInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new ChatInterfaz().setVisible(true));
    }

    private void setupRefreshTimer() {
        refreshTimer = new Timer(800, e -> fetchNewMessagesAndChats());
        refreshTimer.start();
    }

    private void fetchNewMessagesAndChats() {
        Hibernate.refreshSession();

        if (currentChat != null) {
            Chat refreshedChat = Hibernate.session.get(Chat.class, currentChat.getId());

            if (currentChat.getMessages().size() != refreshedChat.getMessages().size()) {
                currentChat.setMessages(refreshedChat.getMessages());
                pChat.removeAll();
                mostrarMensajes(currentChat.getMessages());
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
            }
        }

        List<Chat> refreshedChats = Hibernate.session.createQuery("from Chat where user1 = :user or user2 = :user", Chat.class).setParameter("user", ManageData.currentUser.getName()).getResultList();

        if (chats.size() != refreshedChats.size()) {
            chats = refreshedChats;
            mostrarBotones();
        }

        Hibernate.session.close();
    }

    private void initUsersAndMessages() {
        // Get all chats where we are involved from database
        chats = Hibernate.session.createQuery("from Chat where user1 = :user or user2 = :user", Chat.class).setParameter("user", ManageData.currentUser.getName()).getResultList();

        // Close the session
        Hibernate.session.close();
    }

    private void mostrarBotones() {
        jPanel2.removeAll();
        for (int i = 0; i < chats.size(); i++) {
            Chat chat = chats.get(i);
            JButton jButton = new JButton(chat.getUser1() + " - " + chat.getUser2());
            jButton.addActionListener(e -> {
                currentChat = chat;
                pChat.removeAll();
                mostrarMensajes(chat.getMessages());
                jScrollPane1.revalidate();
            });
            jPanel2.add(jButton);
        }
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private void mostrarEmisor(Message message) {
        JTextField userField = new JTextField(message.getSender());
        userField.setVisible(true);
        userField.setBackground(Color.WHITE);
        userField.setEditable(false);
        userField.setMaximumSize(new Dimension(Integer.MAX_VALUE, userField.getPreferredSize().height));
        userField.setBorder(null);
        userField.setForeground(new java.awt.Color(212, 175, 55));
        userField.setHorizontalAlignment(SwingConstants.RIGHT);
        userField.setFont(new Font("Arial", Font.ITALIC, 14));
        pChat.add(userField);
    }

    private void mostrarReceptor(Message message) {
        JTextField userField = new JTextField(message.getReceiver());
        userField.setForeground(new java.awt.Color(30, 144, 255));
        userField.setVisible(true);
        userField.setBackground(Color.WHITE);
        userField.setEditable(false);
        userField.setMaximumSize(new Dimension(Integer.MAX_VALUE, userField.getPreferredSize().height));
        userField.setBorder(null);
        pChat.add(userField);
        userField.setFont(new Font("Arial", Font.ITALIC, 14));
    }

    private void mostrarMensajesRecibido(Message message) {
        JTextField messageField = new JTextField(message.getMessage());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setForeground(new java.awt.Color(0, 0, 0));
        messageField.setFont(new Font("Arial", Font.BOLD, 14));
        pChat.add(messageField);
    }

    private void mostrarMensajeEnviado(Message message) {
        JTextField messageField = new JTextField(message.getMessage());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setHorizontalAlignment(SwingConstants.RIGHT);
        messageField.setFont(new Font("Arial", Font.BOLD, 14));
        pChat.add(messageField);
    }

    private void mostrarMensaje(Message message) {
        if (message.getSender().equals(ManageData.currentUser.getName())) {
            mostrarEmisor(message);
            mostrarMensajeEnviado(message);
        } else {
            mostrarReceptor(message);
            mostrarMensajesRecibido(message);
        }
        pChat.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void mostrarMensajes(List<Message> messages) {
        for (Message message : messages) {
            mostrarMensaje(message);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tEscribirMensaje = new javax.swing.JTextField();
        bEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pChat = new javax.swing.JPanel();
        bSalirAlMenú = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tEscribirMensaje.setText("Escribe un mensaje...");
        tEscribirMensaje.addActionListener(evt -> tEscribirMensajeActionPerformed());

        bEnviar.setForeground(new java.awt.Color(102, 153, 255));
        bEnviar.setText("Enviar");
        bEnviar.addActionListener(evt -> bEnviarActionPerformed());

        pChat.setBackground(new java.awt.Color(255, 255, 255));
        pChat.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(pChat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(tEscribirMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(bEnviar).addGap(30, 30, 30)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(20, 20, 20)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tEscribirMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(bEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));

        bSalirAlMenú.setBackground(new java.awt.Color(255, 0, 0));
        bSalirAlMenú.setForeground(new java.awt.Color(255, 153, 153));
        bSalirAlMenú.setText("Volver al menú principal");
        bSalirAlMenú.addActionListener(evt -> bSalirAlMenúActionPerformed());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 30, 40));
        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(bSalirAlMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(140, 140, 140).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(161, 161, 161)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(124, 124, 124).addComponent(bSalirAlMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jScrollPane2).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap(355, Short.MAX_VALUE)));

        pack();
    }

    private void bEnviarActionPerformed() {
        if (currentChat == null) {
            JOptionPane.showMessageDialog(this, "Select a chat first!");
            return;
        }

        Hibernate.refreshSession();

        String receiver = currentChat.getUser1().equals(ManageData.currentUser.getName()) ? currentChat.getUser2() : currentChat.getUser1();

        // Create a new message with the dynamically set receiver
        Message message = new Message(tEscribirMensaje.getText(), ManageData.currentUser.getName(), receiver);
        currentChat.getMessages().add(message);

        // Display the message in the chat interface
        mostrarMensaje(message);

        // Clear the input field
        tEscribirMensaje.setText("");
        tEscribirMensaje.setCaretPosition(tEscribirMensaje.getDocument().getLength());

        // Refresh the scroll pane
        jScrollPane1.revalidate();

        // Save the message to the database
        saveMessage();
    }

    private void saveMessage() {
        // Reopen the session if it's closed
        Hibernate.refreshSession();

        // Begin transaction
        Hibernate.session.beginTransaction();

        // Save or update the chat object
        Hibernate.session.saveOrUpdate(currentChat);

        // Commit transaction and close the session
        Hibernate.session.getTransaction().commit();
        Hibernate.session.close();
    }


    private void tEscribirMensajeActionPerformed() {
    }

    private void bSalirAlMenúActionPerformed() {
        this.dispose();
    }
}
