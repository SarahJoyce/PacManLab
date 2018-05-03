import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.*;

import javafx.scene.shape.Circle;

public class World extends GraphicsEngine{
	
	Graphics g;
	PacMan man = new PacMan();
	Ghost g1 = new Ghost();
	Ghost g2 = new Ghost();
	Ghost g3 = new Ghost();
	Ghost g4 = new Ghost();
	Object[][] board;
	enum gameThings {EMPTY, WALL, POINT, PELLET, GHOST, PACMAN;}
	
	
	public World(PacMan man, Ghost g1, Ghost g2, Ghost g3, Ghost g4) {
		man = man;
		g1 = g1;
		g2 = g2;
		g3 = g3;
		g4 = g4;
		board = new Object[][] {
			{gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL},
			{gameThings.WALL, gameThings.PELLET, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.PACMAN, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.GHOST, gameThings.GHOST, gameThings.GHOST, gameThings.GHOST, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL},
			{gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL}
		};
		
	}
	
	/*public void drawWall(int x, int y) {
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
				if(board[i][j]==gameThings.WALL) {
					drawWall((i*15),(j*15));
				}else if(board[i][j]==gameThings.PELLET) {
					drawPellet((i*7),(j*7));
				}else if(board[i][j]==gameThings.POINT) {
					drawPoint((i*7),(j*7));
				}else if(board[i][j]==gameThings.GHOST) {
					drawGhost((i*15),(j*15));
				}else if(board[i][j]==gameThings.PACMAN) {
					drawPacMan((i*7),(j*7));
				}else{
					drawEmptySquare((i*15),(j*15));
				}
			}System.out.println();
		}
	}*/
	
	//I know this one is not 100% right but it's a start
	public void pacmanEats() {
		if(board[man.xpos][man.ypos]==gameThings.POINT || board[man.xpos][man.ypos]==gameThings.PELLET) {
			board[man.xpos][man.ypos]=gameThings.EMPTY;
		}
	}
	
	//gets rid of objects; for example when pacman eats the pellet, it has to disappear
	public void delete() {}
	
	public void update() {}
	
}
