/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.arena;

import medac.stars.controller.ManageData;
import medac.stars.ui.login.FrmPantallaPrincipalGestor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author vicen
 */
public class TablaArenas extends javax.swing.JFrame {
    private AddArena addArenaForm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArenaButton;
    private javax.swing.JButton backMainMenuButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaArena;

    /**
     * Constructor por defecto para tablArenas.
     */
    public TablaArenas() {
        initComponents();
        initMiTablaComponent();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaArenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TablaArenas().setVisible(true));
    }

    /**
     * Metodo que inicializa los componentes de la tabla, asi como botones y campos de texto.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addArenaButton = new javax.swing.JButton();
        backMainMenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArena = new javax.swing.JTable();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        addArenaButton.setBackground(new Color(0, 0, 0));
        addArenaButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 24)); // NOI18N
        addArenaButton.setForeground(new Color(255, 255, 255));
        addArenaButton.setText("Añadir Arena");
        addArenaButton.addActionListener(evt -> addArenaButtonActionPerformed());

        backMainMenuButton.setBackground(new Color(0, 0, 0));
        backMainMenuButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 24)); // NOI18N
        backMainMenuButton.setForeground(new Color(255, 255, 255));
        backMainMenuButton.setText("Volver al menu principal");
        backMainMenuButton.addActionListener(evt -> backMainMenuButtonActionPerformed());

        tablaArena.setFont(new Font("Comic Sans MS", Font.PLAIN, 18)); // NOI18N
        tablaArena.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        jScrollPane1.setViewportView(tablaArena);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(addArenaButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE).addComponent(backMainMenuButton).addGap(40, 40, 40)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(41, 41, 41).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(addArenaButton).addComponent(backMainMenuButton)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initMiTablaComponent() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Editar"}, 0);
        ManageData.arenaSet.forEach(arena -> model.addRow(new Object[]{arena.getName(), "Editar"}));
        tablaArena.setModel(model);
        tablaArena.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        tablaArena.getColumn("Editar").setCellEditor(new ButtonEditor(this, new JCheckBox()));
    }

    /**
     * Metodo a llamar cuando se pulsa el boton de addArena que oculta la ventana tablaArenas y comprueba si la ventana de addArena esta visible o nula, si cumple la condicion
     * crea un nueva ventana de addArena y la hace visible.
     */
    private void addArenaButtonActionPerformed() {//GEN-FIRST:event_addArenaButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if (addArenaForm == null || !addArenaForm.isVisible()) {
            addArenaForm = new AddArena(this);
            addArenaForm.setVisible(true);
        }
    }//GEN-LAST:event_addArenaButtonActionPerformed

    /**
     * Metodo a llamar cuando se pulsa boton de volver al menú principal.
     */
    private void backMainMenuButtonActionPerformed() {//GEN-FIRST:event_backMainMenuButtonActionPerformed
        this.dispose();
        FrmPantallaPrincipalGestor fppg = new FrmPantallaPrincipalGestor();
        fppg.setVisible(true);
    }//GEN-LAST:event_backMainMenuButtonActionPerformed
    // End of variables declaration//GEN-END:variables
}