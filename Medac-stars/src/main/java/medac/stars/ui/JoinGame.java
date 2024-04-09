package medac.stars.ui;

import medac.stars.utils.FontBuilder;
import medac.stars.utils.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinGame extends JFrame {

    private JPanel JoinGamePanel;
    private JButton joinButton;
    private JButton joinButton2;
    private JButton joinButton4;
    private JButton cancelButton;
    private JLabel slot1Label;
    private JLabel slot2Label;
    private JLabel slot3Label;
    private JLabel slot4Label;
    private JLabel arenaNameLabel;
    private JPanel JPanel1;
    private JComboBox comboBox2;
    private JLabel player1Label;
    private JLabel player3Label;
    private JComboBox comboBox1;
    private JButton joinButton3;
    private JComboBox comboBox3;
    private JPasswordField passwordField1;


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

        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        joinButton.setFont(montserratSemiBold.deriveFont(12f));
        joinButton2.setFont(montserratSemiBold.deriveFont(12f));
        joinButton4.setFont(montserratSemiBold.deriveFont(12f));
        cancelButton.setFont(montserratSemiBold.deriveFont(12f));
        slot1Label.setFont(montserratSemiBold.deriveFont(12f));
        slot2Label.setFont(montserratSemiBold.deriveFont(12f));
        slot3Label.setFont(montserratSemiBold.deriveFont(12f));
        slot4Label.setFont(montserratSemiBold.deriveFont(12f));
        arenaNameLabel.setFont(montserratSemiBold.deriveFont(12f));
        comboBox2.setFont(montserratSemiBold.deriveFont(12f));

        player1Label.setVisible(false);
        player3Label.setVisible(false);

        comboBox1.setVisible(false);
        comboBox2.setVisible(false);
        comboBox3.setVisible(false);

        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joinButton.removeActionListener(this);
                comboBox1.setVisible(true);
                joinButton.setVisible(false);
                JPanel1.repaint();
                comboBox1.addItem("medacstar1");
                comboBox1.addItem("medacstar2");
                comboBox1.addItem("medacstar3");
            }
        });

        joinButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joinButton2.removeActionListener(this);
                comboBox2.setVisible(true);
                joinButton2.setVisible(false);
                JPanel1.repaint();
                comboBox2.addItem("medacstar1");
                comboBox2.addItem("medacstar2");
                comboBox2.addItem("medacstar3");
            }
        });
        joinButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joinButton3.removeActionListener(this);
                comboBox3.setVisible(true);
                joinButton3.setVisible(false);
                JPanel1.repaint();
                comboBox3.addItem("medacstar1");
                comboBox3.addItem("medacstar2");
                comboBox3.addItem("medacstar3");
            }
        });
    }

    public static void main(String[] args) {
        new JoinGame();
    }

    private void createUIComponents() {
        comboBox2 = new JComboBox();
        UIManager.put("ComboBox.selectionBackground", new Color(255, 255, 255));
        UIManager.put("ComboBox.selectionForeground", new Color(0, 0, 0));

        JoinGamePanel = new JPanel();
        JoinGamePanel = new ImagePanel("background.jpg");

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