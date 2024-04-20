package medac.stars.ui.arena;


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;


class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
      setOpaque(true);
    }
  
    /**
     * Funcion que devuelve un componente cuya funcion es obtener el render de una celda de la tabla.
     * @param table Tabla que recibe la funcion
     * @param value El valor del objeto
     * @param isSelected si esta seleccionado o no
     * @param hasFocus si esta clicado o no
     * @param row linea de la tabla
     * @param column columna de la tabla
     * @return el componente
     */
    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {
      if (isSelected) {
        setForeground(table.getSelectionForeground());
        setBackground(table.getSelectionBackground());
      } else {
        setForeground(table.getForeground());
        setBackground(UIManager.getColor("Button.background"));
      }
      setText((value == null) ? "" : value.toString());
      return this;
    }
  }