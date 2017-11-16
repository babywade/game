import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;

public class game {
	public static void main(String[] args) {
		//action thread
		EventQueue.invokeLater(() -> {
				JFrame frame = new DrawFrame();
				frame.setTitle("game");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);			
			});
	}
}

class DrawFrame extends JFrame {
	private static final int DEFAULT_X = 650;
	private static final int DEFAULT_Y = 150;

	public DrawFrame() {
		add(new DrawCanvas());
		pack();
		//setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation(DEFAULT_X, DEFAULT_Y);
	}
}

class DrawCanvas extends JComponent {
	//public static final int MESSAGE_X = 75;
	//public static final int MESSAGE_Y = 100;

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 600;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		String message = "Hello, World!";
		
		Font f = new Font("Times New Roman", Font.BOLD, 36);
		g2.setFont(f);
		
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(message, context);
		
		double x = (getWidth() - bounds.getWidth()) / 2;
		double y = (getHeight() - bounds.getHeight()) / 2;
		
		double ascent = bounds.getY();
		double baseY = y ;
		
		g2.drawString(message, (int) x, (int) y);
		
		g2.setPaint(Color.RED);
		
		g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
		
		Rectangle2D rect = new Rectangle2D.Double(x, y + ascent, bounds.getWidth(), bounds.getHeight());
		g2.draw(rect);
	}

	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
