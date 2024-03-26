package medac.stars.ui;

import medac.stars.utils.FontBuilder;

import javax.swing.*;
import java.awt.*;

public class StartGame extends JFrame {
    private JPanel StartGamePanel;
    private JComboBox chooseArenaComboBox;
    private JComboBox chooseMEDACStarComboBox;
    private JButton cancelarButton;
    private JButton iniciarButton;
    private JLabel chooseArenaLabel;
    private JLabel chooseMEDACStarLabel;

    public StartGame() {
        add(StartGamePanel);
        setTitle("MEDAC Stars - Start Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());

        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        chooseArenaComboBox.setFont(montserratSemiBold.deriveFont(12f));
        chooseMEDACStarComboBox.setFont(montserratSemiBold.deriveFont(12f));

        cancelarButton.setFont(montserratSemiBold.deriveFont(12f));
        iniciarButton.setFont(montserratSemiBold.deriveFont(12f));
        chooseArenaLabel.setFont(montserratSemiBold.deriveFont(12f));
        chooseMEDACStarLabel.setFont(montserratSemiBold.deriveFont(12f));
    }

    public static void main(String[] args) {
        new StartGame();
    }

    private void createUIComponents() {
        UIManager.put("ComboBox.selectionBackground", new Color(255, 255, 255));
        UIManager.put("ComboBox.selectionForeground", new Color(0, 0, 0));

        chooseArenaComboBox = new JComboBox();
        chooseMEDACStarComboBox = new JComboBox();
    }
}
