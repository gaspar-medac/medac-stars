package medac.stars.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class GameHistory extends JFrame {
    private JPanel GameHistoryPanel;
    private JButton iniciarPartidaUnirseAButton;
    private JButton volverAlMenúPrincipalButton;
    private JTable table1;

    public GameHistory() {
        add(GameHistoryPanel);
        setTitle("MEDAC Stars - Game History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameHistory();
    }

    private void createUIComponents() {
        String[] columnNames = {"Team 1", "Team 2", "Result"};

        Object[][] data = {
            {
                "[Player1 - MedacStar1][Player2 - MedacStar2]",
                "[Player3 - MedacStar3][Player4 - MedacStar4]",
                "Team 1 win"
            }
        };

        table1 = new JTable(data, columnNames);
        table1.setEnabled(false);

        // Alineamos las celdas al centro
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table1.getColumnCount(); i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }


    }
}