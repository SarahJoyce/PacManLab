import javax.swing.*;
import java.awt.*;

public class Program {

	public static void main(String[] args) {

		GraphicsEngine ge = new GraphicsEngine();
		PacManGame game = new PacManGame(ge);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("PAC-MAN");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container contentPanel = frame.getContentPane();
				contentPanel.add(game);
				frame.pack();
				frame.setVisible(true);
			}
		});

		game.game.player.moveRight();
		game.repaint();

	}
}
