import java.awt.image.BufferedImage;

public class Hero extends FlyingObjects {
	
	private int speed;
	private BufferedImage[] images = {};
	private int index = 0;
	
	private int life;
	
	public Hero(int x, int y, int life) {
		this.images = new BufferedImage[] {ShootGame.hero0, ShootGame.hero1};
		this.image = ShootGame.hero0;
		this.width = image.getWidth();
		this.height = image.getHeight();
		this.x = x;
		this.y = y;
		this.life = life;
		this.speed = 3;
	}
	
	public void addLife() {
		life++;
	}
	
	public void subLife() {
		life--;
	}
	
	public int getLife() {
		return life;
	}
	
	public void moveLeft() {
		this.x -= speed;
	}
	
	public void moveRight() {
		this.x += speed;
	}
	
	public void moveUp() {
		this.y += speed;
	}
	
	public void moveDown() {
		this.y -= speed;
	}
}	
