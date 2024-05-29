/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.arena;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static medac.stars.controller.ManageData.arenaSet;
import medac.stars.model.Arena;

/**
 *
 * @author asier
 */
public class AddArena extends javax.swing.JFrame {

    /**
     * Crea un nuevo formulario Arena
     */
    public AddArena(TablaArenas tablaArenas) {
        initComponents();
        this.tablaArenas = tablaArenas;
        /**
         * Place holder de los textfields "tfNuevoNombre" y "tfDescripcion"
         */
        TextPrompt placeholder0 = new TextPrompt("Dale un Nombre!!", tfNuevoNombre);
        TextPrompt placeholder1 = new TextPrompt("Añade una descripción!!", tfDescripcion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        bAnyadirImagen = new javax.swing.JButton();
        lNombre = new javax.swing.JLabel();
        tfNuevoNombre = new javax.swing.JTextField();
        cbCuentaAtras = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        bGuardarArena = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlimagenArena = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAnyadirImagen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bAnyadirImagen.setText("Nueva Imagen");
        bAnyadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnyadirImagenActionPerformed(evt);
            }
        });

        lNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lNombre.setText("Nombre");

        tfNuevoNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tfNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNuevoNombreActionPerformed(evt);
            }
        });

        cbCuentaAtras.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbCuentaAtras.setText("Cuenta atras");
        cbCuentaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuentaAtrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Numero de Obstáculos");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        tfDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        bGuardarArena.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bGuardarArena.setText("Guardar arena");
        bGuardarArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarArenaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setText("Nueva Arena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bCancelar)
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bGuardarArena)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bAnyadirImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jlimagenArena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNombre)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCuentaAtras)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCuentaAtras)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlimagenArena, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bGuardarArena))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCuentaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuentaAtrasActionPerformed
        
    }//GEN-LAST:event_cbCuentaAtrasActionPerformed
    /**
     * Funcionalidad del boton de "guardar Arena": 
     * Guarda la arena y la almacena en tablaArenas
     * una vez guardado muestra que se ha guardado con exito con un cartel 
     * posteriormente se cierran las dos ventanas y vuelve a la tabla
     * @param evt 
     */
    private void bGuardarArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarArenaActionPerformed

        Arena arena = new Arena(tfNuevoNombre.getText(), cbCuentaAtras.isSelected(), tfDescripcion.getText(), jlimagenArena.getIcon(), (int) jSpinner1.getValue());
        arenaSet.add(arena);
        JOptionPane.showMessageDialog(this, "La Arena se ha guardado con Exito!!");
        this.dispose();
        if (tablaArenas != null) {
            tablaArenas.setVisible(true);
            tablaArenas.initMiTablaComponent();
        }
    }//GEN-LAST:event_bGuardarArenaActionPerformed
    /**
     * Funcionalidad del boton "Cancelar":
     * cierra la ventana una vez pulsado
     * posteriormente se vuelve a la ventana de tablaArenas
     * @param evt 
     */
    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
        if (tablaArenas != null) {
            tablaArenas.setVisible(true);
        }
    }//GEN-LAST:event_bCancelarActionPerformed
    /**
     * Funcionaldiad del boton "Nueva Imagen":
     * una vez clicado abre el explorador de archivos donde podremos selecionar cualquier imagen
     * una vez selecionadas coge la ruta de la imagen y la establece mediante el metodo LoadAndSetImage
     * @param evt 
     */
    private void bAnyadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnyadirImagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        String ruta;
        fileChooser.setSelectedFile(new File(""));
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            loadAndSetImage(ruta);
        }
    }//GEN-LAST:event_bAnyadirImagenActionPerformed


    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
 
    private void tfNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNuevoNombreActionPerformed

    }//GEN-LAST:event_tfNuevoNombreActionPerformed

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionActionPerformed

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
            java.util.logging.Logger.getLogger(AddArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddArena(null).setVisible(true);
            }
        });

    }
    /**
     * Funcionalidad del Metodo "LoadAndSetImage:
     * coge la ruta de la imagen, la escala y la establece como icono
     * @param imgPath 
     */
    private void loadAndSetImage(String imgPath) {
        ImageIcon icon = new ImageIcon(imgPath);
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(200, 200, 1));
        jlimagenArena.setIcon(icono);

    }

    TablaArenas tablaArenas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnyadirImagen;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bGuardarArena;
    private javax.swing.JCheckBox cbCuentaAtras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel jlimagenArena;
    private javax.swing.JLabel lNombre;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNuevoNombre;
    // End of variables declaration//GEN-END:variables

}
