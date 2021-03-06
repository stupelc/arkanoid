package background;

import biuoop.DrawSurface;
import spirtes.Sprite;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * FallBck Class.
 */
public class FallBack implements Sprite {
    private BufferedImage image;

    /**
     * the constructor.
     */
    public FallBack() {
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/resources/background_images/fall.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param d a drawSurface
     *          draw the sprite to the screen
     */
    public void drawOn(DrawSurface d) {
        d.drawImage(0, 0, this.image);
    }

    /**
     * @param dt dt
     *           notify the sprite that time has passed.
     */
    public void timePassed(double dt) {

    }

}