package medac.stars.utils;

import java.awt.*;

/**
 * Utility class for creating and retrieving custom fonts.
 */
public class FontBuilder {
    private static final String FONT_PATH = "./src/main/java/medac/stars/ui/assets/fonts/";

    /**
     * Loads and returns a custom font based on the filename provided.
     *
     * @param name the filename of the font
     * @return the Font object, or a default font if loading fails
     */
    public static Font getFont(String name) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new java.io.File(FONT_PATH + name)).deriveFont(12f);
            ge.registerFont(font);
            return font;
        } catch (FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return new Font("Arial", Font.BOLD, 12);
        }
    }
}
