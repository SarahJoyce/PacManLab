import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsEngine implements IEverythingGraphics {
	// draws the world
	@Override
	public void draw(Graphics g, World game) {
		/*
		 * for (int i = 0; i < game.board.length; i++) { for (int j = 0; j <
		 * game.board[0].length; j++) { if (game.board[i][j] ==
		 * GameObject.ObjectType.WALL) { drawWall((i * 15), (j * 15), g); } else if
		 * (game.board[i][j] == GameObject.ObjectType.PELLET) { drawPellet((i * 15), (j
		 * * 15), g); } else if (game.board[i][j] == GameObject.ObjectType.POINT) {
		 * drawPoint((i * 15), (j * 15), g); } else if (game.board[i][j] ==
		 * GameObject.ObjectType.GHOST) { drawGhost((i * 15), (j * 15), g); } else if
		 * (game.board[i][j] == GameObject.ObjectType.PACMAN) { drawPacMan((i * 15), (j
		 * * 15), g); } else { drawEmptySquare((i * 15), (j * 15), g); } }
		 * System.out.println(); }
		 */
		for (int i = 0; i < game.board2.size(); i++) {
			GameObject obj = game.board2.get(i);
			if (obj.objectType == GameObject.ObjectType.WALL) {
				drawWall((Wall) obj, g);
			} else if (obj.objectType == GameObject.ObjectType.PELLET) {
				drawPellet((Pellet) obj, g);
			} else if (obj.objectType == GameObject.ObjectType.POINT) {
				drawPoint((Point) obj, g);
			} else if (obj.objectType == GameObject.ObjectType.GHOST) {
				drawGhost((Ghost) obj, g);
			} else if (obj.objectType == GameObject.ObjectType.PACMAN) {
				drawPacMan((PacMan) obj, g);
			} else {
				drawEmptySquare((EmptyGameObject) obj, g);
			}
		}
	}

	private void drawWall(Wall wall, Graphics g) {
		java.awt.Point pt = getCoords(wall);
		g.setColor(Color.BLUE);
		g.fillRect(pt.x, pt.y, 15, 15);
	}

	private void drawPellet(Pellet pellet, Graphics g) {
		java.awt.Point pt = getCoords(pellet);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 12, 12);
	}

	private void drawPoint(Point point, Graphics g) {
		java.awt.Point pt = getCoords(point);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 7, 7);
	}

	private void drawGhost(Ghost ghost, Graphics g) {
		java.awt.Point pt = getCoords(ghost);
		g.setColor(Color.PINK);
		g.fillRect(pt.x, pt.y, 13, 13);
	}

	private void drawPacMan(PacMan pacman, Graphics g) {
		java.awt.Point pt = getCoords(pacman);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 13, 13);
	}

	private void drawEmptySquare(EmptyGameObject empty, Graphics g) {
		java.awt.Point pt = getCoords(empty);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 15, 15);
	}

	private java.awt.Point getCoords(GameObject obj) {
		int scale = 15;
		return new java.awt.Point(obj.xposition * scale, obj.yposition * scale);
	}
}
