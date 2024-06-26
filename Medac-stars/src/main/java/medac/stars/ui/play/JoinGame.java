package medac.stars.ui.play;

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
    private JComboBox comboBox4;
    private JLabel player2Label;
    private JLabel player4Label;
    private boolean isUpdatingComponents = false;

    public JoinGame() {
        add(JoinGamePanel);
        setTitle("MEDAC Stars - Join Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        // Set frame icon
        ImageIcon logo = new ImageIcon("./src/main/java/medac/stars/ui/assets/images/logo.png");
        setIconImage(logo.getImage());

        // Set fonts for components
        Font montserratSemiBold = FontBuilder.getFont("Montserrat-SemiBold.ttf");
        joinButton.setFont(montserratSemiBold.deriveFont(12f));
        joinButton2.setFont(montserratSemiBold.deriveFont(12f));
        joinButton3.setFont(montserratSemiBold.deriveFont(12f));
        joinButton4.setFont(montserratSemiBold.deriveFont(12f));
        cancelButton.setFont(montserratSemiBold.deriveFont(12f));
        slot1Label.setFont(montserratSemiBold.deriveFont(12f));
        slot2Label.setFont(montserratSemiBold.deriveFont(12f));
        slot3Label.setFont(montserratSemiBold.deriveFont(12f));
        slot4Label.setFont(montserratSemiBold.deriveFont(12f));
        arenaNameLabel.setFont(montserratSemiBold.deriveFont(12f));
        comboBox1.setFont(montserratSemiBold.deriveFont(12f));
        comboBox2.setFont(montserratSemiBold.deriveFont(12f));
        comboBox3.setFont(montserratSemiBold.deriveFont(12f));
        comboBox4.setFont(montserratSemiBold.deriveFont(12f));
        player1Label.setFont(montserratSemiBold.deriveFont(12f));
        player2Label.setFont(montserratSemiBold.deriveFont(12f));
        player3Label.setFont(montserratSemiBold.deriveFont(12f));
        player4Label.setFont(montserratSemiBold.deriveFont(12f));

        // Set initial visibility of labels and combo boxes
        player1Label.setVisible(false);
        player2Label.setVisible(false);
        player3Label.setVisible(false);
        player4Label.setVisible(false);

        comboBox1.setVisible(false);
        comboBox2.setVisible(false);
        comboBox3.setVisible(false);
        comboBox4.setVisible(false);

        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isUpdatingComponents = true;
                joinButton.removeActionListener(this);
                comboBox1.setVisible(true);
                joinButton.setVisible(false);
                JPanel1.repaint();
                comboBox1.addItem("medacstar1");
                comboBox1.addItem("medacstar2");
                comboBox1.addItem("medacstar3");
                isUpdatingComponents = false;
            }
        });

        joinButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isUpdatingComponents = true;
                joinButton2.removeActionListener(this);
                comboBox2.setVisible(true);
                joinButton2.setVisible(false);
                JPanel1.repaint();
                comboBox2.addItem("medacstar1");
                comboBox2.addItem("medacstar2");
                comboBox2.addItem("medacstar3");
                isUpdatingComponents = false;
            }
        });
        joinButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isUpdatingComponents = true;
                joinButton3.removeActionListener(this);
                comboBox3.setVisible(true);
                joinButton3.setVisible(false);
                JPanel1.repaint();
                comboBox3.addItem("medacstar1");
                comboBox3.addItem("medacstar2");
                comboBox3.addItem("medacstar3");
                isUpdatingComponents = false;
            }
        });
        joinButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isUpdatingComponents = true;
                joinButton4.removeActionListener(this);
                comboBox4.setVisible(true);
                joinButton4.setVisible(false);
                JPanel1.repaint();
                comboBox4.addItem("medacstar1");
                comboBox4.addItem("medacstar2");
                comboBox4.addItem("medacstar3");
                isUpdatingComponents = false;
            }
        });
        comboBox1.addActionListener(e -> {
            if (isUpdatingComponents) {
                return;
            }

            player1Label.setVisible(true);
            player1Label.setText("<html>&nbsp;&nbsp;Jugador 1:<br>" + comboBox1.getSelectedItem() + "</html>");
            comboBox1.setVisible(false);
            JPanel1.repaint();
        });

        comboBox2.addActionListener(e -> {
            if (isUpdatingComponents) {
                return;
            }

            player2Label.setVisible(true);
            player2Label.setText("<html>&nbsp;&nbsp;Jugador 2:<br>" + comboBox2.getSelectedItem() + "</html>");
            comboBox2.setVisible(false);
            JPanel1.repaint();
        });
        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isUpdatingComponents) {
                    return;
                }

                player3Label.setVisible(true);
                player3Label.setText("<html>&nbsp;&nbsp;Jugador 3:<br>" + comboBox3.getSelectedItem() + "</html>");
                comboBox3.setVisible(false);
                JPanel1.repaint();
            }
        });
        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isUpdatingComponents) {
                    return;
                }

                player4Label.setVisible(true);
                player4Label.setText("<html>&nbsp;&nbsp;Jugador 4:<br>" + comboBox4.getSelectedItem() + "</html>");
                comboBox4.setVisible(false);
                JPanel1.repaint();
            }
        });
    }

    private void createUIComponents() {
        comboBox2 = new JComboBox();

        // Customize combo box selection background and foreground colors
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