package gestionUsuarios;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaUsuarios extends javax.swing.JFrame {

    /*
    Declaración de variables
     */
    GestionUsuarios gestionUsuarios;
    private JTable usuarios;
    private JPanel usuariosTabla;
/*
Fin declaración de variables
 */

    /**
     * Constructor por defecto
     */
    public TablaUsuarios() {
        add(usuariosTabla);
        setTitle("TestUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Creación de la tabla y visibilidad del frame
     */
    private void createUIComponents() {
        JButton boton = new JButton("Eliminar");
        boton.setSize(100, 45);
        boton.setVisible(true);
        TableCellRenderer tableRenderer;
        usuarios = new JTable(new JTableButtonModel());
        tableRenderer = usuarios.getDefaultRenderer(JButton.class);
        usuarios.setDefaultRenderer(JButton.class, new JTableButtonRenderer(tableRenderer));
        usuarios.setEnabled(false);
    }

    /**
     * Creación de tablas y celdas con el botón
     */
    class JTableButtonRenderer implements TableCellRenderer {
        private TableCellRenderer defaultRenderer;

        public JTableButtonRenderer(TableCellRenderer renderer) {
            defaultRenderer = renderer;
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Component)
                return (Component) value;
            return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }

    class JTableButtonModel extends AbstractTableModel {

        /**
         * Datos de la tabla
         */
        private Object[][] rows = {{"Adri", new JButton("Editar")},
                {"Alfredo", new JButton("Editar")},
                {"Pepe", new JButton("Editar")},
                {"Elena", new JButton("Editar")}};
        private String[] columns = {"Count", "Buttons"};
        public String getColumnName(int column) {
            return columns[column];
        }
        public int getRowCount() {
            return rows.length;
        }
        public int getColumnCount() {
            return columns.length;
        }
        public Object getValueAt(int row, int column) {
            return rows[row][column];
        }
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }
    }


    }

