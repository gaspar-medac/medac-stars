package medac.stars.ui;

import javax.swing.*;
import java.awt.*;

public class JoinGame extends JFrame {

    private JPanel JoinGamePanel;
    private JButton unirseButton;
    private JButton unirseButton1;
    private JButton CANCELARButton;
    private JLabel slot1Label;
    private JLabel slot2Label;
    private JLabel slot3Label;
    private JLabel slot4Label;
    private JLabel arenaNameLabel;

    public JoinGame() {
        add(JoinGamePanel);
        setTitle("MEDAC Stars - Join Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());
    }

    public static void main(String[] args) {
        new JoinGame();
    }

    private void createUIComponents() {
        slot1Label = new JLabel();
        slot2Label = new JLabel();
        arenaNameLabel = new JLabel();
        slot3Label = new JLabel();
        slot4Label = new JLabel();

        ImageIcon imageIcon = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/placeholder.png");
        arenaNameLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT)));

        imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(73, 75, Image.SCALE_DEFAULT));

        slot1Label.setIcon(imageIcon);
        slot2Label.setIcon(imageIcon);
        slot3Label.setIcon(imageIcon);
        slot4Label.setIcon(imageIcon);
    }
}