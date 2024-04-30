package medac.stars.ui.arena;

import medac.stars.controller.ManageData;
import medac.stars.model.Arena;

import javax.swing.*;
import java.awt.*;

class ButtonEditor extends DefaultCellEditor {

    private final TablaArenas tablaArenas;
    protected JButton button;
    private String label;
    //aqui se puede indicar indice de la tabla, id del objeto medac star...
    private int numeroFila;
    // es pulsado
    private boolean isPushed;

    /**
     * Constructor sobrecargado
     *
     * @param tablaArenas La tabla que recibe.
     * @param checkBox    El checkbox para la tabla que se convertirá en botón.
     */
    public ButtonEditor(TablaArenas tablaArenas, JCheckBox checkBox) {
        super(checkBox);
        this.tablaArenas = tablaArenas;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> fireEditingStopped());
    }

    /**
     * Función que recibe la celda de una tabla para editar dicho componente.
     *
     * @param table      La tabla que recibe
     * @param value      El objeto a mostrar
     * @param isSelected Si la celda esta seleccionada o no
     * @param row        Linea de la tabla
     * @param column     Columna de la tabla
     * @return El botón
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        button.setForeground(isSelected ? table.getSelectionForeground() : table.getForeground());
        button.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        numeroFila = row;
        isPushed = true;
        return button;
    }

    /**
     * Funcion que obtiene el valor de cada celda de boton de la tabla, si se presiona uno, obtendra los valores del ManageData y creará el formulario de editar arena con sus valores.
     * Ademas, la ventana de tablas, se ocultará.
     *
     * @return El valor de la celda
     */
    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            Arena arena = ManageData.arenaSet.get(numeroFila);
            EditArena editArena = new EditArena(tablaArenas, arena, numeroFila);
            editArena.setVisible(true);
            tablaArenas.dispose();
        }
        isPushed = false;
        //devolvemos el label, pero podria ser el numero de fila
        return label;
    }

    /**
     * Funcion sobreescrita que marca que la celda ha terminado de ser editada.
     *
     * @return llamada al padre de la funcion.
     */
    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    /**
     * Funcion sobreescrita necesaria para que los listener sepan que se ha terminado la edicion.
     */
    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}