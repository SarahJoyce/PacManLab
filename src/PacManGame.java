import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

//primary game logic goes here
public class PacManGame extends JPanel /*implements KeyListener*/{
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

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		graphicsEngine.draw(g, game);
	}
	
	
	/*@Override
    public void keyPressed(KeyEvent e) {
      if(e.getKeyCode().equals(LEFT)) {
   	   	player = new PacMan((x-1),y,false,points);
      }
      if(e.getKeyCode().equals(RIGHT)) {
   	   	player = new PacMan((x+1),y,false,points);
      }
      if(e.getKeyCode().equals(UP)) {
   	   	player = new PacMan(x,(y-1),false,points);
      }
      if(e.getKeyCode().equals(DOWN)) {
   	   	player = new PacMan(x,(y+1),false,points);
      }
    }*/
	
}
