import java.util.ArrayList;

public class World{
	ArrayList<GameObject> board2;

	PacMan player;
	Ghost Inky;
	Ghost Blinky;
	Ghost Pinky;
	Ghost Clyde;
	
	public World() {
		initBoardList();
		player = new PacMan(7, 6, false, 0);
		Inky = new Ghost(2, 11, false, false, GameObject.ObjectType.EMPTY);
		Blinky = new Ghost(3, 11, false, false, GameObject.ObjectType.EMPTY);
		Pinky = new Ghost(4, 11, false, false, GameObject.ObjectType.EMPTY);
		Clyde = new Ghost(5, 11, false, false, GameObject.ObjectType.EMPTY);
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
		}
		for (int i = 0; i < 5; i++) {
			Add(GameObject.ObjectType.POINT, 3, i + 2);
			Add(GameObject.ObjectType.POINT, 6, i + 2);
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
			Add(GameObject.ObjectType.WALL, 7, i + 2);
			Add(GameObject.ObjectType.WALL, i + 9, 2);
			Add(GameObject.ObjectType.WALL, i + 9, 3);
			Add(GameObject.ObjectType.WALL, 9, i + 7);
			Add(GameObject.ObjectType.WALL, 10, i + 7);
			Add(GameObject.ObjectType.WALL, 12, i + 6);
			Add(GameObject.ObjectType.WALL, i + 2, 10);
			Add(GameObject.ObjectType.WALL, i + 2, 12);
			Add(GameObject.ObjectType.GHOST, i + 2, 11);
		}
		for (int i = 0; i < 3; i++) {
			//Add(GameObject.ObjectType.POINT, i + 2, 8);
			Add(GameObject.ObjectType.POINT, 8, i + 2);
			//Add(GameObject.ObjectType.POINT, i + 10, 6);
			Add(GameObject.ObjectType.POINT, 6, i + 10);
			//Add(GameObject.ObjectType.WALL, i + 10, 12);
			Add(GameObject.ObjectType.WALL, 12, i + 10);
			//Add(GameObject.ObjectType.WALL, i + 2, 2);
			Add(GameObject.ObjectType.WALL, 2, i + 2);
			//Add(GameObject.ObjectType.WALL, i + 5, 2);
			Add(GameObject.ObjectType.WALL, 2, i + 5);
		}
		Add(GameObject.ObjectType.POINT, 13, 1);
		Add(GameObject.ObjectType.PELLET, 1, 1);
		Add(GameObject.ObjectType.PELLET, 1, 13);
		Add(GameObject.ObjectType.PELLET, 13, 13);
		//Add(GameObject.ObjectType.PELLET, 9, 6);
		Add(GameObject.ObjectType.POINT, 6, 9);
		Add(GameObject.ObjectType.PACMAN, 7, 7);
	}

	private void Add(GameObject.ObjectType type, int x, int y) {
		board2.add(CreateGameObject(type, x, y));
	}

	private GameObject CreateGameObject(GameObject.ObjectType type, int x, int y) {
		switch (type) {
		case EMPTY:
			return new EmptyGameObject(x, y);
		case GHOST:
			return new Ghost(x, y, false, false, type);
		case PACMAN:
			return new PacMan(x, y, false, y);
		case PELLET:
			return new Pellet(x, y);
		case POINT:
			return new Point(x, y);
		case WALL:
			return new Wall(x, y);
		default:
			throw new RuntimeException();
		}
	}

	// gets rid of objects; for example when pacman eats the pellet, it has to
	// disappear
	public void delete() {
	}

}
