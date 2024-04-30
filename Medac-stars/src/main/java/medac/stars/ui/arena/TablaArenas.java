/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medac.stars.ui.arena;

import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import medac.stars.controller.ManageData;
import medac.stars.model.Arena;
import medac.stars.ui.login.FrmPantallaPrincipalGestor;

/**
 *
 * @author vicen
 */
public class TablaArenas extends javax.swing.JFrame {

    /**
     * Constructor por defecto para tablArenas.
     */
    public TablaArenas() {
        initComponents();
        initMiTablaComponent();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addArenaButton.setBackground(new java.awt.Color(0, 0, 0));
        addArenaButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        addArenaButton.setForeground(new java.awt.Color(255, 255, 255));
        addArenaButton.setText("Añadir Arena");
        addArenaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArenaButtonActionPerformed(evt);
            }
        });

        backMainMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        backMainMenuButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        backMainMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        backMainMenuButton.setText("Volver al menu principal");
        backMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainMenuButtonActionPerformed(evt);
            }
        });

        tablaArena.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tablaArena.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaArena);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(addArenaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                .addComponent(backMainMenuButton)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addArenaButton)
                    .addComponent(backMainMenuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initMiTablaComponent() {
        Object[] nombreColumnas = new Object[]{"Nombre", "Editar"};
        Object[][] celdas = new Object[ManageData.arenaSet.size()][2];
        int i = 0;
        for (Arena arena : ManageData.arenaSet) {
            String nombreArena = arena.getName();
            Object[] fila = new Object[]{nombreArena, "Editar"};
            celdas[i] = fila;
            i++;
        }
        // set the table values.
        TableModel dm = new DefaultTableModel(celdas, nombreColumnas);
        tablaArena.setModel(dm);
        // Modificamos la columna de los botones para que aparezca el botón:
        tablaArena.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        tablaArena.getColumn("Editar").setCellEditor(new ButtonEditor(this, new JCheckBox()));

    }


    /**
     * Metodo a llamar cuando se pulsa el boton de addArena que oculta la ventana tablaArenas y comprueba si la ventana de addArena esta visible o nula, si cumple la condicion
     * crea un nueva ventana de addArena y la hace visible.
     * @param evt el boton que se llama
     */
    private void addArenaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArenaButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if (addArenaForm == null || !addArenaForm.isVisible()) {
            addArenaForm = new AddArena(this);
            addArenaForm.setVisible(true);
        }
    }//GEN-LAST:event_addArenaButtonActionPerformed

    /**
     * Metodo a llamar cuando se pulsa boton de volver al menú principal.
     * @param evt el boton que se llama
     */
    private void backMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainMenuButtonActionPerformed
        this.dispose();
        FrmPantallaPrincipalGestor fppg = new FrmPantallaPrincipalGestor();
        fppg.setVisible(true);
    }//GEN-LAST:event_backMainMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TablaArenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaArenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaArenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaArenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaArenas().setVisible(true);
            }
        });
    }

    private AddArena addArenaForm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArenaButton;
    private javax.swing.JButton backMainMenuButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaArena;
    // End of variables declaration//GEN-END:variables
}
