import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ShootGame extends JPanel {
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	
	static { // ¾²Ì¬´úÂë¿é£¬³õÊ¼»¯Í¼Æ¬×ÊÔ´
		try {
			background = ImageIO.read(ShootGame.class
					.getResource("img/background.png"));
			start = ImageIO.read(ShootGame.class.getResource("img/start.png"));
			airplane = ImageIO
					.read(ShootGame.class.getResource("img/airplane.png"));
			bee = ImageIO.read(ShootGame.class.getResource("img/bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("img/bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("img/hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("img/hero1.png"));
			pause = ImageIO.read(ShootGame.class.getResource("img/pause.png"));
			gameover = ImageIO
					.read(ShootGame.class.getResource("img/gameover.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null); // »­±³¾°Í¼
		paintHero(g); // »­Ó¢ÐÛ»ú
		paintBullets(g); // »­×Óµ¯
		paintFlyingObjects(g); // »­·ÉÐÐÎï
		paintScore(g); // »­·ÖÊý
		paintState(g); // »­ÓÎÏ·×´Ì¬
	}
	
	public void paintHero(Graphics g) {
		
	}
	
	public void paintBullets(Graphics g) {
		
	}
	
	public void paintFlyingObjects(Graphics g) {
		
	}
	
	public void paintScore(Graphics g) {
		
	}
	
	public void paintState(Graphics g) {
		
	}
}
