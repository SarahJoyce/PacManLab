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
	GameObject[][] board;
	
	
	
	public World(PacMan man, Ghost g1, Ghost g2, Ghost g3, Ghost g4) {
		man = man;
		g1 = g1;
		g2 = g2;
		g3 = g3;
		g4 = g4;
		board = new GameObject[15][15];
		for (int i = 0; i < 14; i++ ) {
			board[0][i].objectType = GameObject.ObjectType.WALL;
			board[14][i + 1].objectType = GameObject.ObjectType.WALL;
			board[i + 1][0].objectType = GameObject.ObjectType.WALL;
			board[i][14].objectType = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 11; i++) {
			board[1][i + 2].objectType = GameObject.ObjectType.POINT;
			board[i + 2][13].objectType = GameObject.ObjectType.POINT;
			board[i + 2][1].objectType = GameObject.ObjectType.POINT;
			board[13][i + 2].objectType = GameObject.ObjectType.POINT;
		}
		for (int i = 0; i < 5; i++) {
			board[i + 2][3].objectType = GameObject.ObjectType.POINT;
			board[i + 2][6].objectType = GameObject.ObjectType.POINT;
			board[8][i + 2].objectType = GameObject.ObjectType.WALL;
			board[i + 2][4].objectType = GameObject.ObjectType.WALL;
			board[i + 2][5].objectType = GameObject.ObjectType.WALL;
			board[i + 7][7].objectType = GameObject.ObjectType.WALL;
			board[12][i + 7].objectType = GameObject.ObjectType.WALL;
			board[5][i + 8].objectType = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 4; i++) {
			board[7][i + 3].objectType = GameObject.ObjectType.POINT;
			board[9][i + 2].objectType = GameObject.ObjectType.POINT;
			board[6][i + 8].objectType = GameObject.ObjectType.POINT;
			board[11][i + 8].objectType = GameObject.ObjectType.POINT;
			board[i + 7][8].objectType = GameObject.ObjectType.POINT;
			board[i + 7][11].objectType = GameObject.ObjectType.POINT;
			board[4][i + 9].objectType = GameObject.ObjectType.POINT;
			board[i + 2][7].objectType = GameObject.ObjectType.WALL;
			board[2][i + 9].objectType = GameObject.ObjectType.WALL;
			board[3][i + 9].objectType = GameObject.ObjectType.WALL;
			board[i + 7][9].objectType = GameObject.ObjectType.WALL;
			board[i + 7][10].objectType = GameObject.ObjectType.WALL;
			board[i + 6][12].objectType = GameObject.ObjectType.WALL;
			board[10][i + 2].objectType = GameObject.ObjectType.WALL;
			board[12][i + 2].objectType = GameObject.ObjectType.WALL;
			board[11][i + 2].objectType = GameObject.ObjectType.GHOST;
		}
		for (int i = 0; i < 3; i++) {
			board[i + 2][8].objectType = GameObject.ObjectType.POINT;
			board[i + 10][6].objectType = GameObject.ObjectType.POINT;
			board[i + 10][12].objectType = GameObject.ObjectType.WALL;
			board[i + 2][2].objectType = GameObject.ObjectType.WALL;
			board[i + 5][2].objectType = GameObject.ObjectType.WALL;
		}
		board[13][1].objectType = GameObject.ObjectType.POINT;
		board[1][1].objectType = GameObject.ObjectType.PELLET;
		board[1][13].objectType = GameObject.ObjectType.PELLET;
		board[13][13].objectType = GameObject.ObjectType.PELLET;
		board[9][6].objectType = GameObject.ObjectType.PELLET;
		board[6][7].objectType = GameObject.ObjectType.PACMAN;
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
				if(board[i][j].objectType == GameObject.ObjectType.WALL) {
					drawWall((i*15),(j*15));
				}else if(board[i][j].objectType == GameObject.ObjectType.PELLET) {
					drawPellet((i*7),(j*7));
				}else if(board[i][j].objectType == GameObject.ObjectType.POINT) {
					drawPoint((i*7),(j*7));
				}else if(board[i][j].objectType == GameObject.ObjectType.GHOST) {
					drawGhost((i*15),(j*15));
				}else if(board[i][j].objectType == GameObject.ObjectType.PACMAN) {
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
