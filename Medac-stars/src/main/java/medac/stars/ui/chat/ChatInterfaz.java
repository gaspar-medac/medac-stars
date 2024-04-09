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

    /**
     * Creates new form ChatInterfaz
     */
    public ChatInterfaz() {
        initComponents();
        jTextField1.setText("Texto");
        jButton1.setText("Enviar");
        jButton2.setText("Usuario 1");
        jButton3.setText("Usuario 2");
        jButton4.setText("Usuario 3");
        jButton5.setText("Uusario 4");
        jButton6.setText("Volver al menú principal");
        jTextField1.setText("");

        ManageData.chat.getMessages().add(new Message("Yeee", usu1, usu2));
        ManageData.chat.getMessages().add(new Message("klk?", usu2, usu1));
        ManageData.chat.getMessages().add(new Message("¿Le damos al competi?", usu1, usu2));
        ManageData.chat.getMessages().add(new Message("D1", usu2, usu1));
        ManageData.chat.getMessages().add(new Message("Me piro, eres to malo jurao", usu1, usu2));
        ManageData.chat.getMessages().add(new Message("Qué ladras parguela", usu2, usu1));
        ManageData.chat.getMessages().add(new Message("No juego más contigo", usu2, usu1));
        ManageData.chat.getMessages().add(new Message("Comeme los huevos", usu1, usu2));

        mostrarMensajes("");
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
                    jPanel3.removeAll();
                    //ArrayList<Message> messages = ManageData.chatHashMap.get("");
                    mostrarMensajes(e.getActionCommand());
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
        userField.setForeground(new java.awt.Color(0, 102, 255));
        userField.setHorizontalAlignment(SwingConstants.RIGHT);
        userField.setFont(new Font("Arial", Font.BOLD, 14));
        jPanel3.add(userField);

    }

    public void mostrarReceptor(Message message) {
        JTextField userField = new JTextField(message.getEmisor().getName());
        userField.setForeground(new java.awt.Color(255, 153, 153));
        userField.setVisible(true);
        userField.setBackground(Color.WHITE);
        userField.setEditable(false);
        userField.setMaximumSize(new Dimension(Integer.MAX_VALUE, userField.getPreferredSize().height));
        userField.setBorder(null);
        jPanel3.add(userField);
        userField.setFont(new Font("Arial", Font.ITALIC, 14));

    }

    public void mostrarMensajesRecibido(Message message) {
        JTextField messageField = new JTextField(message.getMessageText());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setForeground(new java.awt.Color(0, 102, 255));
        messageField.setFont(new Font("Arial", Font.BOLD, 14));;

        jPanel3.add(messageField);
    }

    public void mostrarMensajeEnviado(Message message) {
        JTextField messageField = new JTextField(message.getMessageText());
        messageField.setEditable(false);
        messageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, messageField.getPreferredSize().height));
        messageField.setVisible(true);
        messageField.setBorder(null);
        messageField.setBackground(Color.white);
        messageField.setHorizontalAlignment(SwingConstants.RIGHT);
        messageField.setFont(new Font("Arial", Font.ITALIC, 14));;

        jPanel3.add(messageField);
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
        jPanel3.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void mostrarMensajes(String key) {
        if (key.isEmpty()) {
            ArrayList<Message> messageList = ManageData.chat.getMessages();
            for (Message message : messageList) {
                mostrarMensaje(message);
            }
        } else {

            ArrayList<Message> messageList = ManageData.chatHashMap.get(key).getMessages();
            for (Message message : messageList) {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 153, 153));
        jButton6.setText("jButton6");

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 30, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("jButton2");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel3.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("Yeee", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("klk?", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("klk?", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("klk?", usuarioLogeado, usu2));
        mostrarMensajes("");
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
        jScrollPane1.revalidate();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        System.out.println("Aqui añadimos mensajes");
        Message message = new Message(jTextField1.getText(), usu2, usuarioLogeado);
        ManageData.chat.getMessages().add(message);
        mostrarMensaje(message);
        jTextField1.setText("");
        jTextField1.setCaretPosition(jTextField1.getDocument().getLength());
        jScrollPane1.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel3.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("HUCHA", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("A JUGAR YA!!", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("vooooy capullo", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("", usuarioLogeado, usu2));
        mostrarMensajes("");
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
        jScrollPane1.revalidate();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel3.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("Bebesitaaa", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("activo?", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("uuuuaaa?", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("vamo a darle", usuarioLogeado, usu2));
        mostrarMensajes("");
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());// TODO add your handling code here:
        jScrollPane1.revalidate();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel3.removeAll();
        ManageData.chat.getMessages().clear();
        ManageData.chat.getMessages().add(new Message("Hola", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("pvp?", usu2, usuarioLogeado));
        ManageData.chat.getMessages().add(new Message("qva tt", usuarioLogeado, usu2));
        ManageData.chat.getMessages().add(new Message("mañana", usuarioLogeado, usu2));
        mostrarMensajes("");
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());// TODO add your handling code here:
        jScrollPane1.revalidate();

    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
