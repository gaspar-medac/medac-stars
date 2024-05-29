package medac.stars.ui.arena;


import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;


class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    /**
     * Funcion que devuelve un componente cuya funcion es obtener el render de una celda de la tabla.
     *
     * @param table      Tabla que recibe la funcion
     * @param value      El valor del objeto
     * @param isSelected si esta seleccionado o no
     * @param hasFocus   si esta clicado o no
     * @param row        linea de la tabla
     * @param column     columna de la tabla
     * @return el componente
     */
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        setForeground(isSelected ? table.getSelectionForeground() : table.getForeground());
        setBackground(isSelected ? table.getSelectionBackground() : UIManager.getColor("Button.background"));
        setText((value == null) ? "" : value.toString());
        return this;
    }
}