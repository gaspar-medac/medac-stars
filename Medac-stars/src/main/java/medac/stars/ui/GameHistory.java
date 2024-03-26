package medac.stars.ui;

import medac.stars.utils.FontBuilder;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;

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
        setVisible(true);

        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());
    }

    public static void main(String[] args) {
        new GameHistory();
    }

    private void createUIComponents() {
        String[] columnNames = {"Team 1", "Team 2", "Result"};

        Object[][] data = {
            {
                "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                "Team 1 win"
            },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },

                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },
                {
                        "[Player1 - MedacStar1] [Player2 - MedacStar2]",
                        "[Player3 - MedacStar3] [Player4 - MedacStar4]",
                        "Team 1 win"
                },

        };

        historyTable = new JTable(data, columnNames);

        // Deshabilitamos la edición y el drag
        historyTable.setEnabled(false);
        historyTable.getTableHeader().setReorderingAllowed(false);

        // Alineamos las celdas al centro
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < historyTable.getColumnCount(); i++) {
            historyTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        historyTable.setFont(montserratSemiBold.deriveFont(12f));

        JTableHeader header = historyTable.getTableHeader();
        header.setFont(montserratSemiBold.deriveFont(14f));


        historyTableScrollPane = new JScrollPane();
        historyTableScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0));
        historyTableScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(168,168, 168);
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