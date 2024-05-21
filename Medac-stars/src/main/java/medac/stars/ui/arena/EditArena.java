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
public class EditArena extends javax.swing.JFrame {

    /**
     * Creates new form addArena
     * @param arena por parametro
     */
    public EditArena(TablaArenas tablaArenas) {
        initComponents();
        this.tablaArenas = tablaArenas;
    }
    /**
     * Contructor sobrecargador de EditArena
     * @param tablaArenas
     * @param arena
     * @param index 
     */
    public EditArena(TablaArenas tablaArenas, Arena arena, int index) {
        initComponents();
        tfEditarNombre.setText(arena.getName());
        cbCuentaAtrasEditar.setSelected(arena.isCountdown());
        tfEditarDescripcion.setText(arena.getDescription());
        contObstaculosEditar.setValue(arena.getBarriers());
        jlimagenArena.setIcon(arena.getImage());
        this.index = index;
        this.tablaArenas = tablaArenas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelarEditar = new javax.swing.JButton();
        bCambiarImagen = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        tfEditarNombre = new javax.swing.JTextField();
        cbCuentaAtrasEditar = new javax.swing.JCheckBox();
        labelNumeroObstaculos = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        tfEditarDescripcion = new javax.swing.JTextField();
        bGuardarCambios = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        contObstaculosEditar = new javax.swing.JSpinner();
        jlimagenArena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCancelarEditar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bCancelarEditar.setText("Cancelar");
        bCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarEditarActionPerformed(evt);
            }
        });

        bCambiarImagen.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bCambiarImagen.setText("Nueva Imagen");
        bCambiarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarImagenActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");

        tfEditarNombre.setEditable(false);
        tfEditarNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tfEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditarNombreActionPerformed(evt);
            }
        });

        cbCuentaAtrasEditar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbCuentaAtrasEditar.setText("Cuenta atras");
        cbCuentaAtrasEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuentaAtrasEditarActionPerformed(evt);
            }
        });

        labelNumeroObstaculos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelNumeroObstaculos.setText("Numero de Obstáculos");

        labelDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelDescripcion.setText("Descripción");

        tfEditarDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        bGuardarCambios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bGuardarCambios.setText("Guardar cambios");
        bGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarCambiosActionPerformed(evt);
            }
        });

        jTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jTitulo.setText("Editar Arena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bCancelarEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGuardarCambios)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bCambiarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jlimagenArena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNombre)
                                .addComponent(labelNumeroObstaculos)
                                .addComponent(labelDescripcion)
                                .addComponent(tfEditarDescripcion)
                                .addComponent(tfEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbCuentaAtrasEditar)
                            .addComponent(contObstaculosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTitulo)
                        .addGap(239, 239, 239))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCuentaAtrasEditar)
                                .addGap(18, 18, 18)
                                .addComponent(labelNumeroObstaculos)
                                .addGap(9, 9, 9)
                                .addComponent(contObstaculosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jlimagenArena, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bCambiarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEditarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarEditar)
                    .addComponent(bGuardarCambios))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCuentaAtrasEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuentaAtrasEditarActionPerformed

    }//GEN-LAST:event_cbCuentaAtrasEditarActionPerformed
    /**
     * Esta funcion va a realizar el guardado de los cambios de cuando editamos una Arena
     * nos dejara editar todas sus caracteristicas y una vez pulsado el boton de guardado
     * se guardaran los cambios
     * @param evt 
     */
    private void bGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarCambiosActionPerformed
        Arena arena = new Arena(tfEditarNombre.getText(), cbCuentaAtrasEditar.isSelected(), tfEditarDescripcion.getText(), jlimagenArena.getIcon(), (int) contObstaculosEditar.getValue());
        for (int i = 0; i < arenaSet.size(); i++) {
            if (i == index) {
                arenaSet.set(index, arena);
            }
        }
        JOptionPane.showMessageDialog(this, "Se ha guardado la modificacion");
        this.dispose();
        tablaArenas.initMiTablaComponent();
        tablaArenas.setVisible(true);

    }//GEN-LAST:event_bGuardarCambiosActionPerformed
    /**
     * Con esta funcion una vez clicamos el boton cambiar imagen nos abrira el explorador de archivos
     * para poder seleccinar la ruta de donde elegiremos la imagen y la cambiaremos por la seleccionada
     * anteriormente
     * @param evt 
     */
    private void bCambiarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarImagenActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(""));
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            loadAndSetImage(ruta);
        }
    }//GEN-LAST:event_bCambiarImagenActionPerformed
    /**
     * Esta funcion realiza que una vez seleccionado el boton cancelar editar cerrara la pestaña de editar arena
     * y abrira acto seguido la pestaña de tablaArenas
     * @param evt 
     */
    private void bCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarEditarActionPerformed
        this.dispose();;
        tablaArenas.setVisible(true);
    }//GEN-LAST:event_bCancelarEditarActionPerformed

    private void tfEditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditarNombreActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_tfEditarNombreActionPerformed
    /**
     * Coge la ruta de la imagen, la escala y la añade como icono de la arena
     * @param imgPath 
     */
    private void loadAndSetImage(String imgPath) {
        ImageIcon icon = new ImageIcon(imgPath);
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(200, 200, 1));
        jlimagenArena.setIcon(icono);

    }
    /**
     * Atributos creados para las distintas funciones
     */
    int index;
    private TablaArenas tablaArenas;
    private Arena arena;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCambiarImagen;
    private javax.swing.JButton bCancelarEditar;
    private javax.swing.JButton bGuardarCambios;
    private javax.swing.JCheckBox cbCuentaAtrasEditar;
    private javax.swing.JSpinner contObstaculosEditar;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jlimagenArena;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumeroObstaculos;
    private javax.swing.JTextField tfEditarDescripcion;
    private javax.swing.JTextField tfEditarNombre;
    // End of variables declaration//GEN-END:variables
}
