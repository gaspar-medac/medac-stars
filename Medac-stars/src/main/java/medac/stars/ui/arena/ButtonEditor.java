package medac.stars.ui.arena;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import medac.stars.controller.ManageData;
import medac.stars.model.Arena;

class ButtonEditor extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private EditArena editArena;
    private TablaArenas tablaArenas;
    //aqui se puede indicar indice de la tabla, id del objeto medac star...
    private int numeroFila;
    // es pulsado
    private boolean isPushed;

    public ButtonEditor(TablaArenas tablaArenas, JCheckBox checkBox) {
        super(checkBox);
        this.tablaArenas = tablaArenas;
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
            for (int i = 0; i < ManageData.arenaSet.size(); i++) {
                if (numeroFila == i) {
                    Arena arena = ManageData.arenaSet.get(numeroFila);
                    editArena = new EditArena(tablaArenas, arena, numeroFila);
                    editArena.setVisible(true);
                    tablaArenas.dispose();
                    break;
                }
            }
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
