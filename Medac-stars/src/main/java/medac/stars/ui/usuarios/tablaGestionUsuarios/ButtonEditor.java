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


    protected JButton button;
    private String label;

    //aqui se puede indicar indice de la tabla, id del objeto medac star...
    private int numeroFila;

    // es pulsado
    private boolean isPushed;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
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
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        numeroFila = row;
        isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            JOptionPane.showMessageDialog(button, label + ": pulsado: " + ManageData.userSet.get(numeroFila).getName());

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



