import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsEngine implements IEverythingGraphics {
	// draws the world
	@Override
	public void draw(Graphics g, World game) {
		for (int i = 0; i < game.board2.size(); i++) {
			GameObject obj = game.board2.get(i);
			switch(obj.objectType) {
				case WALL:
					drawWall((Wall) obj, g);
					break;
				case PELLET:
					drawPellet((Pellet) obj, g);
					break;
				case POINT:
					drawPoint((Point) obj, g);
					break;
				case GHOST:
					drawGhost((Ghost) obj, g);
					break;
				case PACMAN:
					drawPacMan((PacMan) obj, g);
					break;
				default:
					drawEmptySquare((EmptyGameObject) obj, g);
					break;
		}
		}
		drawGhost(game.Blinky, g);
		drawGhost(game.Clyde, g);
		drawGhost(game.Inky, g);
		drawGhost(game.Pinky, g);
		drawPacMan(game.player, g);
		drawGameBar(g, game);
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
		g.setColor(Color.GREEN);
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
		g.setColor(ghost.color);
		g.fillRect(pt.x, pt.y, 26, 26);
	}

	private void drawPacMan(PacMan pacman, Graphics g) {
		java.awt.Point pt = getCoords(pacman);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
		switch(pacman.direction) {
		case "right":
			//resting position
			g.setColor(Color.YELLOW);
			g.fillArc(pt.x, pt.y, 26, 26, 30, 300);
			//open
			//g.fillArc(pt.x,pt.y,26,26,60,250);
			//closed
			//g.fillOval(pt.x,pt.y,26,26);
			break;
		case "left":
			//resting position
			g.setColor(Color.YELLOW);
			g.fillArc(pt.x, pt.y, 26, 26, 210, 300);
			break;
		case "up":
			//resting position
			g.setColor(Color.YELLOW);
			g.fillArc(pt.x, pt.y, 26, 26, 120, 300);
			break;
		case "down":
			//resting position
			g.setColor(Color.YELLOW);
			g.fillArc(pt.x, pt.y, 26, 26, 300, 300);
			break;
		default:
			//resting position
			g.setColor(Color.YELLOW);
			g.fillArc(pt.x, pt.y, 26, 26, 30, 300);
			//open
			//g.fillArc(pt.x,pt.y,26,26,60,250);
			//closed
			//g.fillOval(pt.x,pt.y,26,26);
			break;
	}
	}

	private void drawEmptySquare(EmptyGameObject empty, Graphics g) {
		java.awt.Point pt = getCoords(empty);
		g.setColor(Color.BLACK);
		g.fillRect(pt.x, pt.y, 30, 30);
	}
	
	private void drawGameBar(Graphics g, World game) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("TimesRoman", Font.BOLD, 25)); 
		//points
		g.drawString("Points: " + game.numPoints, 15, 450);
		//lives
		g.drawString("Lives: " + game.player.numLives, 350, 450);
	}

	private java.awt.Point getCoords(GameObject obj) {
		int scale = 30;
		return new java.awt.Point(obj.xposition * scale, obj.yposition * scale);
	}
}
