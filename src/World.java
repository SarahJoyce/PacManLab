import java.awt.Color;
import java.awt.Dimension;
import java.util.*;

public class World {
	ArrayList<GameObject> board2;
	PacMan player;
	Ghost Inky;
	Ghost Blinky;
	Ghost Pinky;
	Ghost Clyde;
	Pellet p1;
	Pellet p2;
	Pellet p3;
	Pellet p4;
	int numPoints = 0;

	HashMap<Dimension, Wall> walls = new HashMap<Dimension, Wall>();
	HashMap<Dimension, Point> points = new HashMap<Dimension, Point>();

	public World() {
		initBoardList();
		player = new PacMan(7, 7, false, 0);
		Inky = new Ghost(2, 11, false, false, GameObject.ObjectType.EMPTY, Color.CYAN);
		Blinky = new Ghost(3, 11, false, false, GameObject.ObjectType.EMPTY, Color.RED);
		Pinky = new Ghost(4, 11, false, false, GameObject.ObjectType.EMPTY, Color.PINK);
		Clyde = new Ghost(5, 11, false, false, GameObject.ObjectType.EMPTY, Color.ORANGE);
		p1 = new Pellet(13, 1, false);
		p2 = new Pellet(1, 1, false);
		p3 = new Pellet(1, 13, false);
		p4 = new Pellet(13, 13, false);
		board2.add(Inky);
		board2.add(Blinky);
		board2.add(Pinky);
		board2.add(Clyde);
		board2.add(p1);
		board2.add(p2);
		board2.add(p3);
		board2.add(p4);
		board2.add(player);
	}

	private void initBoardList() {
		board2 = new ArrayList<GameObject>();
		for (int i = 0; i < 14; i++) {
			Add(GameObject.ObjectType.WALL, 0, i);
			Add(GameObject.ObjectType.WALL, 14, i + 1);
			Add(GameObject.ObjectType.WALL, i + 1, 0);
			Add(GameObject.ObjectType.WALL, i, 14);
		}
		for (int i = 0; i < 11; i++) {
			Add(GameObject.ObjectType.POINT, 1, i + 2);
			Add(GameObject.ObjectType.POINT, i + 2, 13);
			Add(GameObject.ObjectType.POINT, i + 2, 1);
			Add(GameObject.ObjectType.POINT, 13, i + 2);
			numPoints += 4;
		}
		for (int i = 0; i < 5; i++) {
			Add(GameObject.ObjectType.POINT, 3, i + 2);
			Add(GameObject.ObjectType.POINT, 6, i + 2);
			numPoints += 2;
			Add(GameObject.ObjectType.WALL, i + 2, 8);
			Add(GameObject.ObjectType.WALL, 4, i + 2);
			Add(GameObject.ObjectType.WALL, 5, i + 2);
			Add(GameObject.ObjectType.WALL, 7, i + 2);
			Add(GameObject.ObjectType.WALL, i + 7, 12);
			Add(GameObject.ObjectType.WALL, i + 8, 5);
			Add(GameObject.ObjectType.WALL, 7, i + 8);
		}
		for (int i = 0; i < 4; i++) {
			Add(GameObject.ObjectType.POINT, i + 3, 7);
			Add(GameObject.ObjectType.POINT, i + 2, 9);
			Add(GameObject.ObjectType.POINT, i + 8, 6);
			Add(GameObject.ObjectType.POINT, i + 8, 11);
			Add(GameObject.ObjectType.POINT, 8, i + 7);
			Add(GameObject.ObjectType.POINT, 11, i + 7);
			Add(GameObject.ObjectType.POINT, i + 9, 4);
			numPoints += 7;
			Add(GameObject.ObjectType.WALL, 7, i + 2);
			Add(GameObject.ObjectType.WALL, i + 9, 2);
			Add(GameObject.ObjectType.WALL, i + 9, 3);
			Add(GameObject.ObjectType.WALL, 9, i + 7);
			Add(GameObject.ObjectType.WALL, 10, i + 7);
			Add(GameObject.ObjectType.WALL, 12, i + 6);
			Add(GameObject.ObjectType.WALL, i + 2, 10);
			Add(GameObject.ObjectType.WALL, i + 2, 12);
			Add(GameObject.ObjectType.EMPTY, i + 2, 11);
		}
		for (int i = 0; i < 3; i++) {
			Add(GameObject.ObjectType.POINT, 8, i + 2);
			Add(GameObject.ObjectType.POINT, 6, i + 10);
			numPoints += 2;
			Add(GameObject.ObjectType.WALL, 12, i + 10);
			Add(GameObject.ObjectType.WALL, 2, i + 2);
			Add(GameObject.ObjectType.WALL, 2, i + 5);
		}
		Add(GameObject.ObjectType.POINT, 6, 9);
		numPoints++;
		Add(GameObject.ObjectType.EMPTY, 7, 7);
	}

	private void Add(GameObject.ObjectType type, int x, int y) {
		board2.add(CreateGameObject(type, x, y));
	}

	public void addEmpty(int x, int y) {
		Add(GameObject.ObjectType.EMPTY, x, y);
	}

	private GameObject CreateGameObject(GameObject.ObjectType type, int x, int y) {
		switch (type) {
		case EMPTY:
			return new EmptyGameObject(x, y);
		case GHOST:
			return new Ghost(x, y, false, false, type, Color.PINK);
		case PACMAN:
			return new PacMan(x, y, false, y);
		case PELLET:
			return new Pellet(x, y, false);
		case POINT:
			Point thisPoint = new Point(x, y, false);
			points.put(new Dimension(x, y), thisPoint);
			return new Point(x, y, false);
		case WALL:
			Wall thisWall = new Wall(x, y);
			walls.put(new Dimension(x, y), thisWall);
			return thisWall;
		default:
			throw new RuntimeException();
		}
	}

	public boolean isGhost(int x, int y) {
		return Pinky.xposition == x && Pinky.yposition == y || Inky.xposition == x && Inky.yposition == y
				|| Blinky.xposition == x && Blinky.yposition == y || Clyde.xposition == x && Clyde.yposition == y;
	}

	public boolean isPellet(int x, int y) {
		return p1.xposition == x && p1.yposition == y && !p1.isEaten
				|| p2.xposition == x && p2.yposition == y && !p2.isEaten
				|| p3.xposition == x && p3.yposition == y && !p3.isEaten
				|| p4.xposition == x && p4.yposition == y && !p4.isEaten;
	}

	public boolean isWall(int x, int y) {
		Dimension myPoint = new Dimension(x, y);
		return walls.containsKey(myPoint);
	}
	
	public boolean isPoint(int x, int y) {
		Dimension myPoint = new Dimension(x, y);
		return points.containsKey(myPoint);
	}

}
