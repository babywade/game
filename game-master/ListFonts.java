import java.awt.*;

public class ListFonts {
	public static void main(String[] args) {
		String[] fontNames = GraphicsEnvironment
			.getLocalGraphicsEnvironment()
			.getAvailableFontFamilyNames();
		for (String fontname : fontNames) {
			System.out.println(fontname);
		}
	}
}