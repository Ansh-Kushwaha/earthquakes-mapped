import java.applet.Applet;
import java.awt.Graphics;

public class AppletTest extends Applet{
	private String message;
	
	public void init() {
		message = "This is a rectangle";
		this.setSize(300, 300);
	}
	
	public void paint(Graphics g) {
		g.drawString(message, 80, 85);
		g.drawRect(75, 100, 150, 100);
	}
	
	public static void main(String[] args) {
		AppletTest app = new AppletTest();
		app.setVisible(true);
	}
}
