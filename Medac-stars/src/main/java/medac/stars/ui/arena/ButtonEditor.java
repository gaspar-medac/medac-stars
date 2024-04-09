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

    /**
     * Constructor sobrecargado
     * @param tablaArenas La tabla que recibe.
     * @param checkBox El checkbox para la tabla que se convertirá en botón.
     */
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

    /**
     * Función que recibe la celda de una tabla para editar dicho componente.
     * @param table La tabla que recibe
     * @param value El objeto a mostrar 
     * @param isSelected Si la celda esta seleccionada o no
     * @param row Linea de la tabla
     * @param column Columna de la tabla
     * @return El botón
     */
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

    /**
     * Funcion que obtiene el valor de cada celda de boton de la tabla, si se presiona uno, obtendra los valores del ManageData y creará el formulario de editar arena con sus valores.
     * Ademas, la ventana de tablas, se ocultará.
     * @return 
     */
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

    /**
     * Funcion sobreescrita que marca que la celda ha terminado de ser editada.
     * @return llamada al padre de la funcion.
     */
    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    /**
     * Funcion sobreescrita necesaria para que los listener sepan que se ha terminado la edicion.
     * 
     */
    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
