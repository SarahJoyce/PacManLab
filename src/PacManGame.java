import java.awt.Dimension;
import java.awt.Graphics;
<<<<<<< HEAD
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
=======
>>>>>>> 500522f1ed2072bb6f8fdeee5a3c4d7086fad5ce
import javax.swing.JPanel;
//primary game logic goes here
public class PacManGame extends JPanel {
	private static final long serialVersionUID = 1L;

<<<<<<< HEAD
public class PacManGame extends JFrame implements KeyListener{
	
	private JPanel contentPane;
	static World game;
	
	public static void main(String[] args) {
		
		PacMan player = new PacMan(7, 6, false, 0);
		Ghost Inky = new Ghost(2, 11, false, false, GameObject.ObjectType.EMPTY);
		Ghost Blinky = new Ghost(3, 11, false, false, GameObject.ObjectType.EMPTY);
		Ghost Pinky = new Ghost(4, 11, false, false, GameObject.ObjectType.EMPTY);
		Ghost Clyde = new Ghost(5, 11, false, false, GameObject.ObjectType.EMPTY);
		
		game = new World();
		
		Random rand = new Random();
		int inkyDirec;
		int blinkyDirec;
		int pinkyDirec;
		int clydeDirec;
		
		//Do this every time there's a keystroke
		inkyDirec = rand.nextInt(4);
		Inky.nextPosn(inkyDirec);
		blinkyDirec = rand.nextInt(4);
		Blinky.nextPosn(blinkyDirec);
		pinkyDirec = rand.nextInt(4);
		Pinky.nextPosn(pinkyDirec);
		clydeDirec = rand.nextInt(4);
		Clyde.nextPosn(clydeDirec);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacManGame window = new PacManGame() {
						@Override public void paintComponents(Graphics g) {
				            game.draw();
				          }
					};
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
=======
	IEverythingGraphics graphicsEngine;
	World game;
>>>>>>> 500522f1ed2072bb6f8fdeee5a3c4d7086fad5ce

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
<<<<<<< HEAD
	
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
	
=======
>>>>>>> 500522f1ed2072bb6f8fdeee5a3c4d7086fad5ce
}
