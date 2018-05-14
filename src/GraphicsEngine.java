import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsEngine implements IEverythingGraphics {
	// draws the world
	@Override
	public void draw(Graphics g, World game) {
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
		g.fillRect(pt.x, pt.y, 30, 30);
	}

	private void drawPellet(Pellet pellet, Graphics g) {
		java.awt.Point pt = getCoords(pellet);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 24, 24);
	}

	private void drawPoint(Point point, Graphics g) {
		java.awt.Point pt = getCoords(point);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 14, 14);
	}

	private void drawGhost(Ghost ghost, Graphics g) {
		java.awt.Point pt = getCoords(ghost);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
		g.setColor(Color.PINK);
		g.fillRect(pt.x, pt.y, 26, 26);
	}

	private void drawPacMan(PacMan pacman, Graphics g) {
		java.awt.Point pt = getCoords(pacman);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
		g.setColor(Color.YELLOW);
		g.fillOval(pt.x, pt.y, 26, 26);
	}

	private void drawEmptySquare(EmptyGameObject empty, Graphics g) {
		java.awt.Point pt = getCoords(empty);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
	}

	private java.awt.Point getCoords(GameObject obj) {
		int scale = 30;
		return new java.awt.Point(obj.xposition * scale, obj.yposition * scale);
	}
}
