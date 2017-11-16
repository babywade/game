import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;

public class game {
	public static void main(String[] args) {
		//action thread
		EventQueue.invokeLater(() -> {
				JFrame frame = new GameFrame();
			});
	}
}


