package medac.stars.ui;

import medac.stars.controller.ManageData;
import medac.stars.utils.FontBuilder;

import javax.swing.*;
import java.awt.*;

public class StartGame extends JFrame {
    private JPanel StartGamePanel;
    private JComboBox chooseArenaComboBox;
    private JComboBox chooseMEDACStarComboBox;
    private JButton cancelButton;
    private JButton startButton;
    private JLabel chooseArenaLabel;
    private JLabel chooseMEDACStarLabel;

    public StartGame() {
        add(StartGamePanel);
        setTitle("MEDAC Stars - Start Game");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        // Set frame icon
        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());

        // Set fonts for components
        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        chooseArenaComboBox.setFont(montserratSemiBold.deriveFont(12f));
        chooseMEDACStarComboBox.setFont(montserratSemiBold.deriveFont(12f));
        cancelButton.setFont(montserratSemiBold.deriveFont(12f));
        startButton.setFont(montserratSemiBold.deriveFont(12f));
        chooseArenaLabel.setFont(montserratSemiBold.deriveFont(12f));
        chooseMEDACStarLabel.setFont(montserratSemiBold.deriveFont(12f));

        // Add arenas to the combo box (We first remove all items)
        chooseArenaComboBox.removeAllItems();
        ManageData.arenaSet.forEach(arena -> {
            chooseArenaComboBox.addItem(arena.getName());
        });

        // Add medac stars to the combo box (We first remove all items)
        chooseMEDACStarComboBox.removeAllItems();
        ManageData.medacStarSet.forEach(medacStar -> {
            chooseMEDACStarComboBox.addItem(medacStar.getName());
        });

        cancelButton.addActionListener(e -> {
            // Close the window
            dispose();
        });

        startButton.addActionListener(e -> {
            // Check if both arena and MEDAC Star are selected
            if (chooseArenaComboBox.getSelectedIndex() == -1 || chooseMEDACStarComboBox.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Please select an arena and a MEDAC Star to start the game.", "MEDAC Stars - Start Game", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Here we'd have to create the game, but as we don't have the other implementations yet, we'll just print the selected values
            System.out.println("Starting game with arena: " + chooseArenaComboBox.getSelectedItem() + " and MEDAC Star: " + chooseMEDACStarComboBox.getSelectedItem());
        });
    }

    public static void main(String[] args) {
        new StartGame();
    }

    private void createUIComponents() {
        // Customize the combo box selection background and foreground colors
        UIManager.put("ComboBox.selectionBackground", new Color(255, 255, 255));
        UIManager.put("ComboBox.selectionForeground", new Color(0, 0, 0));

        // Initialize the combo boxes
        chooseArenaComboBox = new JComboBox();
        chooseMEDACStarComboBox = new JComboBox();
    }
}
