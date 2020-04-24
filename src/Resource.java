import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static javax.imageio.ImageIO.read;

public class Resource {
    private static Map<String, BufferedImage> resources;

    static {
        Resource.resources = new HashMap<>();
        try {
        Resource.resources.put("tankOne", read(TankGame.class.getClassLoader().getResource("tank1new.png")));
        Resource.resources.put("tankTwo", read(TankGame.class.getClassLoader().getResource("tank2new.png")));
        Resource.resources.put("bullet", read(TankGame.class.getClassLoader().getResource("BulletCropped.png")));
        Resource.resources.put("explosionSmall", read(TankGame.class.getClassLoader().getResource(
                "Explosion_small_still" +
                ".gif")));
        Resource.resources.put("background", read(TankGame.class.getClassLoader().getResource("background.png")));
        Resource.resources.put("breakableWall", read(TankGame.class.getClassLoader().getResource("WallBreakable.gif")));
        Resource.resources.put("breakableWallDamaged", read(TankGame.class.getClassLoader().getResource("WallBreakableDamaged.gif")));
        Resource.resources.put("unBreakableWall", read(TankGame.class.getClassLoader().getResource("WallUnbreakable" +
                ".gif")));
        Resource.resources.put("tank1life", read(TankGame.class.getClassLoader().getResource("tank1lifeicon.png")));
        Resource.resources.put("tank2life", read(TankGame.class.getClassLoader().getResource("tank2lifeicon.png")));
        Resource.resources.put("logo", read(TankGame.class.getClassLoader().getResource("tankgamelogo.png")));
        } catch (IOException exception) {
            exception.printStackTrace();
            // abandon ship if resources don't work
            System.exit(-5);
        }




    }

    public static Font infoFontBold = new Font("Helvetica", Font.BOLD, 19);
    public static Font buttonFont = new Font("Helvetica", Font.BOLD, 25);
    public static Font gameOverFont = new Font("Helvetica", Font.BOLD, 35);
    public static Font infoFont = new Font("Helvetica", Font.PLAIN, 18);

    public static BufferedImage getResourceImage(String key) {
        return Resource.resources.get(key);
    }
}
