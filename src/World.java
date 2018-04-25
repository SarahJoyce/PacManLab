import java.awt.Graphics;
import javax.swing.*;

public class World extends GraphicsEngine{

	//need to add positions for blocked off walls
	
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
	
	public void drawWall() {
		System.out.print("Wall");
	}
	public void drawPellet() {
		System.out.print("Pellet");
	}
	public void drawPoint() {
		System.out.print("Point");
	}
	public void drawGhost() {
		System.out.print("Ghost");
	}
	public void drawPacMan() {
		System.out.print("PacMan");
	}
	
	//draws the world
	public void draw() {
		for (int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==gameThings.WALL) {
					drawWall();
				}else if(board[i][j]==gameThings.PELLET) {
					drawPellet();	
				}else if(board[i][j]==gameThings.POINT) {
					drawPoint();
				}else if(board[i][j]==gameThings.GHOST) {
					drawGhost();
				}else if(board[i][j]==gameThings.PACMAN) {
					drawPacMan();
				}else{
					System.out.print("empty");
				}System.out.print("\t");
			}System.out.println();
		}
	}
	
	//gets rid of objects; for example when pacman eats the pellet, it has to disappear
	public void delete() {}
	
	public void update() {}
	
}
