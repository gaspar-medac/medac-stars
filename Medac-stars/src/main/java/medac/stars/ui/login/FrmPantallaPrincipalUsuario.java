/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package medac.stars.ui.login;

import medac.stars.ui.medacstar.ListaMedacStars;
import medac.stars.ui.play.GameHistory;
import medac.stars.ui.chat.ChatInterfaz;
import medac.stars.ui.medacstar.MenuInicialGestionMedacStars;

/**
 *
 * @author adggu
 */
public class FrmPantallaPrincipalUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmPantallaPrincipal
     */
    public FrmPantallaPrincipalUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        txtverMedacStars = new javax.swing.JButton();
        txtjugar = new javax.swing.JButton();
        txtchat = new javax.swing.JButton();
        txtsalir = new javax.swing.JButton();
        txtlogout = new javax.swing.JButton();
        textoBienvenida = new javax.swing.JLabel();
        textoInformativo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PANTALLA PRINCIPAL USUARIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtverMedacStars.setText("Ver Medac Stars");
        txtverMedacStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtverMedacStarsActionPerformed(evt);
            }
        });

        txtjugar.setText("Jugar");
        txtjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjugarActionPerformed(evt);
            }
        });

        txtchat.setText("Chat");
        txtchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchatActionPerformed(evt);
            }
        });

        txtsalir.setText("Salir");
        txtsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalirActionPerformed(evt);
            }
        });

        txtlogout.setText("Logout");
        txtlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlogoutActionPerformed(evt);
            }
        });

        textoBienvenida.setForeground(new java.awt.Color(255, 0, 0));
        textoBienvenida.setText("Bienvenido Euphoria1");

        textoInformativo.setForeground(new java.awt.Color(255, 0, 0));
        textoInformativo.setText("Aquí tienes todas las opciones que puedes realizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(textoInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(textoBienvenida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtverMedacStars, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(txtchat, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textoBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoInformativo)
                .addGap(40, 40, 40)
                .addComponent(txtverMedacStars, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtjugar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtchat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_txtsalirActionPerformed

    private void txtlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlogoutActionPerformed
        // boton de logout

    }//GEN-LAST:event_txtlogoutActionPerformed

    private void txtjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjugarActionPerformed
        // TODO add your handling code here:
        GameHistory gh = new GameHistory();
        gh.setVisible(true);
    }//GEN-LAST:event_txtjugarActionPerformed

    private void txtchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchatActionPerformed
        // TODO add your handling code here:
        ChatInterfaz cj = new ChatInterfaz();
        cj.setVisible(true);
    }//GEN-LAST:event_txtchatActionPerformed

    private void txtverMedacStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtverMedacStarsActionPerformed
        // TODO add your handling code here:
        ListaMedacStars mgs = new ListaMedacStars();
        mgs.setVisible(true);
    }//GEN-LAST:event_txtverMedacStarsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPantallaPrincipalUsuario dialog = new FrmPantallaPrincipalUsuario();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JLabel textoInformativo;
    private javax.swing.JButton txtchat;
    private javax.swing.JButton txtjugar;
    private javax.swing.JButton txtlogout;
    private javax.swing.JButton txtsalir;
    private javax.swing.JButton txtverMedacStars;
    // End of variables declaration//GEN-END:variables
}
