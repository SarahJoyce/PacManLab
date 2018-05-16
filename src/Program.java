import javax.swing.*;
import java.awt.*;

//Don't change this code!

public class Program {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("PAC-MAN");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container contentPanel = frame.getContentPane();
				contentPanel.add(new PacManGame(new GraphicsEngine()));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
