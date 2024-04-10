/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.usuarios;

import javax.swing.JOptionPane;
import medac.stars.controller.ManageData;
import medac.stars.model.User;
import medac.stars.ui.usuarios.PanelPrincipalGestor.PanelPrincipalGestor;
import medac.stars.ui.usuarios.tablaGestionUsuarios.TablaGestionUsuarios;

/**
 *
 * @author Usuario
 */
public class Usuario extends javax.swing.JFrame {

    public User usuario;

    /**
     * Creates new form Usuario, éste se iniciará si no se le pasan parámetros y los campos
     * estarán vacíos
     */

    public Usuario(User usuario) {
        this.usuario = usuario;
        initComponents();
        
        /**
         * 
         */
        TextPrompt nombreUsuario = new TextPrompt("Introduce el usuario", jTextoUsuario);
        TextPrompt email = new TextPrompt("Introduce el Email", jTextoEmail);
        TextPrompt contraseña = new TextPrompt("Introduce contraseña", jContraseña);

        if (usuario != null) {
            //nuevo usuario
            jContraseña.setText(usuario.getPassword());
            jTextoUsuario.setText(usuario.getName());
            jTextoEmail.setText(usuario.getEmail());
            if (usuario.getType() == 0) {
                bJugador.setEnabled(true);
            } else {
                bGestor.setEnabled(true);
            }
        } else {
            //Editar
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jUsuario = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jTextoUsuario = new javax.swing.JTextField();
        jTextoEmail = new javax.swing.JTextField();
        jTipoUsuario = new javax.swing.JLabel();
        bJugador = new javax.swing.JRadioButton();
        bGestor = new javax.swing.JRadioButton();
        jContraseñaLabel = new javax.swing.JLabel();
        jContraseña = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jUsuario.setText("Usuario");
        jUsuario.setToolTipText("");

        jEmail.setText("Email");

        jTextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoUsuarioActionPerformed(evt);
            }
        });

        jTipoUsuario.setText("Tipo de Usuario");

        buttonGroup1.add(bJugador);
        bJugador.setText("Jugador");

        buttonGroup1.add(bGestor);
        bGestor.setText("Gestor");

        jContraseñaLabel.setText("Contraseña");

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }

        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jContraseñaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bJugador)
                    .addComponent(bGestor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jContraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoUsuarioActionPerformed

    public boolean validarCampos() {
        String nombreUsuario = jTextoUsuario.getText();
        String email = jTextoEmail.getText();
        String contraseña = jContraseña.getText();
        int tipoUsuario = bJugador.isSelected() ? 1 : 0;

        if (nombreUsuario.equals("") || email.equals("") || contraseña.equals("") || (tipoUsuario != 1 && tipoUsuario != 0)) {
            return false;
        }

        return true;
    }

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed

        // Aquí se guarda el usuario
        String nombreUsuario = jTextoUsuario.getText();
        String email = jTextoEmail.getText();
        String contraseña = jContraseña.getText();
        int tipoUsuario = bJugador.isSelected() ? 1 : 0;

        if (!validarCampos()) {
            System.err.println("campos no validos!");

        } else {

            if (usuario != null) {
                // edición, porque el usuario se le pasó
                usuario.setName(nombreUsuario);
                usuario.setEmail(email);
                usuario.setPassword(contraseña);
            } else {
                // aqui check si existe o no el usuario
                boolean existe = false;
                for (User user : ManageData.userSet) {
                    if (user.getName().equals(nombreUsuario)) {
                        existe = true;
                    }
                }

                if (existe) {
                    //error
                    System.err.println("Este usuario ya exsiste!");
                } else {
                    User user = new User(nombreUsuario, contraseña, email, tipoUsuario);
                    ManageData.userSet.add(user);
                    JOptionPane.showMessageDialog(this, "Usuario guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        }


    }//GEN-LAST:event_bEntrarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipalGestor().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_bVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        User usuario = new User("a", "b", "c", 0);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //editar
                new Usuario(usuario).setVisible(true);
                //nuevo
                new Usuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JRadioButton bGestor;
    private javax.swing.JRadioButton bJugador;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel jContraseñaLabel;
    private javax.swing.JLabel jEmail;
    private javax.swing.JTextField jTextoEmail;
    private javax.swing.JTextField jTextoUsuario;
    private javax.swing.JLabel jTipoUsuario;
    private javax.swing.JLabel jUsuario;
    // End of variables declaration//GEN-END:variables

}