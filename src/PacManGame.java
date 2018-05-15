import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

//primary game logic goes here
public class PacManGame extends JPanel {

	IEverythingGraphics graphicsEngine;
	World game;

	public PacManGame(IEverythingGraphics graphicsEngine) {
		this.graphicsEngine = graphicsEngine;
		this.game = new World();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(450, 450);
	}

	public void paint(Graphics g) {
		super.paintComponents(g);
		graphicsEngine.draw(g, game);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			game.player.moveUp();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			game.player.moveDown();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			game.player.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.player.moveRight();
		}
		repaint();
	}

}
