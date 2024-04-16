package medac.stars.utils;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private static final String IMAGE_PATH = "./src/main/java/medac/stars/ui/assets/images/";
    private Image backgroundImage;

    /**
     * Constructor that initializes the ImagePanel with a specific image file.
     *
     * @param fileName the name of the image file to set as background
     */
    public ImagePanel(String fileName) {
        setOpaque(false);
        try {
            backgroundImage = new ImageIcon(IMAGE_PATH + fileName).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Custom paint component for drawing the background image.
     *
     * @param g the Graphics object used for painting
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
