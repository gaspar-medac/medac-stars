/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import medac.stars.controller.ManageData;
import medac.stars.model.Message;
import medac.stars.model.User;

public class ChatInterfaz extends javax.swing.JFrame {

    User usuarioLogeado = new User("HERMANO", "111", "", 0);
    User usu1 = new User("HERMANO", "111", "", 0);
    User usu2 = new User("PRIMO", "111", "", 0);

    ArrayList<Message> messages1 = new ArrayList();
    ArrayList messages2 = new ArrayList();
    ArrayList messages3 = new ArrayList();
    ArrayList messages4 = new ArrayList();
    ArrayList messagesAuxiliar;
    

    /**
     * Creates new form ChatInterfaz
     */
    public ChatInterfaz() {
        initComponents();
        tEscribirMensaje.setText("Texto");
        bEnviar.setText("Enviar");
        bUsuario1.setText("Usuario 1");
        bUsuario2.setText("Usuario 2");
        bUsuario3.setText("Usuario 3");
        bUsuario4.setText("Uusario 4");
        bSalirAlMenú.setText("Volver al menú principal");
        tEscribirMensaje.setText("");

        messages1.add(new Message("Yeee", usu2, usuarioLogeado));
        messages1.add(new Message("klk?", usu2, usuarioLogeado));
        messages1.add(new Message("klk?", usuarioLogeado, usu2));
        messages1.add(new Message("klk?", usuarioLogeado, usu2));
        
        
        messages2.add(new Message("Yeee", usu1, usu2));
        messages2.add(new Message("klk?", usu2, usu1));
        messages2.add(new Message("¿Le damos al competi?", usu1, usu2));
        messages2.add(new Message("D1", usu2, usu1));
        messages2.add(new Message("Me piro, eres to malo jurao", usu1, usu2));
        messages2.add(new Message("Qué ladras parguela", usu2, usu1));
        messages2.add(new Message("No juego más contigo", usu2, usu1));
        messages2.add(new Message("Comeme los huevos", usu1, usu2));

        messagesAuxiliar = messages1;
        mostrarMensajes("", messages1);
        mostrarBotones();
    }

