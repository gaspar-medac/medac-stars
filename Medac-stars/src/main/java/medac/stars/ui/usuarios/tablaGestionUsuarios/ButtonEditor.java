package medac.stars.ui.usuarios.tablaGestionUsuarios;

import medac.stars.controller.ManageData;
import medac.stars.ui.usuarios.Usuario;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Cristian
 */
class ButtonEditor extends DefaultCellEditor {


    protected JButton bEditar;
    private String label;

    //aqui se puede indicar indice de la tabla, id del objeto medac star...
    private int numeroFila;

    // es pulsado
    private boolean isPushed;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        bEditar = new JButton();
        bEditar.setOpaque(true);
        bEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        if (isSelected) {
            bEditar.setForeground(table.getSelectionForeground());
            bEditar.setBackground(table.getSelectionBackground());
        } else {
            bEditar.setForeground(table.getForeground());
            bEditar.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        bEditar.setText(label);
        numeroFila = row;
        isPushed = true;
        return bEditar;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            JOptionPane.showMessageDialog(bEditar, label + ": pulsado: " + ManageData.userSet.get(numeroFila).getName());

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Usuario(ManageData.userSet.get(numeroFila)).setVisible(true);


                }

            });


        }
        isPushed = false;
        //devolvemos el label, pero podria ser el numero de fila
        return new String(label);

    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}



