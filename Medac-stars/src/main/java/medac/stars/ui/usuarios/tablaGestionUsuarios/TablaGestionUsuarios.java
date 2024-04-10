package medac.stars.ui.usuarios.tablaGestionUsuarios;

import medac.stars.controller.ManageData;
import medac.stars.model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TablaGestionUsuarios extends JFrame{
    private JTable usuarios;
    private JPanel mainPanel;

    private User usuarioNuevo;

    /**
     * Constructor por defecto de TablaGestionUsuarios
     */
    public TablaGestionUsuarios(){
        initComponents();
        initMiTablaComponent();
        add(mainPanel);
        setTitle("TestUI"); //Título de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Establece como se van a cerrar las ventanas
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    /**
     * Muestra la tabla dentro del frame
     */
    public void initMiTablaComponent() {


        Object[] nombreColumnas = new Object[]{"Nombre", "Editar"};// Guarda las filas que se van a mostrar
        Object[][] celdas = new Object[ManageData.userSet.size()][2]; //Guarda las columnas que se van a mostrar
        //A través del bucle se imprimen en la tabla todos los datos existentes
        int i =0;
        for(User user:  ManageData.userSet)
        {
            Object[] fila = new Object[]{ user.getName(),"Editar"};
            celdas[i] = fila;
            i++;
        }

        // set the table values.
        TableModel dm = new DefaultTableModel(celdas, nombreColumnas);
        miTabla.setModel(dm);
        // Modificamos la columna de los botones para que aparezca el botón:
        miTabla.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        miTabla.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox()));



    }

    public static void main(String[] Args){
        new TablaGestionUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(miTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(174, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
