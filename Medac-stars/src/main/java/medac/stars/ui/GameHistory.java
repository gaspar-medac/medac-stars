package medac.stars.ui;

import medac.stars.controller.ManageData;
import medac.stars.model.Game;
import medac.stars.model.Team;
import medac.stars.utils.FontBuilder;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameHistory extends JFrame {
    private static final String LOGO_PATH = "./src/main/java/medac/stars/ui/assets/images/logo.png";
    private static final Font TABLE_FONT = FontBuilder.getFont("Montserrat-SemiBold.ttf").deriveFont(12f);
    private static final Font HEADER_FONT = TABLE_FONT.deriveFont(14f);
    private static final Color FOREGROUND_COLOR = new Color(33, 37, 41);
    private static final Dimension SCROLL_BAR_DIMENSION = new Dimension(8, 0);
    private static final Color SCROLL_THUMB_COLOR = new Color(168, 168, 168);
    private static final Color SCROLL_TRACK_COLOR = new Color(0, 0, 0, 0);

    private JPanel gameHistoryPanel;
    private JButton startJoinGameButton;
    private JButton returnMainMenuButton;
    private JTable historyTable;
    private JScrollPane historyTableScrollPane;

    public GameHistory() {
        initializeFrame();
        initializeComponents();
        addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameHistory::new);
    }

    private void initializeFrame() {
        add(gameHistoryPanel);
        setTitle("MEDAC Stars - Game History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(LOGO_PATH).getImage());
        setVisible(true);
    }

    private void initializeComponents() {
        createUIComponents();
    }

    private void addListeners() {
        startJoinGameButton.addActionListener(e -> {
            ManageData.gameList.stream().filter(game -> game.getResult() == -1).findFirst().ifPresentOrElse(game -> new JoinGame(), StartGame::new);
        });

        returnMainMenuButton.addActionListener(e -> {
            System.out.println("Return to main menu");
        });
    }

    private void createUIComponents() {
        String[] columnNames = {"Team 1", "Team 2", "Result"};
        List<Object[]> dataList = buildDataList();
        Object[][] data = dataList.toArray(new Object[0][]);

        historyTable = new JTable(data, columnNames);
        configureTable();
        historyTableScrollPane = new JScrollPane(historyTable);
        customizeScrollBar();
    }

    private List<Object[]> buildDataList() {
        List<Object[]> dataList = new ArrayList<>();
        ManageData.gameList.forEach(game -> dataList.add(new Object[]{formatTeamString(game.getTeam1()), formatTeamString(game.getTeam2()), getResultString(game)}));
        return dataList;
    }

    private String formatTeamString(Team team) {
        return String.format("[%s - %s] [%s - %s]", team.getPlayer1().getName(), team.getMedacStar1().getName(), team.getPlayer2().getName(), team.getMedacStar2().getName());
    }

    private String getResultString(Game game) {
        return switch (game.getResult()) {
            case 0 -> "Team 1 win";
            case 1 -> "Team 2 win";
            default -> "Draw";
        };
    }

    private void configureTable() {
        historyTable.setEnabled(false);
        historyTable.getTableHeader().setReorderingAllowed(false);
        historyTable.getTableHeader().setResizingAllowed(false);
        alignTableCellsCenter(historyTable);
        historyTable.setFont(TABLE_FONT);
        historyTable.setForeground(FOREGROUND_COLOR);
        historyTable.getTableHeader().setFont(HEADER_FONT);
        historyTable.getTableHeader().setForeground(FOREGROUND_COLOR);
    }

    private void alignTableCellsCenter(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void customizeScrollBar() {
        historyTableScrollPane.getVerticalScrollBar().setPreferredSize(SCROLL_BAR_DIMENSION);
        historyTableScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = SCROLL_THUMB_COLOR;
                this.trackColor = SCROLL_TRACK_COLOR;
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createZeroSizeButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createZeroSizeButton();
            }

            private JButton createZeroSizeButton() {
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
