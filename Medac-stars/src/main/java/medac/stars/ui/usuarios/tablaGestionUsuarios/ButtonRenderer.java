package medac.stars.ui.usuarios.tablaGestionUsuarios;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

/**
 * @author Cristian
 */
class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setForeground(isSelected ? table.getSelectionForeground() : table.getForeground());
        setBackground(isSelected ? table.getSelectionBackground() : UIManager.getColor("Button.background"));
        setText((value == null) ? "" : value.toString());

        return this;
    }
}