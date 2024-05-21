/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.arena;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
@Deprecated
public class MenuArena extends javax.swing.JFrame {

    /**
     * Creates new form MenuArena
     */
    public MenuArena() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGestionArena = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bChat = new javax.swing.JButton();
        bGestionMedacStars = new javax.swing.JButton();
        bGestionUsuarios = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        labelTituloMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bGestionArena.setText("Gestion Arena");
        bGestionArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGestionArenaActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bChat.setText("Chat");

        bGestionMedacStars.setText("Gestion Medac Stars");

        bGestionUsuarios.setText("Gestion Usuarios");

        bLogout.setText("Logout");

        labelTituloMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        labelTituloMenu.setForeground(new java.awt.Color(255, 51, 51));
        labelTituloMenu.setText("Bienvenido NombreUsuario, aqui tienes todas las opciones que puedes realizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGestionUsuarios)
                            .addComponent(bGestionMedacStars)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bChat))
                            .addComponent(bGestionArena))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                        .addComponent(bLogout)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelTituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(bGestionUsuarios)
                .addGap(18, 18, 18)
                .addComponent(bGestionMedacStars)
                .addGap(18, 18, 18)
                .addComponent(bGestionArena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bChat)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalir)
                    .addComponent(bLogout))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Esta funcion implementada en el boton de gestionar arena nos va a dirigir a la pantalla
     * de gestionar arena y cerrara la pestaña del menu
     * @param evt 
     */
    private void bGestionArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGestionArenaActionPerformed
        this.dispose();
        if(tablaArenas == null || !tablaArenas.isVisible()){
        tablaArenas = new TablaArenas();
        tablaArenas.setVisible(true);
        }
 
    }//GEN-LAST:event_bGestionArenaActionPerformed
    /**
     * Esta funcion realiza que al hacer click en el boton de salir se cierre la pestaña del menu
     * y muestra por pantalla un mensaje emergente que nos dice que hemos cerrado el menu
     * @param evt 
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(this, "Has cerrado el menu de Arena");     
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuArena().setVisible(true);
            }
        });
    }
    //Creacion del atributo tablaArenas para ser usado en la funcion de gestionar arena y poder
    //acceder a la gestion
    private TablaArenas tablaArenas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bChat;
    private javax.swing.JButton bGestionArena;
    private javax.swing.JButton bGestionMedacStars;
    private javax.swing.JButton bGestionUsuarios;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel labelTituloMenu;
    // End of variables declaration//GEN-END:variables
}
