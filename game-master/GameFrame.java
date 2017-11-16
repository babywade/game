import javax.swing.ImageIcon;
import javax.swing.JFrame;

class GameFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 654;

	public GameFrame() {
		ShootGame myshootgame = new ShootGame();
		this.add(myshootgame);
		this.setTitle("game");
		this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		this.setAlwaysOnTop(true);
		this.setIconImage(new ImageIcon("img/ball.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
}
