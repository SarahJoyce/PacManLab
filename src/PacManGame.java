import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

//primary game logic goes here
public class PacManGame extends JPanel implements KeyListener {

	IEverythingGraphics graphicsEngine;
	World game;

	public PacManGame(IEverythingGraphics graphicsEngine) {
		this.graphicsEngine = graphicsEngine;
		this.game = new World();
		this.addKeyListener(this);
		this.setFocusable(true);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(450, 450);
	}

	public void paint(Graphics g) {
		super.paintComponents(g);
		graphicsEngine.draw(g, game);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == 38) {
			game.player.moveUp();
		}
		if (e.getKeyCode() == 40) {
			game.player.moveDown();
		}
		if (e.getKeyCode() == 37) {
			game.player.moveLeft();
		}
		if (e.getKeyCode() == 39) {
			game.player.moveRight();
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
