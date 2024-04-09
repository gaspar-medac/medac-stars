package medac.stars.ui;

import medac.stars.controller.ManageData;
import medac.stars.model.Team;
import medac.stars.utils.FontBuilder;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class GameHistory extends JFrame {
    private JPanel GameHistoryPanel;
    private JButton iniciarPartidaUnirseAButton;
    private JButton volverAlMenúPrincipalButton;
    private JTable historyTable;
    private JScrollPane historyTableScrollPane;

    public GameHistory() {
        add(GameHistoryPanel);
        setTitle("MEDAC Stars - Game History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());
    }

    public static void main(String[] args) {
        new GameHistory();
    }

    private void createUIComponents() {
        String[] columnNames = {"Team 1", "Team 2", "Result"};

        // Initialize an ArrayList to hold Object[] rows
        ArrayList<Object[]> dataList = new ArrayList<>();

        ManageData.gameList.forEach(game -> {
            Team team1 = game.getTeam1();
            Team team2 = game.getTeam2();

            String team1String = String.format("[%s - %s] [%s - %s]",
                    team1.getPlayer1().getName(), team1.getMedacStar1().getName(),
                    team1.getPlayer2().getName(), team1.getMedacStar2().getName());
            String team2String = String.format("[%s - %s] [%s - %s]",
                    team2.getPlayer1().getName(), team2.getMedacStar1().getName(),
                    team2.getPlayer2().getName(), team2.getMedacStar2().getName());

            String result = switch (game.getResult()) {
                case 0 -> "Team 1 win";
                case 1 -> "Team 2 win";
                default -> "Draw";
            };

            dataList.add(new Object[]{team1String, team2String, result});
        });

        Object[][] data = dataList.toArray(new Object[0][]);

        // Create a JTable with all the dynamic data and column names
        historyTable = new JTable(data, columnNames);

        // Deshabilitamos la edición y el drag
        historyTable.setEnabled(false);
        historyTable.getTableHeader().setReorderingAllowed(false);
        historyTable.getTableHeader().setResizingAllowed(false);

        // Alineamos las celdas al centro
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < historyTable.getColumnCount(); i++) {
            historyTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        historyTable.setFont(montserratSemiBold.deriveFont(12f));
        historyTable.setForeground(new Color(33, 37, 41));

        JTableHeader header = historyTable.getTableHeader();
        header.setFont(montserratSemiBold.deriveFont(14f));
        header.setForeground(new Color(33, 37, 41));

        historyTableScrollPane = new JScrollPane();
        historyTableScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0));
        historyTableScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(168, 168, 168);
                this.trackColor = new Color(0, 0, 0, 0);
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return new JButton() {
                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(0, 0);
                    }
                };
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                if (!thumbBounds.isEmpty() && this.scrollbar.isEnabled()) {
                    int w = thumbBounds.width - 1;
                    int h = thumbBounds.height - 1;

                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(thumbColor);
                    g2.fillRoundRect(thumbBounds.x, thumbBounds.y, w, h, 7, 7);
                    g2.dispose();
                }
            }
        });
    }
}