import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PacManGame extends JFrame{
	
	private JPanel contentPane;
	Graphics g;
	
	public static void main(String[] args) {
		
		PacMan player = new PacMan();
		Ghost Inky = new Ghost();
		Ghost Blinky = new Ghost();
		Ghost Pinky = new Ghost();
		Ghost Clyde = new Ghost();
	
		World game = new World(player, Inky, Blinky, Pinky, Clyde);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacManGame window = new PacManGame();
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
	
	public void drawWall(int x, int y) {
		g.setColor(Color.BLUE);
		g.fillRect(x,y,15,15);
	}
	public void drawPellet(int x, int y) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 12, 12);
	}
	public void drawPoint(int x, int y) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 7, 7);
	}
	public void drawGhost(int x, int y) {
		g.setColor(Color.PINK);
		g.fillRect(x,y,13,13);
	}
	public void drawPacMan(int x, int y) {
		g.setColor(Color.YELLOW);
		g.fillOval(x,y,13,13);
	}
	public void drawEmptySquare(int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x,y,15,15);
	}
	
	//draws the world
	public void draw(Graphics g) {
		for (int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==World.gameThings.WALL) {
					drawWall((i*15),(j*15));
				}else if(board[i][j]==World.gameThings.PELLET) {
					drawPellet((i*7),(j*7));
				}else if(board[i][j]==World.gameThings.POINT) {
					drawPoint((i*7),(j*7));
				}else if(board[i][j]==World.gameThings.GHOST) {
					drawGhost((i*15),(j*15));
				}else if(board[i][j]==World.gameThings.PACMAN) {
					drawPacMan((i*7),(j*7));
				}else{
					drawEmptySquare((i*15),(j*15));
				}
			}System.out.println();
		}
	}
	
}
