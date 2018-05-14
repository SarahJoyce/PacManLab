import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
//primary game logic goes here
public class PacManGame extends JPanel {
	private static final long serialVersionUID = 1L;

	IEverythingGraphics graphicsEngine;
	World game;

	public PacManGame(IEverythingGraphics graphicsEngine) {
		this.graphicsEngine = graphicsEngine;
		this.game = new World();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(225,225);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		graphicsEngine.draw(g, game);
	}
}
