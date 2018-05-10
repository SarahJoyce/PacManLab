import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PacManGame extends JFrame{
	
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

	public PacManGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		FlowLayout flow = new FlowLayout();
		contentPane.setLayout(flow);
		setContentPane(contentPane);
	}
	
	public void drawWall(int x, int y, Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x,y,15,15);
	}
	public void drawPellet(int x, int y, Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 12, 12);
	}
	public void drawPoint(int x, int y, Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 7, 7);
	}
	public void drawGhost(int x, int y, Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x,y,13,13);
	}
	public void drawPacMan(int x, int y, Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x,y,13,13);
	}
	public void drawEmptySquare(int x, int y, Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x,y,15,15);
	}
	
	//draws the world
	public void draw(Graphics g) {
		for (int i=0; i<game.board.length; i++) {
			for(int j=0; j<game.board[0].length; j++) {
				if(game.board[i][j] == GameObject.ObjectType.WALL) {
					drawWall((i*15),(j*15),g);
				}else if(game.board[i][j] == GameObject.ObjectType.PELLET) {
					drawPellet((i*7),(j*7),g);
				}else if(game.board[i][j] == GameObject.ObjectType.POINT) {
					drawPoint((i*7),(j*7),g);
				}else if(game.board[i][j] == GameObject.ObjectType.GHOST) {
					drawGhost((i*15),(j*15),g);
				}else if(game.board[i][j] == GameObject.ObjectType.PACMAN) {
					drawPacMan((i*7),(j*7),g);
				}else{
					drawEmptySquare((i*15),(j*15),g);
				}
			}System.out.println();
		}
	}
	
}
