import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.*;

import javafx.scene.shape.Circle;

public class World extends GraphicsEngine{
	
	Graphics g;
	GameObject.ObjectType[][] board;
	
	
	
	public World() {
		board = new GameObject.ObjectType[15][15];
		
		for (int i = 0; i < 14; i++ ) {
			board[0][i] = GameObject.ObjectType.WALL;
			board[14][i + 1] = GameObject.ObjectType.WALL;
			board[i + 1][0] = GameObject.ObjectType.WALL;
			board[i][14] = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 11; i++) {
			board[1][i + 2] = GameObject.ObjectType.POINT;
			board[i + 2][13] = GameObject.ObjectType.POINT;
			board[i + 2][1] = GameObject.ObjectType.POINT;
			board[13][i + 2] = GameObject.ObjectType.POINT;
		}
		for (int i = 0; i < 5; i++) {
			board[i + 2][3] = GameObject.ObjectType.POINT;
			board[i + 2][6] = GameObject.ObjectType.POINT;
			board[8][i + 2] = GameObject.ObjectType.WALL;
			board[i + 2][4] = GameObject.ObjectType.WALL;
			board[i + 2][5] = GameObject.ObjectType.WALL;
			board[i + 7][7] = GameObject.ObjectType.WALL;
			board[12][i + 7] = GameObject.ObjectType.WALL;
			board[5][i + 8] = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 4; i++) {
			board[7][i + 3] = GameObject.ObjectType.POINT;
			board[9][i + 2] = GameObject.ObjectType.POINT;
			board[6][i + 8] = GameObject.ObjectType.POINT;
			board[11][i + 8] = GameObject.ObjectType.POINT;
			board[i + 7][8] = GameObject.ObjectType.POINT;
			board[i + 7][11] = GameObject.ObjectType.POINT;
			board[4][i + 9] = GameObject.ObjectType.POINT;
			board[i + 2][7] = GameObject.ObjectType.WALL;
			board[2][i + 9] = GameObject.ObjectType.WALL;
			board[3][i + 9] = GameObject.ObjectType.WALL;
			board[i + 7][9] = GameObject.ObjectType.WALL;
			board[i + 7][10] = GameObject.ObjectType.WALL;
			board[i + 6][12] = GameObject.ObjectType.WALL;
			board[10][i + 2] = GameObject.ObjectType.WALL;
			board[12][i + 2] = GameObject.ObjectType.WALL;
			board[11][i + 2] = GameObject.ObjectType.GHOST;
		}
		for (int i = 0; i < 3; i++) {
			board[i + 2][8] = GameObject.ObjectType.POINT;
			board[i + 10][6] = GameObject.ObjectType.POINT;
			board[i + 10][12] = GameObject.ObjectType.WALL;
			board[i + 2][2] = GameObject.ObjectType.WALL;
			board[i + 5][2] = GameObject.ObjectType.WALL;
		}
		board[13][1] = GameObject.ObjectType.POINT;
		board[1][1] = GameObject.ObjectType.PELLET;
		board[1][13] = GameObject.ObjectType.PELLET;
		board[13][13] = GameObject.ObjectType.PELLET;
		board[9][6] = GameObject.ObjectType.PELLET;
		board[6][7] = GameObject.ObjectType.PACMAN;
	}
	
	//gets rid of objects; for example when pacman eats the pellet, it has to disappear
	public void delete() {}
	
	public void update() {}
	
}
