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
		game.Inky.nextPosn();
		if (game.isWall(game.Inky.xposition, game.Inky.yposition)) {
			game.Inky.prevPosn();
		}
		game.Pinky.nextPosn();
		if (game.isWall(game.Pinky.xposition, game.Pinky.yposition)) {
			game.Pinky.prevPosn();
		}
		game.Blinky.nextPosn();
		if (game.isWall(game.Blinky.xposition, game.Blinky.yposition)) {
			game.Blinky.prevPosn();
		}
		game.Clyde.nextPosn();
		if (game.isWall(game.Clyde.xposition, game.Clyde.yposition)) {
			game.Clyde.prevPosn();
		}
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
		if (game.isGhost(game.player.xposition, game.player.yposition)) {
			game.player.die();
		}
		if (game.isPellet(game.player.xposition, game.player.yposition)) {
			game.Inky.makeEdible();
			game.Blinky.makeEdible();
			game.Pinky.makeEdible();
			game.Clyde.makeEdible();
			ghostTimer.schedule(new ghostTimerTask(game), 10000);
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
