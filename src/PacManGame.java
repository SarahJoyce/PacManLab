import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

//primary game logic goes here
public class PacManGame extends JPanel implements KeyListener {

	IEverythingGraphics graphicsEngine;
	World game;
	Timer ghostTimer = new Timer();

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
		if (!isArrowKey(e)) {
			return;
		}
		moveGhost(game.Inky);
		moveGhost(game.Blinky);
		moveGhost(game.Pinky);
		moveGhost(game.Clyde);
		movePacMan(e);
		repaint();
	}

	private boolean isArrowKey(KeyEvent e) {
		int key = e.getKeyCode();
		// try to find correct enum values so no magic numbers
		return key == 37 || key == 38 || key == 39 || key == 40;
	}

	private void movePacMan(KeyEvent e) {
		int prevX = game.player.xposition;
		int prevY = game.player.yposition;
		if (e.getKeyCode() == 38) {
			game.player.moveUp();
			if (game.isWall(game.player.xposition, game.player.yposition)) {
				game.player.moveDown();
			}
		}
		if (e.getKeyCode() == 40) {
			game.player.moveDown();
			if (game.isWall(game.player.xposition, game.player.yposition)) {
				game.player.moveUp();
			}
		}
		if (e.getKeyCode() == 37) {
			game.player.moveLeft();
			if (game.isWall(game.player.xposition, game.player.yposition)) {
				game.player.moveRight();
			}
		}
		if (e.getKeyCode() == 39) {
			game.player.moveRight();
			if (game.isWall(game.player.xposition, game.player.yposition)) {
				game.player.moveLeft();
			}
		}
		if (game.isGhost(game.player.xposition, game.player.yposition) && !game.Inky.isEdible) {
			game.player.die();
		}
		if (game.isPellet(game.player.xposition, game.player.yposition)) {
			game.Inky.makeEdible();
			game.Blinky.makeEdible();
			game.Pinky.makeEdible();
			game.Clyde.makeEdible();
			ghostTimer.schedule(new ghostTimerTask(game), 10000);
		}
		if (game.player.xposition != prevX || game.player.yposition != prevY) {
			game.addEmpty(prevX, prevY);
		}
	}

	private void moveGhost(Ghost ghost) {
		ghost.nextPosn();
		if (game.isWall(ghost.xposition, ghost.yposition)) {
			ghost.prevPosn();
		}
		if (ghost.xposition == game.player.xposition && ghost.yposition == game.player.yposition && ghost.isEdible) {
			ghost.die();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