    public void mostrarBotones() {
        for (String key : ManageData.chatHashMap.keySet()) {
            JButton jButton = new javax.swing.JButton();
            jButton.setForeground(new java.awt.Color(102, 153, 255));
            jButton.setText(key);
            jButton.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    pChat.removeAll();
                    //ArrayList<Message> messages = ManageData.chatHashMap.get("");
                    mostrarMensajes(e.getActionCommand(), null);
                    JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
                    verticalScrollBar.setValue(verticalScrollBar.getMaximum());
                    jScrollPane1.revalidate();
                }
            });
            jPanel2.add(jButton);
        }
    }

    public void mostrarEmisor(Message message) {
        JTextField userField = new JTextField(message.getEmisor().getName());
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

    public void mostrarReceptor(Message message) {
        JTextField userField = new JTextField(message.getEmisor().getName());
        userField.setForeground(new java.awt.Color(184, 41, 40));
        userField.setVisible(true);
        userField.setBackground(Color.WHITE);
        userField.setEditable(false);
        userField.setMaximumSize(new Dimension(Integer.MAX_VALUE, userField.getPreferredSize().height));
        userField.setBorder(null);
        pChat.add(userField);
        userField.setFont(new Font("Arial", Font.ITALIC, 14));

    }

    public void mostrarMensajesRecibido(Message message) {
        JTextField messageField = new JTextField(message.getMessageText());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setForeground(new java.awt.Color(0, 0, 0));
        messageField.setFont(new Font("Arial", Font.BOLD, 14));;

        pChat.add(messageField);
    }

    public void mostrarMensajeEnviado(Message message) {
        JTextField messageField = new JTextField(message.getMessageText());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setHorizontalAlignment(SwingConstants.RIGHT);
        messageField.setFont(new Font("Arial", Font.BOLD, 14));

        pChat.add(messageField);
    }

    public void mostrarMensaje(Message message) {

        if (usuarioLogeado.getName().equals(message.getEmisor().getName())) {
            mostrarEmisor(message);
            mostrarMensajeEnviado(message);
        } else {
            mostrarReceptor(message);
            mostrarMensajesRecibido(message);
        }

        // Agrega espacio entre los mensajes
        pChat.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void mostrarMensajes(String key, ArrayList<Message> messages) {
        if (key.isEmpty()) {
            ArrayList<Message> messageList = ManageData.chat.getMessages();
            for (Message message : messageList) {
                mostrarMensaje(message);
            }
        } else {

            for (Message message : messages) {
                mostrarMensaje(message);
            }
            System.out.println(key);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        bUsuario1 = new javax.swing.JButton();
        bUsuario2 = new javax.swing.JButton();
        bUsuario3 = new javax.swing.JButton();
        bUsuario4 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tEscribirMensaje.setText("jTextField1");
        tEscribirMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEscribirMensajeActionPerformed(evt);
            }
        });

        bEnviar.setForeground(new java.awt.Color(102, 153, 255));
        bEnviar.setText("jButton1");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });

        pChat.setBackground(new java.awt.Color(255, 255, 255));
        pChat.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(pChat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tEscribirMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEnviar)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEscribirMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bSalirAlMenú.setBackground(new java.awt.Color(255, 0, 0));
        bSalirAlMenú.setForeground(new java.awt.Color(255, 153, 153));
        bSalirAlMenú.setText("jButton6");

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 30, 40));

        bUsuario1.setBackground(new java.awt.Color(204, 204, 204));
        bUsuario1.setText("jButton2");
        bUsuario1.setAutoscrolls(true);
        bUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuario1ActionPerformed(evt);
            }
        });
        jPanel2.add(bUsuario1);

        bUsuario2.setBackground(new java.awt.Color(204, 204, 204));
        bUsuario2.setText("jButton3");
        bUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuario2ActionPerformed(evt);
            }
        });
        jPanel2.add(bUsuario2);

        bUsuario3.setBackground(new java.awt.Color(204, 204, 204));
        bUsuario3.setText("jButton4");
        bUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuario3ActionPerformed(evt);
            }
        });
        jPanel2.add(bUsuario3);

        bUsuario4.setBackground(new java.awt.Color(204, 204, 204));
        bUsuario4.setText("jButton5");
        bUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuario4ActionPerformed(evt);
            }
        });
        jPanel2.add(bUsuario4);

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalirAlMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(bSalirAlMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuario1ActionPerformed
        pChat.removeAll();
        mostrarMensajes("", messages1);
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
        jScrollPane1.revalidate();

    }//GEN-LAST:event_bUsuario1ActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        // TODO add your handling code here:

        System.out.println("Aquí añadimos mensajes");
        Message message = new Message(tEscribirMensaje.getText(), usu2, usuarioLogeado);
        messagesAuxiliar.add(message);
        mostrarMensaje(message);
        tEscribirMensaje.setText("");
        tEscribirMensaje.setCaretPosition(tEscribirMensaje.getDocument().getLength());
        jScrollPane1.revalidate();
    }//GEN-LAST:event_bEnviarActionPerformed

    private void tEscribirMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEscribirMensajeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tEscribirMensajeActionPerformed

    private void bUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuario2ActionPerformed
        pChat.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("HUCHA", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("A JUGAR YA!!", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("vooooy capullo", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("", usuarioLogeado, usu2));
        mostrarMensajes("", messages3);
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
        jScrollPane1.revalidate();

    }//GEN-LAST:event_bUsuario2ActionPerformed

    private void bUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuario3ActionPerformed
        pChat.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("Bebesitaaa", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("activo?", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("uuuuaaa?", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("vamo a darle", usuarioLogeado, usu2));
        mostrarMensajes("", messages1);
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());// TODO add your handling code here:
        jScrollPane1.revalidate();

    }//GEN-LAST:event_bUsuario3ActionPerformed

    private void bUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuario4ActionPerformed
        pChat.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("Hola", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("pvp?", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("qva tt", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("mañana", usuarioLogeado, usu2));
        mostrarMensajes("", messages4);
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());// TODO add your handling code here:
        jScrollPane1.revalidate();

    }//GEN-LAST:event_bUsuario4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatInterfaz().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEnviar;
    private javax.swing.JButton bSalirAlMenú;
    private javax.swing.JButton bUsuario1;
    private javax.swing.JButton bUsuario2;
    private javax.swing.JButton bUsuario3;
    private javax.swing.JButton bUsuario4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pChat;
    private javax.swing.JTextField tEscribirMensaje;
    // End of variables declaration//GEN-END:variables

}
